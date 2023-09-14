import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        //Atividade médico
        Scanner scanner=new Scanner(System.in);
        System.out.println("Digite a sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Quanto deu seu batimento cardíaco: ");
        int batimento = scanner.nextInt();



        //8 anos até 17 anos: 80 a 100 bpm
        if (idade >= 8 && idade <= 17 && batimento >=80 && batimento <= 100){
            System.out.println("idade: " + idade);
            System.out.println("batimento: " + batimento);
            System.out.println("Batimento ideal para esta idade");
        } else {
            System.out.println("Batimento nao ideal");
        }

        if (idade >= 18 && idade <= 65 && batimento >= 73 && batimento <= 78 ){
            System.out.println("idade: " + idade);
            System.out.println("batimento: " + batimento);
            System.out.println("Batimento ideal para esta idade");
        } else {
            System.out.println("Batimento nao ideal");

        }



        if (idade >= 65 && batimento >= 50 && batimento <= 6 ){
            System.out.println("idade: " + idade);
            System.out.println("batimento: " + batimento);
            System.out.println("Batimento ideal para esta idade");
        } else {
            System.out.println("Batimento nao ideal");

        }





        

    }


    }

