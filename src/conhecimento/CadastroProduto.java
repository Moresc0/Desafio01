package conhecimento;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroProduto {

    private List<Produto> produtos;

    public CadastroProduto() {
        produtos = new ArrayList<>();
    }

    public void cadastrarProduto() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do produto : ");
        String nome = sc.nextLine();

        System.out.println("Digite o preço do produto : ");
        double preco = sc.nextDouble();

        System.out.println("Digite a quantidade do produto : ");
        int quantidade = sc.nextInt();

        Produto produto = new Produto(nome, preco, quantidade);
        produtos.add(produto);

        System.out.println("Produto cadastrado com sucesso!");
    }

    public void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            System.out.println("Produtos cadastrados: ");
            for (Produto produto : produtos) {
                System.out.println(produto);
            }
        }
    }
         public void comprarProduto() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do produto que deseja comprar");
        String nome = sc.nextLine();

        Produto produto = encontrarProduto(nome);
        if (produto != null) {
            System.out.println("Digite a quantidade que deseja comprar : ");
            int quantidade = sc.nextInt();
            
            if (quantidade <= produto.getQuantidade()) {
                produto.setQuantidade(produto.getQuantidade()-quantidade);
                double total = quantidade * produto.getPreco();
                System.out.println("O valor da compra é "+total+"\nInforme a forma de pagamento");
                System.out.println("1-Pix, 2-Credito, 3-Debito");
                int pagamento = sc.nextInt();
                switch (pagamento) {
                    case 1:
                        System.out.println("Compra realizada com sucesso! Total: R$ "+ total);
                        break;
                    case 2:
                            System.out.println("Compra realizada com sucesso! Total: R$ "+ total);
                            break;
                    case 3:
                        System.out.println("Compra realizada com sucesso! Total: R$ "+ total);
                        break;
                    default:
                        System.out.println("Opção inválida! Tente novamente.");
                }
            }else {
                System.out.printf("Quantidade indisponível. Estoque atual: ", produto.getQuantidade());
            }
        }else {
            System.out.println("Produto não encontrado.");
        }

    }
    private Produto encontrarProduto(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                return produto;
            }
        }
        return null; // Produto não encontrado
    }
}
