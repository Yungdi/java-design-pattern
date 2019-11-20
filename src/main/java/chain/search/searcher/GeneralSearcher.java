package chain.search.searcher;

public class GeneralSearcher extends Searcher {
    @Override
    String convert(String keyword) {
        return "lowerCase";
    }
}
