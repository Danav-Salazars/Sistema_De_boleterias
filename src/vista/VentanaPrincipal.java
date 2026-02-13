package vista;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {

    public VentanaPrincipal() {

        setTitle("Sistema de Venta de Boletas");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(5,1,10,10));
        panel.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));

        JButton btnCrear = new JButton("Crear Evento");
        JButton btnEventos = new JButton("Eventos Disponibles");
        JButton btnReservar = new JButton("Reservar Boleta");
        JButton btnPago = new JButton("Reportar Pago");
        JButton btnCompras = new JButton("Mis Compras");

        panel.add(btnCrear);
        panel.add(btnEventos);
        panel.add(btnReservar);
        panel.add(btnPago);
        panel.add(btnCompras);

        btnCrear.addActionListener(e -> new VentanaCrearEvento());
        btnEventos.addActionListener(e -> new VentanaEventosDisponibles());
        btnReservar.addActionListener(e -> new VentanaReservarBoleta());
        btnPago.addActionListener(e -> new VentanaReportarPago());
        btnCompras.addActionListener(e -> new VentanaMisCompras());

        add(panel);
        setVisible(true);
    }
}
