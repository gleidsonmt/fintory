package io.github.gleidsonmt.fintory.components.sidebar;

import io.github.gleidsonmt.fintory.model.Card;
import javafx.geometry.Pos;
import javafx.scene.control.Separator;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;

import java.util.List;

/**
 * @author Gleidson Neves da Silveira | gleidisonmt@gmail.com
 * Create on  01/02/2025
 */
public class SideBar extends VBox {

    public SideBar(List<Card> cards) {
        setMinWidth(400);
        setMaxWidth(400);
        BorderPane.setAlignment(this, Pos.CENTER_LEFT);
        setPrefWidth(Region.USE_COMPUTED_SIZE);

        getChildren().setAll(new Header(), new Separator(), new CardList(cards));
        getStyleClass().addAll("border", "border-r-1", "border-light-gray-2");
        setStyle("-fx-background-color: -light-gray");
    }
}
