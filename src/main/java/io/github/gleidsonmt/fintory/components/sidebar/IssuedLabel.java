package io.github.gleidsonmt.fintory.components.sidebar;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;

/**
 * @author Gleidson Neves da Silveira | gleidisonmt@gmail.com
 * Create on  01/02/2025
 */
public class IssuedLabel extends HBox {
    public IssuedLabel(int times) {
        setAlignment(Pos.CENTER_LEFT);
        Text text = new Text("Issued access");
        text.setStyle("-fx-font-family: Poppins Light;");
        Label legend = new Label(String.valueOf(times));
        legend.setPadding(new Insets(5));
        legend.setStyle("-fx-background-color: -light-gray-2; -fx-background-radius: 5px; -fx-font-weight: bold;");
        this.getChildren().setAll(text, legend);
        setSpacing(10);
    }
}
