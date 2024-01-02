package com.rpg.microsaga;

import com.rpg.microsaga.config.JpaConfig;
import com.rpg.microsaga.util.Constants;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class MicroSagaPlay extends Application {
    private final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JpaConfig.class);

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MicroSagaPlay.class.getResource("home.fxml"));
        fxmlLoader.setControllerFactory(context::getBean); // Configura el controlador de FXML con el contenedor Spring...

        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle(Constants.GAME_NAME);
        stage.setScene(scene);
        stage.show();
    }


    @Override
    public void stop() {
        context.close();
    }
}
