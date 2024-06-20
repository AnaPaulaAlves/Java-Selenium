import java.util.Scanner;

public class LeituraDeDados {

    public static void main(String[] args) {

        int idade;

        // SCANNER É UMA CLASSE QUE PERMITE A LEITURA DE DADOS -> ESTA DEFINIDA NO PACOTE JAVA.UTIL
        Scanner sc = new Scanner(System.in);

        // ENTRADA DE DADOS DE DIGITAÇÃO DE TEXTO, NEXTLINE -> VAI OBTER A LINHA TODA QUE FOI DIGITADA
        System.out.println("Digite o seu nome: ");
        String nome = sc.nextLine();


        // ENTRADA DE DADOS DE DIGITAÇÃO DE NÚMEROS INTEIRO
        System.out.println("Digite a sua idade: ");
        idade = sc.nextInt();




        if (idade < 0)
            System.out.println("Idade Inválida");

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
