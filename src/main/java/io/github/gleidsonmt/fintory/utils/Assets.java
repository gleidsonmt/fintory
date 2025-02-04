package io.github.gleidsonmt.fintory.utils;

import io.github.gleidsonmt.fintory.App;
import javafx.scene.image.Image;

import java.util.Objects;

/**
 * @author Gleidson Neves da Silveira | gleidisonmt@gmail.com
 * Create on  01/02/2025
 * v. 1.0
 */
public class Assets {

    public static Image getImage(String name) {
        return new Image(Objects.requireNonNull(App.class.getResource("img/" + name)).toExternalForm());
    }

    public static Image getImage(String name, int size) {
        return new Image(Objects.requireNonNull(App.class.getResource("img/" + name)).toExternalForm(), size, size, true, true);
    }

    public static String getCSS(String name) {
        return Objects.requireNonNull(Objects.requireNonNull(App.class.getResource("css/" + name)).toExternalForm());
    }
}
