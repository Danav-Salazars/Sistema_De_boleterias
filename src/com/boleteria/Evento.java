
package com.boleteria;

public class Evento {
    private String nombre;
    private String fecha;
    private String hora;
    private String lugar;
    private String patrocinador;
    private int zonaA;
    private int zonaB;
    private int zonaC;

    public Evento(String nombre, String fecha, String hora, String lugar, String patrocinador,
                  int zonaA, int zonaB, int zonaC) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
        this.patrocinador = patrocinador;
        this.zonaA = zonaA;
        this.zonaB = zonaB;
        this.zonaC = zonaC;
    }

    @Override
    public String toString() {
        return "Evento: " + nombre + " | Fecha: " + fecha + " | Hora: " + hora +
                " | Lugar: " + lugar + " | Patrocinador: " + patrocinador +
                " | Zona A: " + zonaA + " | Zona B: " + zonaB + " | Zona C: " + zonaC;
    }
}
