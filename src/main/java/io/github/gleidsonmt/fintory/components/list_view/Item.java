package io.github.gleidsonmt.fintory.components.list_view;

import javafx.geometry.HPos;
import javafx.scene.Node;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;

/**
 * @author Gleidson Neves da Silveira | gleidisonmt@gmail.com
 * Create on  02/02/2025
 */
public class Item extends GridPane {

    public Item(Node left, Node center, Node right) {
        add(left, 0,0);
        add(center, 1,0);
        add(right, 2,0);
        createConstraints();
    }

    private void createConstraints() {
        for (int i = 0; i < 3; i++) {
            ColumnConstraints col1 = new ColumnConstraints();
            col1.setPercentWidth(100);
            getColumnConstraints().add(col1);
        }

        getColumnConstraints().get(1).setHalignment(HPos.CENTER);
        getColumnConstraints().get(2).setHalignment(HPos.RIGHT);
    }

}
