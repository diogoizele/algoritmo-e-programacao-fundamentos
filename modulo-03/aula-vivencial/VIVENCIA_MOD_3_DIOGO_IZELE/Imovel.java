public class Imovel {
    private String endereco;
    private double valorVenda;
    private double valorAluguel;
    private boolean novo;
    
    public Imovel (String endereco, double valorVenda, double valorAluguel, boolean novo) {
        this.endereco = endereco;
        this.valorVenda = valorVenda;
        this.valorAluguel = valorAluguel;
        this.novo = novo;
    }
    
    public String getEndereco() {
        return this.endereco;
    }
    
    public double getValorVenda() {
        return this.valorVenda;
    }
    
    public double getValorAluguel() {
        return this.valorAluguel;
    }
    
    public boolean isNovo() {
        return this.novo;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }
    
    public void setValorAluguel(double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }
    
    public void setNovo(boolean novo) {
        this.novo = novo;
    }
    
    public String toString() {
        return "Endereço: " + this.endereco + "\nValor venda: " + this.valorVenda + "\nValor aluguél: " + this.valorAluguel + "\nImóvel é novo? " + this.novo;
    }
    
    public double calculaImposto() {
        if (this.novo)
            return this.valorVenda * 15 / 100;
        else 
            return this.valorAluguel * 10 / 100;
    }

}