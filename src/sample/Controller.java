package sample;

import Lists.List;
import Lists.NuevaListaController;
import Lists.Objetos;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.Observable;
import java.awt.event.*;



public class Controller {
    @FXML
    AnchorPane anchorPane;

    @FXML
     private TableView<List> listTable;

    @FXML
    TableColumn ArticuloCol;

    @FXML
    TableColumn CantidadCol;

    @FXML
    TableColumn UnitarioCol;

    @FXML
    TableColumn TotalCol;

    @FXML
    TableColumn EstadoCol;

    private ObservableList<List> table = FXCollections.observableArrayList();


// Abrir una nueva lista
        public void NewListWindow (ActionEvent event) {
            Parent root;
            try {

                // Cargar la nueva ventana
                FXMLLoader loader = new FXMLLoader(getClass().getResource("NuevaLista.fxml"));
                root = loader.load();
                Stage stage = new Stage();
                stage.setTitle("Lista Nueva");
                stage.setScene(new Scene(root, 625, 400));
                List seleccion = loader.getController();
                stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
// Abrir con botton de editar lista
    public void NewEditListaWindow(ActionEvent event) {
            Parent does;
            try {

                // Cargar la nueva ventana
                FXMLLoader loader = new FXMLLoader(getClass().getResource("VerListas.fxml"));
                does = loader.load();
                Stage stage = new Stage();
                stage.setTitle("Ver Lista");
                stage.setScene(new Scene(does, 625, 400));
                List seleccion = loader.getController();
                stage.show();


            } catch (IOException e) {
                e.printStackTrace();
            }

/**
            // lista  seleccionada
            TestSceneController testSceneController = loader.getController();
            List selectedList = listTable.getSelectionModel().getSelectedItem();
            if (selectedList != null) {
                testSceneController.setName("" + selectedList);
            } else {
                testSceneController.setName("No hay listas selecionadas!");
            }**/

        /**public void start (Stage stage){
            FXMLLoader loader = new FXMLLoader(getClass().getResource("TestScene.fxml"));
            Scene scene = new Scene(new Group());
            stage.setTitle("Proyecto  de listas");
            stage.setWidth(625);
            stage.setHeight(400);

            final Label label = new Label("Mi Lista");
            label.setFont(new Font("Arial", 20));

            table.setEditable(true);

            TableColumn ArticuloCol = new TableColumn("Articulo");
            TableColumn CantidadCol = new TableColumn("Cantidad");
            TableColumn UnitarioCol = new TableColumn("Unitario");
            TableColumn TotalCol = new TableColumn("Total");
            TableColumn EstadoCol = new TableColumn("Estado");

            listTable.getColumns().addAll(ArticuloCol, CantidadCol, UnitarioCol, TotalCol, EstadoCol);

            final VBox vbox = new VBox();
            vbox.setSpacing(5);
            vbox.setPadding(new Insets(10, 0, 0, 10));
            vbox.getChildren().addAll(label, listTable);

            ((Group) scene.getRoot()).getChildren().addAll(vbox);

            //stage.setScene(scene);
            //stage.show();
        }
    }
**/
/**

            // Muestra la ventana
            stage.show();
            // Hide this current window (if this is what you want)
            ((Node)(event.getSource())).getScene().getWindow().hide();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
        */

        }
}
