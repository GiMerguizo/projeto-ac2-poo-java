public class ItemDeCompra {
    private int quantidade;
    private String nomeDoProduto;
    private double precoUnitario;
    private double valorTotal;

    public ItemDeCompra(int quantidade, String nomeDoProduto, double precoUnitario) {
        this.quantidade = quantidade;
        this.nomeDoProduto = nomeDoProduto;
        this.precoUnitario = precoUnitario;
        this.valorTotal = quantidade * precoUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    public void setNomeDoProduto(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
