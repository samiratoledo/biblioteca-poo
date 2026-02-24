public class App {
    public static void main(String[] args) throws Exception {
        Usuario jose = new Usuario();
        jose.nome = "José";
        jose.cpf = "987.654.321-00";
        System.out.println("Hello " + jose.nome + ", seu CPF é: " + jose.cpf);
    }
}
