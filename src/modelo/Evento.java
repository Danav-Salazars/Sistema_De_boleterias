package modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Evento {

    private String nombre;
    private String lugar;
    private String patrocinador;
    private LocalDate fecha;
    private LocalTime hora;
    private ArrayList<Zona> zonas;

    public Evento(String nombre, String lugar, String patrocinador,
                  LocalDate fecha, LocalTime hora) {
        this.nombre = nombre;
        this.lugar = lugar;
        this.patrocinador = patrocinador;
        this.fecha = fecha;
        this.hora = hora;
        zonas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public ArrayList<Zona> getZonas() {
        return zonas;
    }

    public void agregarZona(Zona zona) {
        zonas.add(zona);
    }
}
