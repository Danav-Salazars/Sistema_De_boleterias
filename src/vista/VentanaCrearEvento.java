package vista;

import modelo.Evento;
import modelo.Zona;
import persistencia.BaseDatos;

import javax.swing.*;
import java.time.LocalDate;
import java.time.LocalTime;

public class VentanaCrearEvento extends JFrame {

    public VentanaCrearEvento() {

        setTitle("Crear Evento");
        setSize(400, 350);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JTextField txtNombre = new JTextField();
        JTextField txtLugar = new JTextField();
        JTextField txtPatrocinador = new JTextField();

        JButton btnGuardar = new JButton("Guardar Evento");

        panel.add(new JLabel("Nombre del evento"));
        panel.add(txtNombre);
        panel.add(new JLabel("Lugar"));
        panel.add(txtLugar);
        panel.add(new JLabel("Patrocinador"));
        panel.add(txtPatrocinador);
        panel.add(btnGuardar);

        btnGuardar.addActionListener(e -> {

            Evento evento = new Evento(
                    txtNombre.getText(),
                    txtLugar.getText(),
                    txtPatrocinador.getText(),
                    LocalDate.now(),
                    LocalTime.now()
            );

            evento.agregarZona(new Zona("A", 200, 200000));
            evento.agregarZona(new Zona("B", 100, 100000));
            evento.agregarZona(new Zona("C", 50, 50000));

            BaseDatos.eventos.add(evento);
            JOptionPane.showMessageDialog(this, "Evento creado correctamente");
            dispose();
        });

        add(panel);
        setVisible(true);
    }
}
