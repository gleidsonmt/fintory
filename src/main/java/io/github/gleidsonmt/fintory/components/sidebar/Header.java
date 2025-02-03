package io.github.gleidsonmt.fintory.components.sidebar;

import io.github.gleidsonmt.glad.controls.icon.Icon;
import io.github.gleidsonmt.glad.controls.icon.SVGIcon;
import javafx.geometry.Insets;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

/**
 * @author Gleidson Neves da Silveira | gleidisonmt@gmail.com
 * Create on  01/02/2025
 */
public class Header extends GridPane {
    public Header() {
        VBox.setMargin(this, new Insets(40));
        Text title = new Text("Cards List");
        title.getStyleClass().addAll("bold", "text-24");

        SVGIcon plus = new SVGIcon(Icon.ADD);
        SVGIcon filter = new SVGIcon(Icon.FILTER);

        setHgap(20);

        add(title, 0,0);
        add(filter, 1,0);
        add(plus, 2,0);
        GridPane.setHgrow(title, Priority.ALWAYS);
    }
}
