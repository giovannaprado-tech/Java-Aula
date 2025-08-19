package school.sptech;

import java.util.Random;

public class Exercicio3 {
    public static void main(String[] args) {
        Random random = new Random();
        Integer escolhido = random.nextInt(11);
        Integer tentativas = 0;
        Integer sorteado;

        do {
            sorteado = random.nextInt(11);
            tentativas++;
            System.out.println("Sorteado: " + sorteado);
        } while (!sorteado.equals(escolhido));

        if (tentativas <= 3) {
            System.out.println("Você é MUITO sortudo");
        } else if (tentativas <= 10) {
            System.out.println("Você é sortudo");
        } else {
            System.out.println("É melhor você parar de apostar e ir trabalhar");
        }
    }
}