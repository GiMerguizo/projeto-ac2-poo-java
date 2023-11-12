import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int opcao, dataCadastro;
        String nome;
        Scanner entrada = new Scanner(System.in);
        Scanner entradaStr = new Scanner(System.in);

        // Cliente c1 = new Cliente("Gustavo", new Endereco("Felipe dos Santos", 45, "Nova Mairinque", 18120000, "SP"),
        Endereco e1 = new Endereco("Rua ABC", 41, "CBA", 1234, "MK", "SP");
        //Cliente c1 = new Cliente("Gustavo", e1, 11112023);

        // System.out.println(
        //         "Nome: " + c1.getNome() + "\n" + c1.getEndereco() + "\nData de Cadastro: " + c1.getDataCadastro());
        // System.out.println(c1.toString());

        //PessoaFisica pf1 = new PessoaFisica("Gustavo",new Endereco("Felipe dos Santos", 45, "Nova Mairinque", 18120000, "SP"),04112003,"123456",5);
        PessoaFisica pf1 = new PessoaFisica("Gustavo", e1, 17102021, "1234", 2);
        PessoaJuridica pj1 = new PessoaJuridica("POO", e1, 20022000, "123456", "a",
                10);

        System.out.println(e1.paraString());
        //System.out.println(c1.paraString());
        System.out.println(pf1.paraString());
        System.out.println(pj1.paraString());

        while (true) {
            System.out.println("----- Menu -----");
            System.out.println("[1] Cadastro Cliente");
            System.out.println("[2] Deletar cliente pelo CPF ou CNPJ");
            System.out.println("[3] Deletar cliente pelo nome");
            System.out.println("[4] Cadastro de Produtos");
            System.out.println("[5] Efetuação de uma compra");
            System.out.println("[6] Atualização de pagamento");
            System.out.println("[7] Relatórios");
            System.out.println("[8] Sair");
            System.out.println("-------------");

            System.out.println("Opção: ");
            opcao = entrada.nextInt();

            if (opcao == 1) {
                System.out.println("Cadastro de Clientes");
                for(int i = 0; i < 1; i++) {
                    System.out.println("Nome: ");
                    nome = entradaStr.nextLine();
                    System.out.println("Data de cadastro: ");
                    dataCadastro = entrada.nextInt();

                    Cliente c1 = new Cliente(nome, e1, dataCadastro);
                    System.out.println(c1.paraString());
                }
            } else
            if (opcao == 8){
                System.out.println("Encerrando programa...");
                break;
            } else
                System.out.println("Algo deu errado! Tente novamente!");
        }
    }
}
