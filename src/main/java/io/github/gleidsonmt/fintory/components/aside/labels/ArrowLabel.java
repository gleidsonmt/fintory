package io.github.gleidsonmt.fintory.components.aside.labels;

import io.github.gleidsonmt.glad.controls.icon.Icon;
import io.github.gleidsonmt.glad.controls.icon.SVGIcon;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;

/**
 * @author Gleidson Neves da Silveira | gleidisonmt@gmail.com
 * Create on  02/02/2025
 */
public class ArrowLabel extends Label {

    public ArrowLabel(String text) {
        setText(text);
        setGraphic(new SVGIcon(Icon.CHEVRON_RIGHT));
        setContentDisplay(ContentDisplay.RIGHT);
        setGraphicTextGap(10);
    }
}
