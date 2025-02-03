package io.github.gleidsonmt.fintory.components.drawer;

import io.github.gleidsonmt.glad.controls.icon.Icon;
import io.github.gleidsonmt.glad.controls.icon.SVGIcon;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Separator;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

/**
 * @author Gleidson Neves da Silveira | gleidisonmt@gmail.com
 * Create on  01/02/2025
 */
public class Footer extends VBox {


    public Footer() {
        VBox.setVgrow(this, Priority.ALWAYS);
        setAlignment(Pos.BOTTOM_CENTER);
        DrawerItem help = new DrawerItem("Help", new SVGIcon(Icon.HELP));
        DrawerItem logout = new DrawerItem("Log Out", new SVGIcon(Icon.LOG_OUT));
        ToggleGroup group = new ToggleGroup();
        group.getToggles().setAll(help, logout);
        Separator separator = new Separator();
        VBox.setMargin(separator, new Insets(20,0,20,0));
        getChildren().setAll(help, logout, separator, new UserInfo());
    }
}
