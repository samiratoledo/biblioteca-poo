
public class Usuario {

    private final String codigo;
    private final String nome;
    private final String cpf;
    private final String email;
    private static int contador = 0;
    //private int numeroLivros = 0;

    public Usuario(String nome, String cpf, String email) {
        this.codigo = "U" + contador++;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    /*public int getNumeroLivros() {
        return numeroLivros;
    }*/
}
