import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Compra {
    private int identificador;
    private Date data;
    private double valorTotal;
    private String CPFOuCNPJ;
    private double totalPago;
    private List<ItemDeCompra> itens;

    public Compra(int identificador, Date data, double valorTotal, String CPFOuCNPJ) {
        this.identificador = identificador;
        this.data = data;
        this.valorTotal = valorTotal;
        this.CPFOuCNPJ = CPFOuCNPJ;
        this.itens = new ArrayList<>();
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getCPFOuCNPJ() {
        return CPFOuCNPJ;
    }

    public void setCPFOuCNPJ(String CPFOuCNPJ) {
        this.CPFOuCNPJ = CPFOuCNPJ;
    }

    public double getTotalPago() {
        return totalPago;
    }

    public void setTotalPago(double totalPago) {
        this.totalPago = totalPago;
    }
}
