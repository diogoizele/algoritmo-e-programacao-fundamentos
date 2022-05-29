public class Eletrodomestico {
    private int voltagem;
    private double preco;
    private String marca;
    private String cor;
    private boolean biVolt;
    
    public Eletrodomestico(
    int voltagem,
    double preco,
    String marca,
    String cor,
    boolean biVolt) {
        this.voltagem = voltagem;
        this.preco = preco;
        this.marca = marca;
        this.cor = cor;
        this.biVolt = biVolt;
    }
    
    public void setVoltagem (int voltagem) {
        this.voltagem = voltagem;
    }
    
    public int getVoltagem () {
        return this.voltagem;
    }
    
    public void setPreco (double preco) {
        this.preco = preco;
    }
    
    public double getPreco() {
        return this.preco;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String getMarca() {
        return this.marca;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public String getCor() {
        return this.cor;
    }
    
    public void setBiVolt(boolean biVolt) {
        this.biVolt = biVolt;
    }
    
    public boolean isBiVolt (){
        return this.biVolt;
    }
    
}