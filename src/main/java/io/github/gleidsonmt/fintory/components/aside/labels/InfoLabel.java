package io.github.gleidsonmt.fintory.components.aside.labels;

import javafx.scene.text.Text;

/**
 * @author Gleidson Neves da Silveira | gleidisonmt@gmail.com
 * Create on  02/02/2025
 */
public class InfoLabel extends Text {

    public InfoLabel(String text) {
        super(text);
        getStyleClass().addAll("info-text");
    }
}
