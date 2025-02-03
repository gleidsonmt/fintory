package io.github.gleidsonmt.fintory.components.aside;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;

/**
 * @author Gleidson Neves da Silveira | gleidisonmt@gmail.com
 * Create on  01/02/2025
 */
public class Logo extends VBox {

    public Logo() {
        setStyle("-fx-background-color: -green");
        setMaxWidth(Region.USE_PREF_SIZE);
        Region rect = new Region();
        rect.setMinSize(10, 10);
        setPadding(new Insets(10));
        rect.setStyle("-fx-background-color: black;");
        setMinWidth(40);
        setMinHeight(40);
        setAlignment(Pos.CENTER);
        getChildren().add(rect);
    }
}
