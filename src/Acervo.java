
import java.util.ArrayList;

public class Acervo {

    private final ArrayList<Livro> obras = new ArrayList<>();

    public void adicionarLivro(Livro livro) {
        obras.add(livro);
    }

    public void listarLivros() {

        if (obras.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
        } else {

            for (Livro livro : obras) {

                String status = livro.isDisponivel() ? "Disponível" : "Emprestado";

                System.out.println(
                        livro.getCodigo() + " | "
                        + livro.getNome() + " | "
                        + livro.getAutor() + " | "
                        + status);
            }
        }
    }

    public void removerLivros(int deletar) {

        if (obras.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
        } else {

        }
    }

    public ArrayList<Livro> getObras() {
        return obras;
    }
}
