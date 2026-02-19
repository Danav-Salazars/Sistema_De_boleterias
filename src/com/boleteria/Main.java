package com.boleteria;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main extends JFrame {

    private JTextField txtNombre, txtFecha, txtHora, txtLugar, txtPatrocinador;
    private JTextField txtZonaA, txtZonaB, txtZonaC;
    private JTextArea areaEventos;

    private List<Evento> eventos = new ArrayList<>();

    public Main() {
        setTitle("Sistema de Boleterías - Crear Evento");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}

