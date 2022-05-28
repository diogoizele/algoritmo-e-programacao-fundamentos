public class Produto {
    private String nome;
    private String marca;
    private double preco;
    private boolean importado;
    
    public Produto(String nome, String marca, double preco, boolean importado) {
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
        this.importado = importado;
    }
    
    
    public String getNome() {
        return this.nome;
    }
    
    public String getMarca() {
        return this.marca;
    }
    
    public double getPreco() {
        return this.preco;
    }
    
    public boolean isImportado() {
        return this.importado;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;    
    }
    
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public void setImportado(boolean importado) {
        this.importado = importado;
    }


    public String toString() {
        return "Nome: " + this.nome + "\nMarca: " + this.marca + "\nPreço: " + this.preco + "\nProduto é importado? " + this.importado;
    }
    
    public void imprimirInformacoes() {
        System.out.println(this.toString());
    }
}