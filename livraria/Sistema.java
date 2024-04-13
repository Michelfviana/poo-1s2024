package livraria;
import java.util.Scanner;

public class Sistema {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        Livraria livraria = new Livraria();

        while (opcao !=4) {
            System.out.println("1 - Adicionar livro");
            System.out.println("2 - Listar livros");
            System.out.println("3 - Detalhar livro");
            System.out.println("4 - Sair");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Adicionar livro\n");
                    int id;
                    String titulo;
                    String nomeAutor;
                    String anoPublicacao;
                    String editora;

                    System.out.println("Id:");
                    id = sc.nextInt();
                    sc.nextLine();

                    System.out.println("titulo:");
                    titulo = sc.nextLine();

                    System.out.println("Autor");
                    nomeAutor = sc.nextLine();

                    System.out.println("anoPublicacao");
                    anoPublicacao = sc.nextLine();

                    System.out.println("editora");
                    editora = sc.nextLine();

                    Livro l = new Livro(id , titulo, nomeAutor, anoPublicacao, editora);
                    livraria.cadastrarLivro(l);
                    break;
                case 2:
                    System.out.println("Listar livro\n");
                    System.out.println(livraria.listarLivros());
                    break;
                case 3:
                    System.out.println("Detalhar livro\n");
                    int id;
                    System.out.println("Id: ");
                    id = sc.nextInt();
                    sc.nextLine();
                    System.out.println(livraria.detalharLivroPorId(id));
                    break;
                case 4:
                    System.out.println("Encerrando o sistema\n");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }

        }
        sc.close();
    }

}

public static criarLivro()