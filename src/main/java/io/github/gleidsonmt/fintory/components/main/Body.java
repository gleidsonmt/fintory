package io.github.gleidsonmt.fintory.components.main;

import io.github.gleidsonmt.fintory.components.aside.Aside;
import io.github.gleidsonmt.fintory.components.sidebar.SideBar;
import io.github.gleidsonmt.fintory.model.Card;
import javafx.scene.layout.HBox;

import java.util.List;

/**
 * @author Gleidson Neves da Silveira | gleidisonmt@gmail.com
 * Create on  02/02/2025
 */
public class Body extends HBox {

    public Body(List<Card> cards) {
        getChildren().setAll(new SideBar(cards), new Aside(cards.get(2)));
    }
}
