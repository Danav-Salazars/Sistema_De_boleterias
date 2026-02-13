package modelo;

public class Zona {

    private String nombre;
    private int disponibles;
    private double precio;

    public Zona(String nombre, int disponibles, double precio) {
        this.nombre = nombre;
        this.disponibles = disponibles;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDisponibles() {
        return disponibles;
    }

    public double getPrecio() {
        return precio;
    }

    public void reservar(int cantidad) {
        disponibles -= cantidad;
    }

    public void liberar(int cantidad) {
        disponibles += cantidad;
    }
}
