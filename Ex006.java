import java.util.Scanner;

public class Ex006 {
    public static void main(String[] args) {
        /*
           6. Ler um número inteiro e responder se ele é bissexto ou não. Um ano bissexto tem as
            seguintes características:
            - é múltiplo de quatro e não é múltiplo de 100 ou
            - é múltiplo de 400 
        */

        Scanner scn = new Scanner(System.in);
        int ano;

        System.out.println("Que ano você quer analizar ?");
        ano = scn.nextInt();
        if(ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0)
            System.out.printf("O ano %d é BISSEXTO", ano);
        else
            System.out.printf("O ano %d NÃO é BISSEXTO",ano);

        scn.close();
    }
}
