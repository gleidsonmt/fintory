package io.github.gleidsonmt.fintory.components.drawer;

import io.github.gleidsonmt.glad.controls.icon.Icon;
import io.github.gleidsonmt.glad.controls.icon.SVGIcon;
import javafx.geometry.Pos;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;

/**
 * @author Gleidson Neves da Silveira | gleidisonmt@gmail.com
 * Create on  01/02/2025
 */
public class DrawerContent extends VBox {

    public DrawerContent() {
        setAlignment(Pos.CENTER_LEFT);
        ToggleButton home = new DrawerItem("Home", new SVGIcon(Icon.HOME_FILLED));
        ToggleButton settings = new DrawerItem("Settings", new SVGIcon(Icon.SETTINGS_FILLED));
        ToggleButton team = new DrawerItem("Team", new SVGIcon(Icon.GROUP_2_FILLED));
        ToggleGroup group = new ToggleGroup();
        ToggleButton payments = new DrawerItem("Payments", new SVGIcon(Icon.PAYMENT_FILLED));
        ToggleButton cards = new DrawerItem("Cards", new SVGIcon(Icon.CREDIT_CARD_FILLED));
        ToggleButton accounts = new DrawerItem("Accounts", new SVGIcon(Icon.LAYER_FILLED));
        group.getToggles().addAll(home, accounts, cards, payments, team, settings);
        getChildren().setAll(home, accounts, cards, payments, team, settings);
        group.selectToggle(cards);
    }
}
