package Lists;

import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.ObservableList;

import java.time.LocalDate;

public class List{

    // Cada lista tiene un nombre y tiene diferentes articulos
    SimpleStringProperty nombre = new SimpleStringProperty();
    SimpleListProperty<Objetos> Objeto = new SimpleListProperty();
    LocalDate now = LocalDate.now();
    SimpleStringProperty descripcion = new SimpleStringProperty();

    public List(String nombre, String descripcion ){


    }

    public String getNombre() {
        return nombre.get();
    }

    public SimpleStringProperty nombreProperty() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre.set(nombre);
    }

    public ObservableList<Objetos> getObjeto() {
        return Objeto.get();
    }

    public SimpleListProperty<Objetos> objetoProperty() {
        return Objeto;
    }

    public void setObjeto(ObservableList<Objetos> objeto) {
        this.Objeto.set(objeto);
    }

    public LocalDate getNow() {
        return now;
    }

    public void setNow(LocalDate now) {
        this.now = now;
    }

    public String getDescripcion() {
        return descripcion.get();
    }

    public SimpleStringProperty descripcionProperty() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion.set(descripcion);
    }

}
