import javax.swing.JOptionPane;

public class Ex005 {
    public static void main(String[] args) {
         /*
            Ler um número inteiro no intervalo [1, 12]. Considerando que cada número
            representa um mês da seguinte forma: 1: Janeiro, 2: Fevereiro e assim por diante,
            exiba o número de dias que o mês cujo respectivo número digitado possui.
        */
        int mes;
        mes = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero no intervalo [1,12]"));
        switch (mes) {
            case 1:
            JOptionPane.showMessageDialog(null,
                String.format("%d: Janeiro - 31 Dias", mes));
            break;
            case 2:
            JOptionPane.showMessageDialog(null,
                String.format("%d: Fevereiro - 28 ou 29 Dias", mes));
            break;
            case 3:
            JOptionPane.showMessageDialog(null,
                String.format("%d: Março - 31 Dias", mes));
            break;
            case 4:
            JOptionPane.showMessageDialog(null,
                String.format("%d: Abril - 30 Dias", mes));
            break;
            case 5:
            JOptionPane.showMessageDialog(null,
                String.format("%d: Maio - 31 Dias", mes));
            break;
            case 6:
            JOptionPane.showMessageDialog(null,
                String.format("%d: Junho - 30 Dias", mes));
            break;
            case 7:
            JOptionPane.showMessageDialog(null,
                String.format("%d: Julho - 31 Dias", mes));
            break;
            case 8:
            JOptionPane.showMessageDialog(null,
                String.format("%d: Agosto - 31 Dias", mes));
            break;
            case 9:
            JOptionPane.showMessageDialog(null,
                String.format("%d: Setembro - 30 Dias", mes));
            break;
            case 10:
            JOptionPane.showMessageDialog(null,
                String.format("%d: Outubro - 31 Dias", mes));
            break;
            case 11:
            JOptionPane.showMessageDialog(null,
                String.format("%d: Novembro - 30 Dias", mes));
            break;
            case 12:
            JOptionPane.showMessageDialog(null,
                String.format("%d: Dezembro - 31 Dias", mes));
            break;
            default:
            JOptionPane.showMessageDialog(null, "Por favor, digite um numero no intervalo solicitado");
            break;
            }
    }
}
