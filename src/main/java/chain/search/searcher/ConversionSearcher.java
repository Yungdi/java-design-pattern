package chain.search.searcher;

import chain.search.analyzer.WeMakeAnalyzer;

public class ConversionSearcher extends Searcher {

    @Override
    String convert(String keyword) {
        WeMakeAnalyzer analyzer = new WeMakeAnalyzer();
        analyzer.setKeyword(keyword);
        return this.analyze(analyzer::convertKoreanOrEnglish);
    }

}
