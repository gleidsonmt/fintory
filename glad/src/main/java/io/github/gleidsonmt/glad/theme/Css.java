package io.github.gleidsonmt.glad.theme;

/**
 * @author Gleidson Neves da Silveira | gleidisonmt@gmail.com
 * Create on  31/01/2025
 */
public enum Css {

    COLORS("colors.css"),
    PROPERTIES("properties.css"),
    BOOTSTRAP("bootstrap.css"),
    SHAPES("shapes.css"),
    IMMERSIVE_SCROLL("immersive_scroll.css"),
    TYPOGRAPHIC("typographic.css");

    private String url;

    Css(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
