package io.github.gleidsonmt.fintory.components.sidebar;

import io.github.gleidsonmt.fintory.model.Status;
import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;

/**
 * @author Gleidson Neves da Silveira | gleidisonmt@gmail.com
 * Create on  01/02/2025
 */
public class StatusLabel extends HBox {
    public StatusLabel(Status status) {
        setAlignment(Pos.CENTER_LEFT);
        Text text = new Text(status.toString());
        Circle circle = new Circle();
        circle.setRadius(3);
        this.getChildren().setAll(circle, text);
        setSpacing(7);
    }
}
