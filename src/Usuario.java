public class Usuario {

    private String codigo;
    private String nome;
    private String cpf;
    private String email;

    public Usuario (String nome) {
        this.nome = nome;
    }

    public String getNome () {
        return nome;
    }

    public String getDocumento () {
        return nome;
    }

    public Boolean verificacaoDocumento() {
        return true;
    }
}
