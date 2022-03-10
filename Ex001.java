import java.util.Scanner;
public class Ex001 {

    public static void main(String[] args) {
        /*
          1. Ler um número inteiro e exibir se ele é positivo, negativo ou neutro (0)  
        */
        int num;
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite um numero inteiro:");
        num = scn.nextInt();
        if(num > 0)
            System.out.printf("O numero %d é positivo",num);
        else if(num < 0)
            System.out.printf("O numero %d é negativo",num);
        else
            System.out.printf("O numero %d é neutro", num);
        scn.close();
    }
}