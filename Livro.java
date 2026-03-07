public class Livro {

    private final String codigo;
    private final String nome;
    private final String autor;
    private boolean disponivel = true;
    private Usuario locatario;

    private static int contador = 1;

    public Livro(String nome, String autor) {
        this.codigo = "L" + contador++;
        this.nome = nome;
        this.autor = autor;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean status) {
        this.disponivel = status;
    }

    public Usuario getLocatario() {
        return locatario;
    }

    public void setLocatario(Usuario locatario) {
        this.locatario = locatario;
    }
}
