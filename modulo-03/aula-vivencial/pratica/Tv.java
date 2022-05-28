public class Tv {
    private int quantidadeDeCanais;
    private String canalAtual;
    private boolean smartTv;
    private boolean ligada;
        
    public Tv(int quantidadeDeCanais, String canalAtual, boolean smartTv, boolean ligada) {
        this.quantidadeDeCanais = quantidadeDeCanais;
        this.canalAtual = canalAtual;
        this.smartTv = smartTv;
        this.ligada = ligada;
    }

    public int getQuantidadeDeCanais() {
        return this.quantidadeDeCanais;
    }
    
    public String getCanalAtual() {
        return this.canalAtual;
    }
    
    public boolean isSmartTv() {
        return this.smartTv;
    }
    
    public boolean isLigada() {
        return this.ligada;
    }
    
    public void setQuantidadeDeCanais(int quantidadeDeCanais) {
        this.quantidadeDeCanais = quantidadeDeCanais;
    }

    public void setCanalAtual(String canalAtual) {
        this.canalAtual = canalAtual;
    }
    
    public void setSmartTv(boolean smartTv) {
        this.smartTv = smartTv;
    }
    
    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }
    
    public String toString() {
        String tv = ">>>TV<<<";
        tv += "\nQuantidade de canais: " + this.quantidadeDeCanais;
        tv += "\nCanal atual: " + this.canalAtual;
        tv += "\nÉ uma smart tv? " + this.smartTv;
        tv += "\nEstá ligada? " + this.ligada;
        
        return tv;
    }
    
    public void imprimirInformacoes() {
        System.out.println(this.toString());
    }
    
    public void acessarWebsite(String url) {
        if (this.smartTv) {
            System.out.println("Tv acessando o endereço " + url);
        } else {
            System.out.println("Esta TV não é smart e não pode acessar o endereço " + url);
        }
    }
    
}