package school.sptech;

import java.util.Random;

public class Exercicio1 {
    public static void main(String[] args) {
        Random random = new Random();
        Integer numero;
        Integer soma = 0;

        do {
            numero = random.nextInt(11);
            soma += numero;
        } while (!numero.equals(0));

        System.out.println("A soma dos números é " + soma);
    }
}