package vista;

import modelo.*;
import persistencia.BaseDatos;

import javax.swing.*;

public class    VentanaReservarBoleta extends JFrame {

    public VentanaReservarBoleta() {

        setTitle("Reservar Boleta");
        setSize(400, 400);
        setLocationRelativeTo(null);

        JComboBox<Evento> comboEvento =
                new JComboBox<>(BaseDatos.eventos.toArray(new Evento[0]));

        JTextField txtCedula = new JTextField();
        JTextField txtNombre = new JTextField();
        JTextField txtCantidad = new JTextField();

        JButton btnReservar = new JButton("Reservar");

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        panel.add(new JLabel("Evento"));
        panel.add(comboEvento);
        panel.add(new JLabel("Cédula"));
        panel.add(txtCedula);
        panel.add(new JLabel("Nombre"));
        panel.add(txtNombre);
        panel.add(new JLabel("Cantidad"));
        panel.add(txtCantidad);
        panel.add(btnReservar);

        btnReservar.addActionListener(e -> {

            Evento evento = (Evento) comboEvento.getSelectedItem();
            Zona zona = evento.getZonas().get(0);

            int cantidad = Integer.parseInt(txtCantidad.getText());
            zona.reservar(cantidad);

            Compra compra = new Compra(
                    txtCedula.getText(),
                    txtNombre.getText(),
                    evento,
                    zona,
                    cantidad
            );

            BaseDatos.compras.add(compra);
            JOptionPane.showMessageDialog(this, "Boletas reservadas");
            dispose();
        });

        add(panel);
        setVisible(true);
    }
}
