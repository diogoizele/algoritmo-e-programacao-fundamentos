public class SegundaDivisao extends Time {
    private int anosNaSegundaDivisao;
    
    public SegundaDivisao(String nome, int quantidadeSocios, int anosNaSegundaDivisao) {
        super(nome, quantidadeSocios);
        this.anosNaSegundaDivisao = anosNaSegundaDivisao;
    }
    
    public int getAnosNaSegundaDivisa() {
        return this.anosNaSegundaDivisao;
    }
    
    public void setAnosNaSegundaDivisao(int anosNaSegundaDivisao) {
        this.anosNaSegundaDivisao = anosNaSegundaDivisao;
    }
    
    public String toString() {
        return super.toString() + "\nAnos na segunda divisão: " + this.anosNaSegundaDivisao + "\n";
    }
}