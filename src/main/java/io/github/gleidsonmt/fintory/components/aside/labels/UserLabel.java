package io.github.gleidsonmt.fintory.components.aside.labels;

import io.github.gleidsonmt.glad.controls.avatar.AvatarCircleView;
import io.github.gleidsonmt.fintory.utils.Assets;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

/**
 * @author Gleidson Neves da Silveira | gleidisonmt@gmail.com
 * Create on  02/02/2025
 */
public class UserLabel extends GridPane {

    public UserLabel(String name, String avatar) {
        AvatarCircleView avatarCircleView = new AvatarCircleView();
        avatarCircleView.setStroke(Color.TRANSPARENT);
        avatarCircleView.setRadius(20);
        avatarCircleView.setImage(Assets.getImage(avatar, 100));
        Text title = new Text(name);

        setHgap(10);
        add(avatarCircleView, 0,0);
        add(title, 1,0);
        title.setStyle("-fx-font-family: \"Poppins SemiBold\";");

//        GridPane.setMargin(avatarCircleView, new Insets(20,0,10,0));



    }
}
