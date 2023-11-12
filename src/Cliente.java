public class Cliente {

    private String nome;
    private Endereco endereco;
    private int dataCadastro;

    
    public Cliente(String nome, Endereco endereco, int dataCadastro) {
        this.nome = nome;
        this.endereco = endereco;
        this.dataCadastro = dataCadastro;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public int getDataCadastro() {
        return dataCadastro;
    }
    public void setDataCadastro(int dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String paraString() {
        String dadosCliente = "Nome: " + nome + "\nEndereço: " + endereco + "\nData de Cadastro: " + dataCadastro;
        return dadosCliente;
    }
}
