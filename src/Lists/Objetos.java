package Lists;

import javafx.beans.property.*;

public class Objetos {
    //* Cada articulo tiene un nombre, una cantidad, precio unitario,
    // total y un estado. El estado puede ser pendiente o comprado *//
    SimpleStringProperty Nombre;
    SimpleBooleanProperty EstadoArt;
    SimpleIntegerProperty Cantidad;
    SimpleDoubleProperty PrecioUnitario;
    SimpleDoubleProperty PrecioTotal;

//* Constructor de Objetos *//

    public Objetos (String Nombre, Integer Cantidad, Double PrecioUnitario){
        this.Nombre.set(Nombre);
        this.Cantidad.set(Cantidad);
        this.PrecioUnitario.set(PrecioUnitario);
        this.PrecioTotal.set(PrecioUnitario*Cantidad);
        this.EstadoArt.set(false);

    }

    public String getNombre() {
        return Nombre.get();
    }

    public SimpleStringProperty nombreProperty() {
        return Nombre;
    }

    public boolean isEstadoArt() {
        return EstadoArt.get();
    }

    public SimpleBooleanProperty estadoArtProperty() {
        return EstadoArt;
    }

    public int getCantidad() {
        return Cantidad.get();
    }

    public SimpleIntegerProperty cantidadProperty() {
        return Cantidad;
    }

    public double getPrecioUnitario() {
        return this.PrecioUnitario.get();
    }

    public SimpleDoubleProperty precioUnitarioProperty() {
        return this.precioUnitarioProperty();
    }

    public double getPrecioTotal() {
        return PrecioTotal.get();
    }

    public SimpleDoubleProperty precioTotalProperty() {
        return PrecioTotal;
    }

    public void setEstadoArt(boolean estadoArt) {
        this.EstadoArt.set(estadoArt);
    }

    //* Esto cambia el estado del articulo de pendiente a comprado o de comprado a pendiente *//
    public void CambiarEstadoArt (boolean state){
        this.EstadoArt.set(state);


    }


}
