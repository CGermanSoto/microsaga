package com.germansoto.microsaga;

import com.germansoto.microsaga.config.AppConfig;
import com.germansoto.microsaga.config.DatabaseConfig;
import com.germansoto.microsaga.util.Constants;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class MicroSagaPlay extends Application {

    @Autowired
    private DatabaseConfig database;
    private final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MicroSagaPlay.class.getResource("home.fxml"));
        fxmlLoader.setControllerFactory(context::getBean); // Configura el controlador de FXML con el contenedor Spring

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
