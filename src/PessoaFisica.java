public class PessoaFisica extends Cliente {
    private String CPF;
    private int qtdMaxParcelas;

    public PessoaFisica(String nome, Endereco endereco, int dataCadastro, String CPF, int qtdMaxParcelas) {
        super(nome, endereco, dataCadastro);
        this.CPF = CPF;
        this.qtdMaxParcelas = qtdMaxParcelas;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public int getQtdMaxParcelas() {
        return qtdMaxParcelas;
    }

    public void setQtdMaxParcelas(int qtdMaxParcelas) {
        qtdMaxParcelas = qtdMaxParcelas;
    }

    public String paraString() {
        String dadosPessoaFisica = "PessoaFisica {" +
                "nome = " + getNome() + '\'' +
                ", endereço = " + getEndereco() +
                ", dataCadastro = " + getDataCadastro() +
                ", cpf = " + CPF + '\'' +
                ", quantidadeMaximaParcelas = " + qtdMaxParcelas +
                '}';
        return dadosPessoaFisica;
    }
}
