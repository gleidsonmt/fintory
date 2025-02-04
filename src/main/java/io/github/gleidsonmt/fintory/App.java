package io.github.gleidsonmt.fintory;

import io.github.gleidsonmt.fintory.utils.Assets;
import io.github.gleidsonmt.glad.base.Container;
import io.github.gleidsonmt.glad.base.Root;
import io.github.gleidsonmt.glad.theme.Css;
import io.github.gleidsonmt.glad.theme.Font;
import io.github.gleidsonmt.glad.theme.ThemeAccessor;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.util.Objects;

/**
 * @author Gleidson Neves da Silveira | gleidisonmt@gmail.com
 * Create on  01/02/2025
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        MainView body = new MainView();
        Root root = createRoot(body);

        ThemeAccessor.install(root, Font.POPPINS);
        ThemeAccessor.install(root,
                Css.COLORS,
                Css.TYPOGRAPHIC,
                Css.SHAPES,
                Css.PROPERTIES,
                Css.BOOTSTRAP,
                Css.IMMERSIVE_SCROLL,
                Css.PROGRESS_BAR
        );

        Scene scene = createScene(root);
        scene.setFill(Color.TRANSPARENT);
        stage.initStyle(StageStyle.UNDECORATED);
        root.getStylesheets().addAll(
                Assets.getCSS("main.css"),
                Assets.getCSS("drawer.css")
        );
        stage.setScene(scene);
        stage.show();

    }

    private Scene createScene(Root root) {
//        Scene scene = new Scene(root, 1336, 768);
        Scene scene = new Scene(root);
        return scene;
    }


    private Root createRoot(Container container) {
        Root root = new Root(container);
        return root;
    }


}
