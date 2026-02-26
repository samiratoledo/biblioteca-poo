public class App {
    public static void main(String[] args) throws Exception {
        Usuario user = new Usuario("Jorginho");
        user.nome = "José";
        user.cpf = "987.654.321-00";
        System.out.println("Hello " + user.getNome());
    }
}
