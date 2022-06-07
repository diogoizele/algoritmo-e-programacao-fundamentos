public class Produto {
    private String nome;
    private double preco;
    private Data dataValidade;

    public Produto(String nome, double preco, Data dataValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }
    
    public String toString() {
        return "Nome: " + this.nome + "\nPreço: " + this.preco + " reais\nData de validade: " + this.dataValidade;
    }
    
    public void setNome (String nome) {
        this.nome = nome;
    }
    
    public void setPreco (double preco) {
        this.preco = preco;
    }
    
    public void setDataValidade (Data dataValidade) {
        this.dataValidade = dataValidade;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public double getPreco() {
        return this.preco;
    }
    
    public Data getDataValidade() {
        return this.dataValidade;
    }
    
    
    public boolean verificaProdutoVencido(Data data) {
        if (data.getAno() > this.dataValidade.getAno())
            return true;
        else if (data.getAno() >= this.dataValidade.getAno()
        && data.getMes() > this.dataValidade.getMes())
            return true;
        else if (data.getAno() >= this.dataValidade.getAno()
        && data.getMes() >= this.dataValidade.getMes()
        && data.getDia() > this.dataValidade.getDia())
            return true;
        else
            return false;            
    }
}