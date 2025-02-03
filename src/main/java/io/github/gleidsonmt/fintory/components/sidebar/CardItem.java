package io.github.gleidsonmt.fintory.components.sidebar;

import io.github.gleidsonmt.fintory.model.Card;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;

/**
 * @author Gleidson Neves da Silveira | gleidisonmt@gmail.com
 * Create on  01/02/2025
 */
public class CardItem extends ToggleButton {

    public CardItem(Card card) {
//        setGridLinesVisible(true);
//        getStyleClass().addAll("border-b-1", "border-light-gray-2");

        GridPane container = new GridPane();

        setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
        setGraphic(container);
        getStyleClass().add("card-item");

        setPadding(new Insets(0));
        CardInfo cardInfo = new CardInfo(card);
        CanvaCard canvaCard = new CanvaCard(card.cardNumber());

        ColumnConstraints col1 = new ColumnConstraints();
        col1.setPercentWidth(75);
        col1.setHalignment(HPos.CENTER);
        ColumnConstraints col2 = new ColumnConstraints();
        col2.setPercentWidth(25);
        container.getColumnConstraints().addAll(col1, col2);

        RowConstraints rowConstraints = new RowConstraints();
        rowConstraints.setPrefHeight(100);
        rowConstraints.setValignment(VPos.CENTER);
        container.getRowConstraints().add(rowConstraints);

        container.add(cardInfo, 0,0);
        container.add(canvaCard, 1,0);

        GridPane.setHalignment(canvaCard, HPos.RIGHT);
        GridPane.setValignment(canvaCard, VPos.BOTTOM);

//        GridPane.setHgrow(cardInfo, Priority.ALWAYS);
//        GridPane.setVgrow(cardInfo, Priority.ALWAYS);

        GridPane.setHalignment(cardInfo, HPos.LEFT);
        GridPane.setValignment(cardInfo, VPos.CENTER);
    }
}
