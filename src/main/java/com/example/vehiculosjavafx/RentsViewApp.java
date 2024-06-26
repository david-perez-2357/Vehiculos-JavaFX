package com.example.vehiculosjavafx;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.kordamp.bootstrapfx.BootstrapFX;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class RentsViewApp extends Application {

    @FXML
    public void start(Stage stage) throws IOException, SQLException {
        FXMLLoader fxmlLoader = new FXMLLoader(RentsViewApp.class.getResource("rents_view.fxml"));


        Scene scene = new Scene(fxmlLoader.load(), 1100, 500);
        stage.setTitle("Alquileres");
        stage.setScene(scene);

        scene.getStylesheets().add(BootstrapFX.bootstrapFXStylesheet());

        System.out.println("Hoja de estilos aplicada: " + scene.getStylesheets());

        stage.show();

        RentsViewController controller = fxmlLoader.getController();

    }



}
