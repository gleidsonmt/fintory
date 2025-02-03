package io.github.gleidsonmt.fintory.components.drawer;

import io.github.gleidsonmt.glad.controls.icon.SVGIcon;
import javafx.geometry.Pos;
import javafx.scene.control.ToggleButton;

/**
 * @author Gleidson Neves da Silveira | gleidisonmt@gmail.com
 * Create on  01/02/2025
 */
public class DrawerItem extends ToggleButton {

    public DrawerItem(String text) {
        this(text, null);
    }

    public DrawerItem(String text, SVGIcon icon) {
        setGraphicTextGap(10);
        setAlignment(Pos.CENTER_LEFT);
        setMaxWidth(Double.MAX_VALUE);
        setText(text);
        setGraphic(icon);
        getStyleClass().addAll("drawer-item");
    }
}
