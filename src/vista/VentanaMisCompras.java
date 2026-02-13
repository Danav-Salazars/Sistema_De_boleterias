package vista;

import modelo.Compra;
import persistencia.BaseDatos;

import javax.swing.*;

public class VentanaMisCompras extends JFrame {

    public VentanaMisCompras() {

        setTitle("Mis Compras");
        setSize(500, 300);
        setLocationRelativeTo(null);

        JTextArea area = new JTextArea();
        area.setEditable(false);

        for (Compra c : BaseDatos.compras) {
            area.append(
                    c.getEvento().getNombre() +
                            " | " + c.getCantidad() +
                            " | " + c.getEstado() +
                            " | $" + c.getTotal() + "\n"
            );
        }

        add(new JScrollPane(area));
        setVisible(true);
    }
}
