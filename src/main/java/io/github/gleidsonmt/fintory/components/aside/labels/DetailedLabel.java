package io.github.gleidsonmt.fintory.components.aside.labels;

import io.github.gleidsonmt.fintory.model.Recurse;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

/**
 * @author Gleidson Neves da Silveira | gleidisonmt@gmail.com
 * Create on  02/02/2025
 */
public class DetailedLabel extends GridPane {

    public DetailedLabel(String text, Recurse recurse) {
        InfoLabel infoLabel = new InfoLabel(text);
        Label label = new Label(recurse.name().toLowerCase());
        label.setStyle("-fx-background-color: -light-gray; -fx-padding: 6px; -fx-font-size: 8pt; -fx-font-family: \"Poppins SemiBold;\"");
        add(infoLabel,0,0);
        add(label,1,0);
        setHgap(10);
    }
}
