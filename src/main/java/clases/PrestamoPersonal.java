package clases;
import com.mycompany.simulador.ReporteCronograma;
import java.util.Date;


public class PrestamoPersonal {
    
   private double monto;
   private int meses;
   private double interesAnual;
   private Date diaPago;
   private String tipoEnvio;

    public boolean ingresoNumerico(String entradaMonto,String entradaPlazo) {
        return entradaMonto.isEmpty() || entradaPlazo.isEmpty();
    }
    public boolean montoValido(double monto) {
        return monto < 1000 || monto > 80000;
    }
    public boolean mesesValido(double meses) {
        return meses < 1 || meses > 48;
    }
    public void obtenerDatos(double monto, int meses, String interesAnual, String diaPago, String tipoEnvio, Cronograma c, ReporteCronograma rc, double seguro) {
        double pagoEnvio = c.calcularEnvio(tipoEnvio);
        rc.obtenerDato(monto, meses, interesAnual, diaPago, pagoEnvio, seguro);
    }
}
