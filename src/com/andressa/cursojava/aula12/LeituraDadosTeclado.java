package com.andressa.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite seu nome completo: ");
        String nomeCOmpleto = scan.nextLine();
        System.out.println("Seu nome completo é: " + nomeCOmpleto);

        System.out.println("Digite seu primeiro nome: ");
        String primeiroNome01 = scan.next();
        System.out.println("Seu primeiro nome é: " + primeiroNome01);

        System.out.println("Digite a sua idade: ");
        int idade01 = scan.nextInt();
        System.out.println("Sua idade é: " + idade01);

        System.out.println("Digite sua altura: ");
        double altura01 = scan.nextDouble();
        System.out.println("A sua altura é: " + altura01);

        System.out.println("Digite o seu 1º nome, idade, quantidade de filhos, altura e se tem Pet");
        String primeiroNome02 = scan.next();
        int idade02 = scan.nextInt();
        byte qtdFilhos = scan.nextByte();
        float altura02 = scan.nextFloat();
        boolean temPet = scan.nextBoolean();

        System.out.println("Você digitou os deguintes valores: ");
        System.out.println("1º Nome: " + primeiroNome02);
        System.out.println("Idade: " + idade02);
        System.out.println("Quantidade de filhos: " + qtdFilhos);
        System.out.println("Altura: " + altura02);
        System.out.println("Tem bichinho de estimação? " + temPet);




    }

}
