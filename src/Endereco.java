public class Endereco {
    private String rua;
    private int numero;
    private String bairro;
    private int CEP;
    private String cidade;
    private String estado;

    public Endereco(String rua, int numero, String bairro, int CEP, String cidade, String estado) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.CEP = CEP;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getCEP() {
        return CEP;
    }

    public void setCEP(int CEP) {
        this.CEP = CEP;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade() {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Rua:" + rua + ", numero:" + numero + "\nBairro:" + bairro + "\nCEP:" + CEP + ", Cidade:"
                + cidade + " - Estado: " + estado;
    }
}
