package school.sptech;

public class ExercicioMetodos {
    Boolean maiorIdade(Integer idade) {
        return idade >= 18;
    }

    Double calcularMedia(Double valor1, Double valor2, Double valor3) {
        Double soma = valor1 + valor2 + valor3;
        Double media = soma / 3;
        return media;
    }

    Integer maiorNumero(Integer maior1, Integer maior2, Integer maior3) {
        Integer maior = maior1;

        if (maior2 > maior) {
            maior = maior2;
        }
        if (maior3 > maior) {
            maior = maior3;
        }
        return maior;
    }

    Integer calcularFatorial(Integer valor) {
        Integer fatorial = valor;
        while (valor > 1) {

            fatorial = fatorial * (valor - 1);
            valor--;

        }

        return valor;
    }
}




