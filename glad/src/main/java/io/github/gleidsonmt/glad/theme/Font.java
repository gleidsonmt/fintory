package io.github.gleidsonmt.glad.theme;

/**
 * @author Gleidson Neves da Silveira | gleidisonmt@gmail.com
 * Create on  01/02/2025
 */
public enum Font {

    POPPINS("poppins.css");

    private String url;

    Font(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

}
