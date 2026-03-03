import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        boolean funcionar = true;
        while (funcionar) {

            System.out.println("============================");
            System.out.println("== Bem vindo à Bibliotech ==");
            System.out.println("============================");

            System.out.println("Digite seu nome: ");
            String nomeUsuario = sc.next();

            System.out.println("===============================");
            System.out.println("== Menu - Escolha uma opção: ==");
            System.out.println("==     1. Listar acervo;     ==");
            System.out.println("==     2. Listar usuários;   ==");
            System.out.println("==     3. Emprestar livro;   ==");
            System.out.println("==     4. Devolver livro;    ==");
            System.out.println("==     5. Cadastrar livro;   ==");
            System.out.println("==     6. Cadastrar usuário  ==");
            System.out.println("==     7. Sair               ==");
            System.out.println("===============================");

            int escolhaMenu = sc.nextInt();

            switch (escolhaMenu) {
                case 1:
                    System.out.println("LISTA DO ACERVO");

                    break;
                case 2:
                    System.out.println("LISTA DE USUÁRIOS");

                    break;
                case 3:
                    System.out.println("EMPRÉSTIMO DE LIVROS");

                    break;
                case 4:
                    System.out.println("DEVOLUÇÃO DE LIVRO");

                    break;
                case 5:
                    System.out.println("CADASTRO DE LIVRO");

                    break;
                case 6:
                    System.out.println("CADASTRO DE USUÁRIO");

                    break;
                case 7:
                    funcionar = false;
                    System.out.println("Até a próxima!");

                    break;

                default:
                    System.out.println("Opção inválida");
                    break;
            }

            //System.out.println("Já possui cadastro? Digite 1.\n Quero me cadastrar! Digite 2.");
            int resp = sc.nextInt();

            if (resp == 1) {

            } else if (resp == 2) {
                Usuario user = new Usuario(nomeUsuario);
                // user.nome = nomeUsuario;
                // System.out.println("Olá " + user.getNome() + "\nDigite seu cpf: ");
                // String cpfUsuario = sc.next();
                // user.cpf = cpfUsuario;

            }
        }

    }
}
