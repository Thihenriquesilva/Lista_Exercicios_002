import java.util.Scanner;
import java.lang.Math;

public class Ex002 {
    public static void main(String[] args) {
        /*
        2. Ler coeficientes reais a, b e c de uma equação de segundo grau e exibir a(s) raiz(es),
        caso exista(m). Lembretes: Calcule o valor de delta. Se ele for negativo, não há
        raízes.. Se for igual a zero, há uma única raiz. Se delta for maior do que zero, então
        há duas raízes
        */
        //Ternario → ocorre 3 operações
        //nota >=6 ? 'Aprovado' : 'Reprovado'
        //Compilar javcac -source 8 -target 8 nomeArquivo.java

        double a,b,c, delta, x1, x2;

        Scanner scn = new Scanner(System.in);

        System.out.printf("Digite o coeficiente A:");
        a = scn.nextDouble();
        System.out.printf("Digite o coeficiente B:");
        b = scn.nextDouble();
        System.out.printf("Digite o coeficiente C:");
        c = scn.nextDouble();
        delta = (b*b) - 4*a*c;
        
        if(a == 0)
            System.out.println("Não é equação de segundo grau!!");
        else if(delta > 0){
            x1 = (-b + Math.sqrt(delta)) / (2*a);
            x2 = (-b - Math.sqrt(delta)) / (2*a);
            System.out.println(
                String.format("X1 = %.1f", x1));
            System.out.println(
                String.format("X2 = %.1f", x2));
        }
        else if(delta == 0){
            x1 = -b /(2+a);
            System.out.println(String.format("X1 = %.1f", x1));
        }
        else //delta negativo
            System.out.println("Não tem raizes reais.");

            scn.close();
    }
}
