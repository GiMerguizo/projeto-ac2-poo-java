public class PessoaJuridica extends Cliente {

    private String CNPJ;
    private String razaoSocial;
    private int prazoMax;

    public PessoaJuridica(String nome, Endereco endereco, int dataCadastro, String CNPJ, String razaoSocial,
                          int prazoMax) {
        super(nome, endereco, dataCadastro);
        this.CNPJ = CNPJ;
        this.razaoSocial = razaoSocial;
        this.prazoMax = prazoMax;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public int getPrazoMax() {
        return prazoMax;
    }

    public void setPrazoMax(int prazoMax) {
        this.prazoMax = prazoMax;

    }

    @Override
    public String toString() {
        return "pessoaJuridica [CNPJ=" + CNPJ + "Endereço" + getEndereco() + ", razaoSocial=" + razaoSocial
                + ", prazoMax="
                + prazoMax + "Data Cadastro" + getDataCadastro() + "]";
    }

}
