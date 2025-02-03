package io.github.gleidsonmt.fintory.components.aside;

import javafx.scene.Node;
import javafx.scene.layout.VBox;

/**
 * @author Gleidson Neves da Silveira | gleidisonmt@gmail.com
 * Create on  02/02/2025
 */
public class AsideSection extends VBox {

    public AsideSection(Node content) {
        this(null, content);
    }

    public AsideSection(Node title, Node content) {
        this(title, content, 10);
    }

    public AsideSection(Node title, Node content, double spacing) {
        if (title != null) {
            getChildren().setAll(title, content);
        } else {
            getChildren().setAll(content);
        }
        setSpacing(spacing);
    }
}
