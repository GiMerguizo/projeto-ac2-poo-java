import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Produto {
    private int codigo;
    private String nome;
    private String descricao;
    private double preco;
    private boolean perecivel;
    private String dataValidade;

    // Construtor, getters e setters


    public Produto(int codigo, String nome, String descricao, double preco, boolean perecivel, String dataValidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.perecivel = perecivel;
        this.dataValidade = dataValidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isPerecivel() {
        return perecivel;
    }

    public void setPerecivel(boolean perecivel) {
        this.perecivel = perecivel;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public boolean estaVencido() {
        // Verificar apenas se o produto é perecível
        if (!perecivel) {
            return false;
        }

        // Obtém a data atual
        Date dataAtual = new Date();

        // Converte a data de validade do produto para o tipo Date
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date dataValidadeFormatada = sdf.parse(dataValidade);

            // Compara as datas
            return dataAtual.after(dataValidadeFormatada);
        } catch (ParseException e) {
            e.printStackTrace();
            return false; // Em caso de erro na conversão, assume que o produto está vencido
        }
    }
}
