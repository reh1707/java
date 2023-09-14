import java.util.Scanner;

public class Exercício1 {
    public static void main(String[] args) {
        //um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a
// expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a idade:");
        int numero1 = scanner.nextInt();

        int numero2= 12;

        int resultado2 = numero1 * numero2;
        System.out.println("A sua idade em meses é:" + resultado2);

        System.out.println();


        int numero4= 365;

        int resultado6 = numero1 * numero4;
        System.out.println("A sua idade em dias é:" + resultado6);


        //desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu antecessor e seu sucessor

        System.out.println("Digite um número:");
        int numero7 = scanner.nextInt();

        int numero8 = 1;

        int resultado1 = numero7 + numero8;
        System.out.println("O sucessor desse número é:"  + resultado1);

        int resultado9 = numero7 - numero8;
        System.out.println("O antecessor desse númeri é:" + resultado9);

        //Fazer um programa que imprima a média aritmética dos números 8, 9 e 7.

        float num2 = 7;
        float num3 = 8;
        float num4 = 9;

        float resul = (num2 + num3 + num4) / 3;
        System.out.println("A média aritmética dos números 7 , 8 e 9 é:" + resul);




        //A média dos números 4, 5 e 6.
        float num5 = 4;
        float num6 = 5;
        float num7 = 6;

        float resul1 = (num5 + num6 + num7) / 3;
        System.out.println("A média dos números 4, 5, 6 é:" + resul1);




        //A soma das duas médias.
        float resul2 = resul + resul1 ;
        System.out.println("A soma das duas médias é:" + resul2);


        //A média das médias.
        float resul3 = resul2/2;
        System.out.println("A média das médias é:" + resul3);




        scanner.close();
    }
}
