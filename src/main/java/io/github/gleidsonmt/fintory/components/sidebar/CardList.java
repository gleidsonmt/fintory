package io.github.gleidsonmt.fintory.components.sidebar;

import io.github.gleidsonmt.fintory.model.Card;
import javafx.scene.control.Separator;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;

import java.util.List;

/**
 * @author Gleidson Neves da Silveira | gleidisonmt@gmail.com
 * Create on  01/02/2025
 */
public class CardList extends VBox {

    public CardList(List<Card> cards) {

        ToggleGroup group = new ToggleGroup();

        cards.forEach(el -> {
            CardItem cardItem = new CardItem(el);
            group.getToggles().add(cardItem);
            getChildren().add(cardItem);
            getChildren().add(new Separator());
        });

        group.selectToggle(group.getToggles().get(2));
//        getChildren().get(4).getStyleClass().add("card-selected");
    }
}
