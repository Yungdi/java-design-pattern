package chain.search.analyzer;

public class WeMakeAnalyzer {
    private String keyword;

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String convertKoreanOrEnglish() {
        return "korean";
    }

    public String convertTypo() {
        return "typo";
    }
}