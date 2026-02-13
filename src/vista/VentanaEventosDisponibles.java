package vista;

import persistencia.BaseDatos;
import modelo.Evento;

import javax.swing.*;

public class VentanaEventosDisponibles extends JFrame {

    public VentanaEventosDisponibles() {

        setTitle("Eventos Disponibles");
        setSize(500, 300);
        setLocationRelativeTo(null);

        JTextArea area = new JTextArea();
        area.setEditable(false);

        for (Evento e : BaseDatos.eventos) {
            area.append(
                    e.getNombre() +
                            " | Fecha: " + e.getFecha() + "\n"
            );
        }

        add(new JScrollPane(area));
        setVisible(true);
    }
}
