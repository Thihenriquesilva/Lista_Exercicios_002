import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {
        /*
            3. Ler três valores reais e exibir o maior valor entre eles. Suponha que eles sejam
            diferentes.
        */
        Scanner scan = new Scanner(System.in);
        double a,b,c;

        System.out.printf("Digite o 1 numero: ");
        a = scan.nextDouble();
        System.out.printf("Digite o 2 numero: ");
        b = scan.nextDouble();
        System.out.printf("Digite o 3  numero: ");
        c = scan.nextDouble();
        if(a > b && a > c)
            System.out.printf("O maior número é %f",a);
        else if(b > a && b > c)
            System.out.printf("O maior número é %f",b);
        else
            System.out.printf("O maior número é %f",c);
        
            scan.close();
    }
}
