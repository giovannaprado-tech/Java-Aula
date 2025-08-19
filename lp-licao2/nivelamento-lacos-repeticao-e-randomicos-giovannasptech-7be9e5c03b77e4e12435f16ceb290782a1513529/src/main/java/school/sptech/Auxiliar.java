package school.sptech;

public class Auxiliar {

    // function exemplo(bacon){
    // return bacon;
    // }

    void mostrarBacon() {
        System.out.println("\uD83E\uDD53");
    }

    void mostrarComBacons(String mensagem){
        System.out.println("\uD83E\uDD53" + mensagem + "\uD83E\uDD53");
    }
    Integer somarBacons(Integer n1, Integer n2) {
       Integer soma = n1 + n2;
        System.out.println("\uD83E\uDD53".repeat(soma));
        return soma;
    }
    void dividirBacons(Integer bacon, Integer pessoas) {
        Integer resultado = bacon / pessoas;
        Integer resto = bacon % pessoas;
        System.out.println( "Quantidade de pessoas:" + "\uD83E\uDD53".repeat(pessoas));
        System.out.println("Quantidade de bacon"+"\uD83E\uDD53".repeat(bacon));
        System.out.println( "Total:"+"\uD83E\uDD53".repeat(resultado));
        System.out.println("Resto:" + "\uD83E\uDD53".repeat(resto));

    }
    void escolherBacon(Integer quantidade) {
        System.out.println("\uD83E\uDD53".repeat(quantidade));
    }
}
