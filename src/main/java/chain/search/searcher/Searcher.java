package chain.search.searcher;

import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;

import java.util.function.Supplier;

public abstract class Searcher {
    private Searcher nextSearcher;

    public Searcher nextSearcher(Searcher nextSearcher) {
        this.nextSearcher = nextSearcher;
        return this;
    }

    public final SearchResponse search(String keyword) {
        // 분석
        String analyzedKeyword = this.convert(keyword);
        // 검색 요청
        SearchRequest request = null;
        // 검색 결과
        SearchResponse response = null;
        // 결과 없으면 다음 검색
        if (response.getHits().totalHits == 0 && this.nextSearcher != null)
            return nextSearcher.search(analyzedKeyword);
        else
            return response;
    }

    final String analyze(Supplier<String> supplier) {
        String convertedKeyword;
        try {
            convertedKeyword = supplier.get();
            if (convertedKeyword == null)
                return "";
        } catch (Exception e) {
//            log.error("converting error by NLPAnalyzer: {}", e.toString());
            convertedKeyword = "";
        }
        return convertedKeyword;
    }

    abstract String convert(String keyword);

}
