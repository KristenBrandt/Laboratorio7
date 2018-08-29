package sample;

import Lists.List;
import Lists.Objetos;
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
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.IOException;



public class Controller {

    @FXML
    TableView<List> listTable;

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

    @FXML
    public void initialize() {

        /**
        @Override

        public void start (Stage stage){
            FXMLLoader loader = new FXMLLoader(getClass().getResource("TestScene.fxml"));
            Scene scene = new Scene(new Group());
            stage.setTitle("Proyecto  de listas");
            stage.setWidth(450);
            stage.setHeight(450);

            final Label label = new Label("Mi Lista");
            label.setFont(new Font("Arial", 20));

            table.setEditable(true);

            TableColumn ArticuloCol = new TableColumn("Articulo");
            TableColumn CantidadCol = new TableColumn("Cantidad");
            TableColumn UnitarioCol = new TableColumn("Unitario");
            TableColumn TotalCol = new TableColumn("Total");
            TableColumn EstadoCol = new TableColumn("Estado");

            table.getColumns().addAll(ArticuloCol, CantidadCol, UnitarioCol, TotalCol, EstadoCol);

            final VBox vbox = new VBox();
            vbox.setSpacing(5);
            vbox.setPadding(new Insets(10, 0, 0, 10));
            vbox.getChildren().addAll(label, table);

            ((Group) scene.getRoot()).getChildren().addAll(vbox);

            stage.setScene(scene);
            stage.show();
        }
    }

    public void NewWindow(ActionEvent event) {
        Parent root;
        try {

            // Cargar la nueva ventana
            FXMLLoader loader = new FXMLLoader(getClass().getResource("sample.fxml"));
            root = loader.load();
            Stage stage = new Stage();
            stage.setTitle("Seleccion");
            stage.setScene(new Scene(root, 450, 450));

            // Manda la lista  seleccionada por el usiario
            TestSceneController testSceneController = loader.getController();
            List selectedList = listTable.getSelectionModel().getSelectedItem();
            if (selectedList != null) {
                testSceneController.setName("" + selectedList);
            } else {
                testSceneController.setName("No hay listas selecionadas!");
            }

            // Muestra la ventana
            stage.show();
            // Hide this current window (if this is what you want)
            // ((Node)(event.getSource())).getScene().getWindow().hide();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
        */
}}