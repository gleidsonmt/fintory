package io.github.gleidsonmt.fintory.components.drawer;

import javafx.geometry.Insets;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;

/**
 * @author Gleidson Neves da Silveira | gleidisonmt@gmail.com
 * Create on  01/02/2025
 */
public class Drawer extends VBox {

    public Drawer() {
//        setMinWidth(280);

        setPrefWidth(Region.USE_COMPUTED_SIZE);
        setPadding(new Insets(30));
        setStyle("-fx-background-color: -fx-accent;");
        getChildren().addAll(new Header(), new DrawerContent(), new Footer());
    }
}
