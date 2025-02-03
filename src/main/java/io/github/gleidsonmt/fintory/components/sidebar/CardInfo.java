package io.github.gleidsonmt.fintory.components.sidebar;

import io.github.gleidsonmt.fintory.model.Card;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

/**
 * @author Gleidson Neves da Silveira | gleidisonmt@gmail.com
 * Create on  01/02/2025
 */
public class CardInfo extends GridPane {

    public CardInfo(Card card) {
//        setGridLinesVisible(true);
        Text title = new Text(card.name());
        title.getStyleClass().addAll("text-14");
        StatusLabel statusLabel = new StatusLabel(card.status());
        IssuedLabel issuedLabel = new IssuedLabel((int) card.issuedTimes());

        setPadding(new Insets(0,0,0,40));
        setAlignment(Pos.CENTER_LEFT);
        add(title, 0,0);
        add(statusLabel, 0,1);
        add(issuedLabel, 0,2);

    }
}
