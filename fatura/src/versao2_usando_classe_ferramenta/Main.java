package versao2_usando_classe_ferramenta;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Fatura fatura = new Fatura();

        System.out.print("Insira a quantidade de itens na fatura: ");
        int itensFatura = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= itensFatura; i++) {
            System.out.println("""
                ---------------------------------------------------------------------------
                """);

            String identificador = Integer.toString(i);

            System.out.println("Insira o nome do " + i +"º item da lista:");
            String nomeProduto = scanner.nextLine();

            System.out.println("Insira o valor unitário do item " + nomeProduto + ": ");
            int valorItem = Integer.parseInt(scanner.nextLine());

            System.out.println("Insira a quantidade de itens de " + nomeProduto + ": ");
            int quantidadeItens = Integer.parseInt(scanner.nextLine());

            fatura.pecas.add(new Ferramenta(identificador,nomeProduto,quantidadeItens,valorItem));
        }

        fatura.pecas.forEach(System.out::println);

        System.out.println("""
                
                ---------------------------------------------------------------------------
                
                """);

        System.out.println("O valor da fatura é de R$ " + fatura.obterValorFatura());


    }
}
