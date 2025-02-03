package io.github.gleidsonmt.fintory.components.sidebar;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

import java.text.DecimalFormat;

/**
 * @author Gleidson Neves da Silveira | gleidisonmt@gmail.com
 * Create on  01/02/2025
 */
public class CanvaCard extends VBox {

    public CanvaCard(double cardNumber) {
        setAlignment(Pos.CENTER);
        setMaxWidth(100);
        setMinWidth(100);
        setMinHeight(80);
        setMaxHeight(80);

        getStyleClass().add("card");
        VBox.setMargin(this, new Insets(20));

        Region banner = new Region();
        VBox.setMargin(banner, new Insets(10,0,10,0));
        banner.getStyleClass().add("banner");

        DecimalFormat df = new DecimalFormat("0.##");
        Text number = new Text(df.format(cardNumber));

        VBox.setMargin(number, new Insets(10));

        getChildren().addAll(banner, number);

    }
}
