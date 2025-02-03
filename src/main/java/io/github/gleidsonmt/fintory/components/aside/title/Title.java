package io.github.gleidsonmt.fintory.components.aside.title;

import javafx.scene.text.Text;

/**
 * @author Gleidson Neves da Silveira | gleidisonmt@gmail.com
 * Create on  02/02/2025
 */
public class Title extends Text {

    public Title(String title) {
        super(title);
        getStyleClass().addAll("text-14", "bold");
    }
}
