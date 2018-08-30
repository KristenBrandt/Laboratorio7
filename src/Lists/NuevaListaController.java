package Lists;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;

public class NuevaListaController {
    @FXML
    private TextField name;

    @FXML
    private TextField description;

    public void NewObjetoWindow(ActionEvent event) {
        Parent root;
        try {

            // Cargar la nueva ventana
            FXMLLoader loader = new FXMLLoader(getClass().getResource("VerListas.fxml"));
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
}
