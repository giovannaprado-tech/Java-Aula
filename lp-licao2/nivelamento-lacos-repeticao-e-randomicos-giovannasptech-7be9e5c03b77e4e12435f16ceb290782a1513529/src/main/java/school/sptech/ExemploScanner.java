package school.sptech;

import java.util.Scanner;

public class ExemploScanner {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Scanner leitorTexto = new Scanner(System.in);
        System.out.println("Digite o seu nome:");
        String nome = leitor.nextLine();
        System.out.println("Olá " + nome + "  Seja bem vindo.");
        System.out.println("Digite a sua idade:");
        Integer idade = leitor.nextInt();
        System.out.println("Digite a sua altura:");
        Double altura = leitor.nextDouble();
        System.out.println("Ficha do aluno Nome:" + nome + "  Idade:" + idade + "  Altura:" + altura);
        System.out.println("Diga um feedback ao sistema:");
        String feedback = leitorTexto.nextLine();

        System.out.println("Obrigada pelo feedback!!");

    }
}
