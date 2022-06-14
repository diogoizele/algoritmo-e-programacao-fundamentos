public class Pessoa {
    private String nome;
    private TeleSena[] telesenas = new TeleSena[15];
    private double premiacoes;
    
    public Pessoa(String nome, TeleSena[] telesenas, double premiacoes){
        this.nome = nome;
        this.telesenas = telesenas;
        this.premiacoes = premiacoes;
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
}