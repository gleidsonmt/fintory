package io.github.gleidsonmt.fintory.components.drawer;

import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;

/**
 * @author Gleidson Neves da Silveira | gleidisonmt@gmail.com
 * Create on  01/02/2025
 */
public class Header extends HBox {



    public Header() {
        Text title = new Text("Fintory");
        title.setOpacity(0.8);
        title.getStyleClass().addAll("bold", "text-18", "text-white");
        Logo logo = new Logo();

        setAlignment(Pos.CENTER_LEFT);
        setMinHeight(80);
        setSpacing(10);
        getChildren().addAll(logo, title);
    }
}
