package school.sptech;

import java.util.Random;

public class Exercicio7 {
    public static void main(String[] args) {
        Random random = new Random();
        Integer escolhido = random.nextInt(100) + 1;
        Integer primeiraVez = null;
        Integer pares = 0;
        Integer impares = 0;

        for (Integer i = 1; i <= 200; i++) {
            Integer sorteado = random.nextInt(100) + 1;

            if (sorteado.equals(escolhido) && primeiraVez == null) {
                primeiraVez = i;
            }

            if (sorteado % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Número escolhido: " + escolhido);
        System.out.println("Primeira vez sorteado na posição: " + primeiraVez);
        System.out.println("Quantidade de pares sorteados: " + pares);
        System.out.println("Quantidade de ímpares sorteados: " + impares);
    }
}