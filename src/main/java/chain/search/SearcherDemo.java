package chain.search;

import chain.search.searcher.ConversionSearcher;
import chain.search.searcher.CorrectionSearcher;
import chain.search.searcher.GeneralSearcher;
import chain.search.searcher.Searcher;

public class SearcherDemo {

    public static void main(String[] args) {
        Searcher searcher = new GeneralSearcher()
                .nextSearcher(new CorrectionSearcher())
                .nextSearcher(new ConversionSearcher());

        searcher.search("테스트");
    }

}
