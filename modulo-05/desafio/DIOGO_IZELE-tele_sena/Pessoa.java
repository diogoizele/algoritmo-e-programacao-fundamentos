public class Pessoa {
    private String nome;
    private TeleSena[] telesenas;
    private double premiacoes;
    // quantidade telesenas
    
    
    public Pessoa(String nome, TeleSena[] telesenas){
        this.nome = nome;
        this.telesenas = telesenas;
        this.premiacoes = 0;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setTelesenas(TeleSena[] telesenas) {
        this.telesenas = telesenas;
    }
    
    public void setPremiacoes(double premiacoes) {
        this.premiacoes = premiacoes;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public TeleSena[] getTelesenas() {
        return this.telesenas;
    }
    
    public double getPremiacoes() {
        return this.premiacoes;
    }
    
    public String toString() {
        return "\nNome: " + this.nome + "\nQuantidade de tele senas: " + this.telesenas.length + "\nPremiações: " + this.premiacoes;
    }
    
    public void addTelesena(TeleSena telesena) {
        for (int i = 0; i < this.telesenas.length; i++) {
            if (this.telesenas[i] == null) {
                this.telesenas[i] = telesena;
                break;
            }
        }
    }
    
    public float compraTelesena(TeleSena telesena) {
        addTelesena(telesena);
        return 10;
    }
    
}