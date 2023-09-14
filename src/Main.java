import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");

        int sorvete = 10;

        System.out.println("Eu gosto de sorvete de chocolate: " + sorvete);


        byte comida = 15;

        System.out.println("Minha comida preferida é pizza: " + comida);



        short estação= 20;

        System.out.println("Minha estação favorita é: " + estação);



        long local= 25;

        System.out.println("Meu lugar preferido: " + local);



        boolean dia = true;

        System.out.println("Variavel do tipo boolean: " + dia);

        if(dia == false){
            System.out.println("Variavel dia é falso!");
        } else {
            System.out.println("Variavel dia é verdadeira");
        }

//Faça um programa em JAVA para criar duas varáeis e mostrar a soma entre elas

       int num1= 7;
        int num2= 7;

        float resultado = num1 +num2;

        System.out.println("A soma é:"  + resultado);

//outro exercício

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número para a soma:");
        int numero4 = scanner.nextInt();

        System.out.println("Digite o segundo número para a soma:");
        int numero5= scanner.nextInt();

        int resultado1 = numero4 + numero5;



        System.out.println("Numero:" + resultado1);


        //multiplicação

        System.out.println("Digite o primeiro número para a multiplicação:");
        int numero6 = scanner.nextInt();

        System.out.println("Digite o segundo número para a multiplicação:");
        int numero7 = scanner.nextInt();

        int resultado2 = numero6 * numero7;

        System.out.println("Numero:" + resultado2);



//divisão
        System.out.println("Digite o primeiro número para a divisão:");
        int numero8 = scanner.nextInt();

        System.out.println("Digite o segundo número para a divisão:");
        int numero9 = scanner.nextInt();

        int resultado3 = numero8 / numero9;

        System.out.println("Numero:" + resultado3);




        //criar um algoritmo em java para descobrir se o número digitado é par ou impar
        System.out.println("Digite um número para saber se ele é par ou ímpar:");
         int valor = 2;

         if (valor % 2 == 0){
             System.out.println("O número é par");
         }
         else {
             System.out.println("O número é ímpar");
         }






        scanner.close();
    }
}