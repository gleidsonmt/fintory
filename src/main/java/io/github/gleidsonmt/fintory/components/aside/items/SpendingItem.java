package io.github.gleidsonmt.fintory.components.aside.items;

import io.github.gleidsonmt.glad.controls.icon.Icon;
import io.github.gleidsonmt.glad.controls.icon.SVGIcon;
import javafx.application.Platform;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.*;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

/**
 * @author Gleidson Neves da Silveira | gleidisonmt@gmail.com
 * Create on  02/02/2025
 */
public class SpendingItem extends GridPane {

    public SpendingItem() {
        ColumnConstraints col1 = new ColumnConstraints();
        col1.setPercentWidth(61);
        ColumnConstraints col2 = new ColumnConstraints();
        col2.setPercentWidth(39);

        getColumnConstraints().addAll(col1, col2);

        GridPane first = createFirstSection();
        StackPane second = createSecondSection();

        add(first, 0, 0);
        add(second, 1, 0);

        setHgap(30);
    }

    private GridPane createFirstSection() {
        GridPane grid = new GridPane();
        Text title = new Text("Spending limits");
        title.getStyleClass().addAll("text-14", "bold");
        Text subtitle = new Text("DAILY TRANSACTION LIMIT");
        subtitle.getStyleClass().addAll("info-text");

        ProgressBar progressBar = new ProgressBar();
        progressBar.setProgress(0.1);
        Text legend = new Text("$199.00 spent of $2,000.00");
        legend.getStyleClass().add("legend");
        Text percent = new Text("10%");

        grid.add(title, 0,0);
        grid.add(subtitle, 0,1);
        grid.add(progressBar, 0,2);
        grid.add(legend, 0,3);
        grid.add(percent, 1,3);

        progressBar.setPrefWidth(2000);
        GridPane.setColumnSpan(progressBar, 2);

        GridPane.setValignment(title, VPos.TOP);

        RowConstraints row1 = new RowConstraints();
        row1.setPrefHeight(50);
        RowConstraints row2 = new RowConstraints();
        row2.setPrefHeight(30);
        RowConstraints row3 = new RowConstraints();
        row3.setPrefHeight(30);
        RowConstraints row4 = new RowConstraints();
        row4.setPrefHeight(25);

        grid.getRowConstraints().setAll(row1, row2, row3, row4);

        ColumnConstraints col1 = new ColumnConstraints();
        col1.setPercentWidth(90);
        ColumnConstraints col2 = new ColumnConstraints();
        col2.setPercentWidth(10);
        col2.setHalignment(HPos.RIGHT);
        grid.getColumnConstraints().setAll(col1, col2);

        return grid;
    }

    private StackPane createSecondSection() {
        StackPane pane = new StackPane();
        pane.getStyleClass().add("custom-card");
        Text title = new Text("Estimated amount\nfor this month:");
        title.getStyleClass().add("text-12");
        Text subtitle = new Text("$2,920.00");
        subtitle.getStyleClass().addAll("bold", "text-14");
        Button arrowButton = new Button();
        arrowButton.setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
        arrowButton.setGraphic(new SVGIcon(Icon.ARROW_BACK));
        VBox container = new VBox(title, subtitle);
        container.setSpacing(20);
        container.setPadding(new Insets(30));
        pane.getChildren().setAll(container, arrowButton);
        StackPane.setAlignment(arrowButton, Pos.BOTTOM_RIGHT);

        Platform.runLater(() -> {

            Rectangle rect = new Rectangle();
            rect.widthProperty().bind(pane.widthProperty());
            rect.heightProperty().bind(pane.heightProperty());
            pane.setClip(rect);
            rect.setManaged(false);
        });

        return pane;
    }
}
