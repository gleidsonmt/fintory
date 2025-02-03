package io.github.gleidsonmt.fintory.components.aside.title;

import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;


/**
 * @author Gleidson Neves da Silveira | gleidisonmt@gmail.com
 * Create on  02/02/2025
 */
public class CountableTitle extends GridPane {

    public CountableTitle(String _title, int _times) {
        Title title = new Title(_title);
        Label times = new Label(String.valueOf(_times));
        add(title, 0,0);
        add(times, 1,0);
        setHgap(10);

        times.setStyle("-fx-background-color: -light-gray; -fx-padding: 6px;");
        times.getStyleClass().addAll("bold");

    }

}
