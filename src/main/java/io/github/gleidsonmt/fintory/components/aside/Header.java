package io.github.gleidsonmt.fintory.components.aside;

import io.github.gleidsonmt.glad.controls.icon.Icon;
import io.github.gleidsonmt.glad.controls.icon.SVGIcon;
import io.github.gleidsonmt.fintory.components.aside.items.CardItem;
import io.github.gleidsonmt.fintory.model.Card;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.text.Text;

/**
 * @author Gleidson Neves da Silveira | gleidisonmt@gmail.com
 * Create on  01/02/2025
 */
public class Header extends GridPane {

    public Header(Card card) {
        setHgap(20);
        Text title = new Text(card.name());
        title.getStyleClass().add("text-24");
        Logo logo = new Logo();
        Button button = new Button("Manage");
        button.getStyleClass().add("button-manage");
        button.setGraphicTextGap(10);
        SVGIcon icon = new SVGIcon(Icon.MORE_HOZ);
        button.setGraphic(icon);
        button.setContentDisplay(ContentDisplay.RIGHT);
        add(logo, 0,0);
        add(title, 1,0);
        add(button, 2,0);

        CardItem cardItem = new CardItem();
        add(cardItem, 0,1);

        GridPane.setMargin(cardItem, new Insets(40,0,0,0));

        GridPane.setHgrow(title, Priority.ALWAYS);
        GridPane.setColumnSpan(cardItem, REMAINING);
    }
}
