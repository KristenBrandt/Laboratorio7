package Lists;

import javafx.beans.property.SimpleListProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class NuevoObjetoController {

    @FXML
    AnchorPane Pane;

    @FXML
    SimpleListProperty<Objetos> TabladeObjetos;

    public void NewObjetoWindow(ActionEvent event) {
        Parent root;
        try {

            // Cargar la nueva ventana
            FXMLLoader loader = new FXMLLoader(getClass().getResource("sample.fxml"));
            root = loader.load();
            Stage stage = new Stage();
            stage.setTitle("Lista");
            stage.setScene(new Scene(root, 625, 400));
            List seleccion = loader.getController();
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void BackWindow(ActionEvent event) {
        Parent root;
        try {

            // regresar a ventana anterior
            FXMLLoader loader = new FXMLLoader(getClass().getResource("sample.fxml"));
            root = loader.load();
            Stage stage = new Stage();
            stage.setTitle("Lista");
            stage.setScene(new Scene(root, 625, 400));
            List seleccion = loader.getController();
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
