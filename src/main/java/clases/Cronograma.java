package clases;
import java.time.LocalDate;
import java.util.Date;
import javax.swing.table.TableModel;

public class Cronograma {
    private Date diaPago;
    private double costoEnvio;
    private double seguroDesgrav;


    public LocalDate calcularFechaVcto(int mesActual, int anioActual, int i, int dia) {
int mesFila = mesActual + i;
        int anioFila = anioActual + (mesFila - 1) / 12;
        mesFila = (mesFila - 1) % 12 + 1;
        LocalDate fechaSeleccionada = LocalDate.of(anioFila, mesFila, dia);
        return fechaSeleccionada;
        
    }
    public double calcularTEA(String teaText) {
        double valor = Double.parseDouble(teaText.replaceAll("[%]", "")) / 100;
        return valor;
    }
    public double calcularTEM (double tea) { 
            double tem = Math.pow(1 + tea, 1.0 / 12) - 1;
            return tem * 100;
    }
    public double calcularInteresesTotales(String interesAnual, double seguroPor) {
       double teaDeci = Double.parseDouble(interesAnual.replaceAll("[%]", "")) / 100;
       double seguroDeci = seguroPor / 100;
       return (Math.pow((1 + teaDeci), 1.0 / 12) - 1) + seguroDeci;
    }
    public static Object calcularSaldoInicial(int i, TableModel model) {
        Object valorAnterior = ""; // Objeto vacío
        if (i > 1) {
            valorAnterior = model.getValueAt(i - 2, model.getColumnCount() - 3); // Saldo inicial de la cuota anterior
        }
        return valorAnterior; // 1 monto sino variable valorAnterior
    }
    public double calcularCuota(double monto1, double interesTotal, int ncouta) {
        double valorPresente = Math.pow(1 + interesTotal, -ncouta);
        return (interesTotal * monto1) / (1 - valorPresente);
    }

    public double calcularCoutaTotal(double couta, double envio) {
            return couta + envio;
    }
    public double calcularAmortizacion(double coutaFinal, double interesesT, double envio) {
            return coutaFinal - (interesesT + envio);
    }
    public double calcularSaldoFinal(double saldoInicial, double amortizacion) {
            return saldoInicial - amortizacion;
    }
    public double calcularEnvio(String tipoEnvio) {
            if (tipoEnvio.equals("Físico")) {
                return 10.0;
            } else {
                return 0.0;
            }
    }
}

   
    

