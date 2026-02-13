package modelo;

import java.time.LocalDateTime;

public class Compra {

    private String cedula;
    private String comprador;
    private Evento evento;
    private Zona zona;
    private int cantidad;
    private double total;
    private String estado;
    private LocalDateTime fechaReserva;

    public Compra(String cedula, String comprador,
                  Evento evento, Zona zona, int cantidad) {

        this.cedula = cedula;
        this.comprador = comprador;
        this.evento = evento;
        this.zona = zona;
        this.cantidad = cantidad;
        this.total = cantidad * zona.getPrecio();
        this.estado = "RESERVADA";
        this.fechaReserva = LocalDateTime.now();
    }

    public String getCedula() {
        return cedula;
    }

    public Evento getEvento() {
        return evento;
    }

    public Zona getZona() {
        return zona;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getTotal() {
        return total;
    }

    public String getEstado() {
        return estado;
    }

    public LocalDateTime getFechaReserva() {
        return fechaReserva;
    }

    public void pagar() {
        estado = "PAGADA";
    }

    public void cancelar() {
        estado = "CANCELADA";
    }
}
