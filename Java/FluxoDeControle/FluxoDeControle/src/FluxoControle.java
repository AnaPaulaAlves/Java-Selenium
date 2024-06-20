public class FluxoControle {

    public static void main(String[] args) {

        int idade = 15;

        if (idade < 0)
            System.out.println("Idade Inválida");

        //// OUTRO EXEMPLO

        if (idade >= 18 && idade < 70) {
            System.out.println("Maior de Idade");
        } else if (idade >= 70 ) {
            System.out.println("Terceira Idade");
            if (idade >= 100) {
                System.out.println("Centenária");
            }
        } else {
            System.out.println("Menor de Idade");
        }

    }
}
