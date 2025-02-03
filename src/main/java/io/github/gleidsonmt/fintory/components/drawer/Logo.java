package io.github.gleidsonmt.fintory.components.drawer;

import javafx.geometry.Pos;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.CubicCurve;

/**
 * @author Gleidson Neves da Silveira | gleidisonmt@gmail.com
 * Create on  01/02/2025
 */
public class Logo extends StackPane {
    public Logo() {
//        setPadding(new Insets(10));
        getStyleClass().add("logo");
        setAlignment(Pos.CENTER);
        Circle circle = new Circle();
        circle.setStroke(Color.WHITE);
        circle.setFill(Color.WHITE);
        circle.setRadius(13);
        CubicCurve cubicCurve = new CubicCurve();
        cubicCurve.setStyle("-fx-fill: -elegant;");
        cubicCurve.setStartX(-30);
        cubicCurve.setStartY(-30);
        cubicCurve.setEndX(5);
        cubicCurve.setEndY(-38);
        cubicCurve.setControlX1(-13);
        cubicCurve.setControlY1(-65);
        cubicCurve.setControlX2(-13);
        cubicCurve.setControlY2(-5);
        cubicCurve.setRotate(20);
        getChildren().setAll(circle, cubicCurve);

    }
}
