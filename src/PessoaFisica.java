public class PessoaFisica extends Cliente {

    private String CPF;
    private int QtdMaxParcelas;

    public PessoaFisica(String nome, Endereco endereco, int dataCadastro, String CPF, int qtdMaxParcelas) {
        super(nome, endereco, dataCadastro);
        this.CPF = CPF;
        QtdMaxParcelas = qtdMaxParcelas;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public int getQtdMaxParcelas() {
        return QtdMaxParcelas;
    }

    public void setQtdMaxParcelas(int qtdMaxParcelas) {
        QtdMaxParcelas = qtdMaxParcelas;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" +
                "nome='" + getNome() + '\'' +
                ", endereço=" + getEndereco() +
                ", dataCadastro=" + getDataCadastro() +
                ", cpf='" + CPF + '\'' +
                ", quantidadeMaximaParcelas=" + QtdMaxParcelas +
                '}';
    }   

    

}
