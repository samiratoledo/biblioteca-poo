public class Usuario {
    String nome;
    String cpf;

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
