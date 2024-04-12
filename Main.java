import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Criando produtos utilizando diferentes construtores:");

        Produto produto1 = new Produto("Produto A");
        System.out.println("\nProduto 1:");
        produto1.exibirCaracteristicas();

        System.out.print("\nDigite o nome do Produto B: ");
        String nomeB = scanner.nextLine();
        System.out.print("Digite o preço do Produto B: ");
        double precoB = scanner.nextDouble();
        Produto produto2 = new Produto(nomeB, precoB);
        System.out.println("\nProduto 2:");
        produto2.exibirCaracteristicas();

        scanner.nextLine(); // Limpar o buffer do teclado
        System.out.print("\nDigite o nome do Produto C: ");
        String nomeC = scanner.nextLine();
        System.out.print("Digite o preço do Produto C: ");
        double precoC = scanner.nextDouble();
        System.out.print("Digite a quantidade em estoque do Produto C: ");
        int quantidadeC = scanner.nextInt();
        Produto produto3 = new Produto(nomeC, precoC, quantidadeC);
        System.out.println("\nProduto 3:");
        produto3.exibirCaracteristicas();

        scanner.close();
    }
}