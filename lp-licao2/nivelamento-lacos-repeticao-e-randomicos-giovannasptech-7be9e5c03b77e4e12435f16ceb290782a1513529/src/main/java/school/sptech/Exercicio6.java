package school.sptech;

public class Exercicio6 {
    public static void main(String[] args) {
        Integer base = 2;
        Integer expoente = 5;
        Integer resultado = 1;

        for (Integer i = 1; i <= expoente; i++) {
            resultado *= base;
        }

        System.out.println(base + " elevado a " + expoente + " = " + resultado);
    }
}