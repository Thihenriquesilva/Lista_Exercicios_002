import javax.swing.JOptionPane;

public class Ex004 {
    public static void main(String[] args) {
        /*
            Ler um inteiro no intervalo [1, 7] e exibir o dia da semana associado a ele, como a
            seguir: 1: Domingo, 2: Segunda, 3: Terça. E assim por diante.
        */
        int dia;
        dia = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero no intervalo [1,7]"));
        switch (dia) {
            case 1:
            JOptionPane.showMessageDialog(null,String.format("%d - Domingo", dia));
            break;
            case 2:
            JOptionPane.showMessageDialog(null,String.format("%d - Segunda", dia));
            break;
            case 3:
            JOptionPane.showMessageDialog(null,String.format("%d - Terça", dia));
            break;
            case 4:
            JOptionPane.showMessageDialog(null,String.format("%d - Quarta", dia));
            break;
            case 5:
            JOptionPane.showMessageDialog(null,String.format("%d - Quinta", dia));
            break;
            case 6:
            JOptionPane.showMessageDialog(null,String.format("%d - Sexta", dia));
            break;
            case 7:
            JOptionPane.showMessageDialog(null,String.format("%d - Sábado", dia));
            break;
            default:
            JOptionPane.showMessageDialog(null, "Por favor, digite um numero no intervalo solicitado");
            break;
            }
            
    }
}
