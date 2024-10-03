package conhecimento;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CadastroProduto cadastro = new CadastroProduto();
        int opcao;
        
        do{
            System.out.println("1. Cadastrar Produto");
            System.out.println("2. Listar Produtos");
            System.out.println("3. Comprar Produtos");
            System.out.println("0. Sair");
            opcao = sc.nextInt();
            
            switch(opcao){
                case 1:
                    cadastro.cadastrarProduto();
                    break;
                case 2:
                    cadastro.listarProdutos();
                    break;
                case 3:
                    cadastro.comprarProduto();
                    break;
                case 0:
                    System.out.println("Saindo ...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }while(opcao != 0);
     sc.close();
    }
}