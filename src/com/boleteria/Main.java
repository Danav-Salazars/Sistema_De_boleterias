
package com.boleteria;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
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

        JPanel panel = new JPanel(new GridLayout(10, 2, 5, 5));

        txtNombre = new JTextField();
        txtFecha = new JTextField();
        txtHora = new JTextField();
        txtLugar = new JTextField();
        txtPatrocinador = new JTextField();
        txtZonaA = new JTextField();
        txtZonaB = new JTextField();
        txtZonaC = new JTextField();

        panel.add(new JLabel("Nombre del Evento:"));
        panel.add(txtNombre);
        panel.add(new JLabel("Fecha:"));
        panel.add(txtFecha);
        panel.add(new JLabel("Hora:"));
        panel.add(txtHora);
        panel.add(new JLabel("Lugar:"));
        panel.add(txtLugar);
        panel.add(new JLabel("Patrocinador:"));
        panel.add(txtPatrocinador);
        panel.add(new JLabel("Boletas Zona A:"));
        panel.add(txtZonaA);
        panel.add(new JLabel("Boletas Zona B:"));
        panel.add(txtZonaB);
        panel.add(new JLabel("Boletas Zona C:"));
        panel.add(txtZonaC);

        JButton btnCrear = new JButton("Crear Evento");
        panel.add(btnCrear);

        areaEventos = new JTextArea();
        JScrollPane scroll = new JScrollPane(areaEventos);

        add(panel, BorderLayout.NORTH);
        add(scroll, BorderLayout.CENTER);

        btnCrear.addActionListener((ActionEvent e) -> crearEvento());
    }

    private void crearEvento() {
        try {
            String nombre = txtNombre.getText();
            String fecha = txtFecha.getText();
            String hora = txtHora.getText();
            String lugar = txtLugar.getText();
            String patrocinador = txtPatrocinador.getText();

            int zonaA = Integer.parseInt(txtZonaA.getText());
            int zonaB = Integer.parseInt(txtZonaB.getText());
            int zonaC = Integer.parseInt(txtZonaC.getText());

            Evento evento = new Evento(nombre, fecha, hora, lugar, patrocinador, zonaA, zonaB, zonaC);
            eventos.add(evento);

            areaEventos.append(evento.toString() + "\n");

            JOptionPane.showMessageDialog(this, "Evento creado correctamente");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error: Verifique los datos");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Main().setVisible(true);
        });
    }
}
