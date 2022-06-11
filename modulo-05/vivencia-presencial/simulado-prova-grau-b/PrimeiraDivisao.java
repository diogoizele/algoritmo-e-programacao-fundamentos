public class PrimeiraDivisao extends Time {
    private int posicaoNoRanking;
    
    public PrimeiraDivisao (String nome, int quantidadeSocios, int posicaoNoRanking) {
        super(nome, quantidadeSocios);
        this.posicaoNoRanking = posicaoNoRanking;
    }
    
    public int getPosicaoNoRanking() {
        return this.posicaoNoRanking;
    }
    
    public void setPosicaoNoRankking(int posicaoNoRanking) {
        this.posicaoNoRanking = posicaoNoRanking;
    }
    
    public String toString() {
        return super.toString() + "\nPosição no ranking: " + this.posicaoNoRanking + "\n";
    }
}