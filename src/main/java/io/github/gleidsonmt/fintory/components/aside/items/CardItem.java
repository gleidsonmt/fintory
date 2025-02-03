package io.github.gleidsonmt.fintory.components.aside.items;

import io.github.gleidsonmt.glad.controls.icon.Icon;
import io.github.gleidsonmt.glad.controls.icon.SVGIcon;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.VPos;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Text;

/**
 * @author Gleidson Neves da Silveira | gleidisonmt@gmail.com
 * Create on  02/02/2025
 */
public class CardItem extends GridPane {

    public CardItem() {

        GridPane cardNumberItem = cardNumberItem();
        GridPane cardExpireItem = cardExpireItem();
        GridPane cardCvc = cardCvc();
        GridPane cardStatus = cardStatus();

        setHgap(20);

        add(cardNumberItem, 0,0);
        add(createSeparator(), 1,0);
        add(cardExpireItem, 2,0);
        add(createSeparator(), 3,0);
        add(cardCvc, 4,0);
        add(createSeparator(), 5,0);
        add(cardStatus, 6,0);

        getChildren().forEach(e -> {
            ColumnConstraints col1 = new ColumnConstraints();
            col1.setFillWidth(true);
            col1.setHgrow(Priority.ALWAYS);
            getColumnConstraints().add(col1);
        });
    }

    private Separator createSeparator() {
        Separator separator = new Separator(Orientation.VERTICAL);
        GridPane.setRowSpan(separator, REMAINING);
        GridPane.setHalignment(separator, HPos.RIGHT);
        return separator;
    }

    private GridPane createGrid() {
        GridPane grid = new GridPane();

        RowConstraints row1 = new RowConstraints();
        row1.setMinHeight(20);
        row1.setPrefHeight(20);
        row1.setMaxHeight(20);
        grid.getRowConstraints().add(row1);

        RowConstraints row2 = new RowConstraints();
        row2.setMinHeight(20);
        row2.setPrefHeight(20);
        row2.setMaxHeight(20);
        grid.getRowConstraints().add(row2);

        grid.setHgap(10);
        grid.setVgap(10);
        return grid;
    }

    private GridPane cardNumberItem() {
        GridPane grid = createGrid();
        Text title = new Text("CARD NUMBER");
        Text number = new Text("5540 2280 8647 5687");
        number.setStyle("-fx-fill: -elegant; -fx-font-weight: bold;");
        SVGIcon icon = new SVGIcon(Icon.COPY);
        title.getStyleClass().add("info-text");
        grid.add(title, 0,0);
        grid.add(number, 0,1);
        grid.add(icon, 1,1);

//        grid.add(createSeparator(), 2, 0);

        grid.setHgap(10);
//        grid.setGridLinesVisible(true);
        return grid;
    }

    private GridPane cardExpireItem() {
        GridPane grid = createGrid();
        Text title = new Text("EXPIRE DATE");
        Text date = new Text("08/28");
        title.getStyleClass().add("info-text");
        date.setStyle("-fx-fill: -elegant; -fx-font-weight: bold;");
        grid.add(title, 0,0);
        grid.add(date, 0,1);
        grid.setHgap(10);
//        grid.setGridLinesVisible(true);
        return grid;
    }

    private GridPane cardCvc() {
        GridPane grid = createGrid();
        Text title = new Text("CVC");
        Label date = new Label("***");
        SVGIcon icon = new SVGIcon(Icon.VISIBILITY);
        date.setStyle("-fx-fill: -elegant; -fx-font-weight: bold;");
        date.getStyleClass().add("text-18");
        title.getStyleClass().add("info-text");
        grid.add(title, 0,0);
        grid.add(date, 0,1);
        grid.add(icon, 1,1);

        date.setPadding(new Insets(4,0,0,0));

        GridPane.setColumnSpan(title, REMAINING);
        GridPane.setValignment(date, VPos.CENTER);
        return grid;
    }

    private GridPane cardStatus() {
        GridPane grid = createGrid();
        Text title = new Text("STATUS");
        Text date = new Text("Virtual");
        date.getStyleClass().add("bold");
        title.getStyleClass().add("info-text");
        grid.add(title, 0,0);
        grid.add(date, 0,1);

//        grid.setGridLinesVisible(true);
        return grid;
    }
}
