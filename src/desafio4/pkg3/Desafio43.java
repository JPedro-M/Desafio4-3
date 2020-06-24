package desafio4.pkg3;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
/**
 *
 * @author troll
 */
public class Desafio43 {
    public static void main(String[] args) {
        DecimalFormat formato = new DecimalFormat("0.00");
        double saldoMedio, valorDoCredito;
        
        saldoMedio = Double.parseDouble(JOptionPane.showInputDialog("Qual o seu saldo médio?"));
        
        if (saldoMedio >= 0 && saldoMedio <=200) {
           valorDoCredito = 0;
        }else if (saldoMedio >200 && saldoMedio <=400) {
            valorDoCredito = (saldoMedio/100)*20;
        }else if (saldoMedio > 400 && saldoMedio <= 600) {
            valorDoCredito = (saldoMedio/100)*30;
        }else {
            valorDoCredito = (saldoMedio/100)*40;
        }
         JOptionPane.showMessageDialog(null, "Saldo médio:"+saldoMedio+"valor do credito"+formato.format(valorDoCredito));
    }
}