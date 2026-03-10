
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        ArrayList<Usuario> usuarios = new ArrayList<>();
        Acervo acervo = new Acervo();

        boolean funcionar = true;
        while (funcionar) {

            System.out.println("===============================");
            System.out.println("=== Bem vindo à Bibliotech  ===");
            System.out.println("===============================");
            System.out.println("== Menu - Escolha uma opção: ==");
            System.out.println("==     1. Listar acervo;     ==");
            System.out.println("==     2. Listar usuários;   ==");
            System.out.println("==     3. Emprestar livro;   ==");
            System.out.println("==     4. Devolver livro;    ==");
            System.out.println("==     5. Cadastrar livro;   ==");
            System.out.println("==     6. Cadastrar usuário  ==");
            System.out.println("==     7. Deletar livro      ==");
            System.out.println("==     8. Deletar usuário    ==");
            System.out.println("==     0. Sair               ==");
            System.out.println("===============================");

            int escolhaMenu = sc.nextInt();
            sc.nextLine();

            switch (escolhaMenu) {

                case 1:

                    System.out.println("\n=== ACERVO ===");
                    acervo.listarLivros();

                    break;

                case 2:

                    System.out.println("\n=== USUÁRIOS ===");

                    if (usuarios.isEmpty()) {
                        System.out.println("Nenhum usuário cadastrado.");
                    } else {

                        for (Usuario u : usuarios) {

                            System.out.println(
                                    u.getCodigo() + " | "
                                    + u.getNome() + " | "
                                    + u.getEmail());
                        }
                    }

                    break;

                case 3:

                    System.out.println("\n=== EMPRÉSTIMO ===");

                    if (acervo.getObras().isEmpty() || usuarios.isEmpty()) {
                        System.out.println("Cadastre livros e usuários primeiro.");
                        break;
                    }

                    for (int i = 0; i < acervo.getObras().size(); i++) {

                        Livro livro = acervo.getObras().get(i);

                        String status = livro.isDisponivel() ? "Disponível" : "Emprestado";

                        System.out.println(i + " - " + livro.getNome() + " (" + status + ")");
                    }

                    System.out.println("Escolha o livro:");
                    int livroIndex = sc.nextInt();

                    if (livroIndex < acervo.getObras().size()) {

                        for (int i = 0; i < usuarios.size(); i++) {

                            System.out.println(i + " - " + usuarios.get(i).getNome());
                        }

                        System.out.println("Escolha o usuário:");
                        int userIndex = sc.nextInt();

                        Livro livro = acervo.getObras().get(livroIndex);

                        if (livro.isDisponivel()) {

                            livro.setDisponivel(false);
                            livro.setLocatario(usuarios.get(userIndex));

                            System.out.println("Livro emprestado com sucesso!");
                        } else {

                            System.out.println("Livro já emprestado.");
                        }
                    } else {
                        System.out.println("Esse livro não existe.");
                    }
                    break;

                case 4:

                    System.out.println("\n=== DEVOLUÇÃO ===");

                    if (acervo.getObras().isEmpty()) {
                        System.out.println("Cadastre livros primeiro.");
                        break;
                    }

                    for (int i = 0; i < acervo.getObras().size(); i++) {

                        Livro livroAtual = acervo.getObras().get(i);

                        if (!livroAtual.isDisponivel()) {

                            System.out.println(i + " - " + livroAtual.getNome());
                        }
                    }

                    System.out.println("Escolha o livro para devolver:");

                    int devolucao = sc.nextInt();

                    if (devolucao < acervo.getObras().size()) {

                        Livro livroDev = acervo.getObras().get(devolucao);

                        livroDev.setDisponivel(true);
                        livroDev.setLocatario(null);

                        System.out.println("Livro devolvido!");
                    } else {
                        System.out.println("Esse livro não existe!");
                    }

                    break;

                case 5:

                    System.out.println("\n=== CADASTRAR LIVRO ===");

                    System.out.println("Nome:");
                    String nomeLivro = sc.nextLine();

                    System.out.println("Autor:");
                    String autor = sc.nextLine();

                    Livro novoLivro = new Livro(nomeLivro, autor);

                    acervo.adicionarLivro(novoLivro);

                    System.out.println("Livro cadastrado!");

                    break;

                case 6:

                    System.out.println("\n=== CADASTRAR USUÁRIO ===");

                    System.out.println("Nome:");
                    String nome = sc.nextLine();

                    System.out.println("CPF:");
                    String cpf = sc.nextLine();

                    System.out.println("Email:");
                    String email = sc.nextLine();

                    Usuario novoUsuario = new Usuario(nome, cpf, email);

                    usuarios.add(novoUsuario);

                    System.out.println("Usuário cadastrado!");

                    break;

                case 7:
                    System.out.println("\n=== DELETAR LIVRO ===");

                    if (acervo.getObras().isEmpty()) {
                        System.out.println("Não há livros para serem deletados.");
                    } else {

                        acervo.listarLivros();
                        System.out.println("Digite o número do livro que quer deletar: ");
                        int deletar = sc.nextInt();

                        if (deletar >= acervo.getObras().size()) {
                            System.out.println("Esse livro não existe.");

                        } else {
                            acervo.getObras().remove(deletar);
                            System.out.println("Livro removido com sucesso");
                        }
                    }

                    break;

                case 8:
                    System.out.println("\n=== DELETAR USUÁRIO ===");

                    if (usuarios.isEmpty()) {
                        System.out.println("Não há usuários para serem deletados.");
                    } else {

                        for (Usuario u : usuarios) {
                            System.out.println(
                                    u.getCodigo() + " | "
                                    + u.getNome() + " | "
                                    + u.getEmail());
                        }

                        System.out.println("Digite o número do usuário que quer deletar: ");
                        int deletar = sc.nextInt();

                        if (deletar >= usuarios.size()) {
                            System.out.println("Esse usuário não existe.");
                        } else {
                            usuarios.remove(deletar);

                            System.out.println("Usuário removido com sucesso");
                        }

                    }

                    break;

                case 0:

                    funcionar = false;
                    System.out.println("\nSistema encerrado.");

                    break;

                default:
                    System.out.println("\nOpção inválida.");
            }
        }

        sc.close();
    }
}
