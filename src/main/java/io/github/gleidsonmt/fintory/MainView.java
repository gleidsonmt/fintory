package io.github.gleidsonmt.fintory;

import io.github.gleidsonmt.glad.base.Container;
import io.github.gleidsonmt.fintory.components.drawer.Drawer;
import io.github.gleidsonmt.fintory.components.main.Body;
import io.github.gleidsonmt.fintory.model.Card;
import io.github.gleidsonmt.fintory.model.Status;

import java.util.List;

/**
 * @author Gleidson Neves da Silveira | gleidisonmt@gmail.com
 * Create on  01/02/2025
 */
public class MainView extends Container {

    public MainView() {

        List<Card> cards = List.of(
                new Card("Basic Corporate", Status.ACTIVE, 2, 4292),
                new Card("Inventory CanvaCard", Status.ACTIVE, 3, 0682d),
                new Card("Software subscriptions", Status.ACTIVE, 2, 5687),
                new Card("Traveling card", Status.ACTIVE, 3, 8042),
                new Card("Project \"Catana\"", Status.INACTIVE, 1, 5820)
        );

        setPrefSize(1336, 768);

        setLeft(new Drawer());
//        setCenter(new SideBar(cards));
//        setRight(new Aside(cards.get(2)));
        setCenter(new Body(cards));


    }
}
