public class App {
    public static void main(String[] args) throws Exception {
        Cliente c1 = new Cliente("Gustavo", new Endereco("Felipe dos Santos", 45, "Nova Mairinque", 18120000, "SP"),
                04112023);
        // System.out.println(
        //         "Nome: " + c1.getNome() + "\n" + c1.getEndereco() + "\nData de Cadastro: " + c1.getDataCadastro());
        // System.out.println(c1.toString());

        PessoaFisica pf1 = new PessoaFisica("Gustavo",new Endereco("Felipe dos Santos", 45, "Nova Mairinque", 18120000, "SP"),04112003,"123456",5);

        System.out.println(pf1.toString());
    }
}
