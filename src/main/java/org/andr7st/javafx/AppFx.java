package org.andr7st.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.image.Image;

import java.io.IOException;
import java.util.Objects;

public class AppFx extends Application {
    @Override
    public void start(Stage mainScene) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(AppFx.class.getResource("/org/andr7st/javafx/AppFxView.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        mainScene.setTitle("JavaFx | Andr7st");
        mainScene.setResizable(false);
        mainScene.setScene(scene);
        mainScene.centerOnScreen();
        this.addIcon(mainScene, "/org/andr7st/javafx/favicon.png");
        mainScene.show();
    }

    public static void addIcon(Stage stage, String srcIcon) {
        try {
            stage.getIcons().add(new Image(Objects.requireNonNull(AppFx.class.getResourceAsStream(srcIcon))));
        } catch (Exception ignored) {}
    }

    public static void main(String[] args) {
        launch();
    }
}