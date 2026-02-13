package vista;

import modelo.Compra;
import persistencia.BaseDatos;

import javax.swing.*;

public class VentanaReportarPago extends JFrame {

    public VentanaReportarPago() {

        setTitle("Reportar Pago");
        setSize(300, 200);
        setLocationRelativeTo(null);

        JTextField txtCedula = new JTextField();
        JButton btnPagar = new JButton("Confirmar Pago");

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        panel.add(new JLabel("Cédula"));
        panel.add(txtCedula);
        panel.add(btnPagar);

        btnPagar.addActionListener(e -> {
            for (Compra c : BaseDatos.compras) {
                if (c.getCedula().equals(txtCedula.getText())) {
                    c.pagar();
                    JOptionPane.showMessageDialog(this, "Pago registrado");
                    dispose();
                    return;
                }
            }
            JOptionPane.showMessageDialog(this, "Compra no encontrada");
        });

        add(panel);
        setVisible(true);
    }
}
