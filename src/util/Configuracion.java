package util;

import java.io.FileInputStream;
import java.util.Properties;

public class Configuracion {

    public static int horasReserva() {
        try {
            Properties p = new Properties();
            p.load(new FileInputStream("config.properties"));
            return Integer.parseInt(p.getProperty("horas_reserva"));
        } catch (Exception e) {
            return 24;
        }
    }
}
