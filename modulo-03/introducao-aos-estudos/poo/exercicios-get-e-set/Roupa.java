public class Roupa {
    private String marca, tamanho, cor, estacao;
    private double preco;
    private char genero;
    
    
    public Roupa(
    String marca,
    String tamanho,
    String cor,
    String estacao,
    double preco,
    char genero) {
        this.marca = marca;
        this.tamanho = tamanho;
        this.cor = cor;
        this.estacao = estacao;
        this.preco = preco;
        this.genero = genero;
    }
    
    public String getMarca() {
        return this.marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String getTamanho() {
        return this.tamanho;
    }
    
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    
    public String getCor() {
        return this.cor;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public String getEstacao() {
        return this.estacao;
    }
    
    public void setEstacao(String estacao) {
        this.estacao = estacao;
    }
    
    public double getPreco() {
        return this.preco;
    }
    
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public char getGenero() {
        return this.genero;
    }
    
    public void setGenero(char genero) {
        this.genero = genero;
    }
}