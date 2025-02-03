package io.github.gleidsonmt.fintory.components.drawer;

import io.github.gleidsonmt.glad.controls.avatar.AvatarCircleView;
import io.github.gleidsonmt.fintory.utils.Assets;
import javafx.geometry.Insets;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.text.Text;

/**
 * @author Gleidson Neves da Silveira | gleidisonmt@gmail.com
 * Create on  01/02/2025
 */
public class UserInfo extends GridPane {

    public UserInfo() {
        setPadding(new Insets(10));
        AvatarCircleView avatarCircleView = new AvatarCircleView();
        avatarCircleView.setImage(Assets.getImage("jensen.png", 100));
        avatarCircleView.setRadius(20);
        avatarCircleView.getStyleClass().add("depth-1");

        setHgap(10);

        Text title = new Text("Jensen Ackles");
        title.getStyleClass().addAll("text-white", "text-14", "bold");
        Text email = new Text("super@gmail.com");
        email.getStyleClass().add("text-white");

        add(avatarCircleView, 0,0);
        add(title, 1,0);
        add(email, 1,1);

        GridPane.setVgrow(avatarCircleView, Priority.ALWAYS);
        GridPane.setRowSpan(avatarCircleView, 2);
    }
}
