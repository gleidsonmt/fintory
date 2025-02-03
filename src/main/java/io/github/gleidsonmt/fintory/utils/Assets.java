package io.github.gleidsonmt.fintory.utils;

import io.github.gleidsonmt.fintory.App;
import javafx.scene.image.Image;

/**
 * @author Gleidson Neves da Silveira | gleidisonmt@gmail.com
 * Create on  01/02/2025
 */
public class Assets {

    public static Image getImage(String name) {
        return new Image(App.class.getResource("img/"+ name).toExternalForm());
    }

    public static Image getImage(String name, int size) {
        return new Image(App.class.getResource("img/" + name).toExternalForm(), size, size, true, true);
    }

}
