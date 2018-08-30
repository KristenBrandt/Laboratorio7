package sample;

import Lists.List;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class VerListasController {
    @FXML
    private AnchorPane anchorPane;


//agregar objeto
    public void NewObjetoWindow(ActionEvent event) {
        Parent root;
        try {

            // Cargar la nueva ventana
            FXMLLoader loader = new FXMLLoader(getClass().getResource("NuevoObjeto.fxml"));
            root = loader.load();
            Stage stage = new Stage();
            stage.setTitle("Nuevo Articulo");
            stage.setScene(new Scene(root, 625, 400));
            List seleccion = loader.getController();
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void ListasWindow(ActionEvent event) {
        Parent root;
        try {

            // Cargar la nueva ventana
            FXMLLoader loader = new FXMLLoader(getClass().getResource("sample.fxml"));
            root = loader.load();
            Stage stage = new Stage();
            stage.setTitle("Listas");
            stage.setScene(new Scene(root, 625, 400));
            List seleccion = loader.getController();
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}