public class Pessoa {
    private String nome;
    private TeleSena teleSenas[];
    private double premiacoes;
    
    public Pessoa(String nome, TeleSena[] teleSenas) {
        this.nome = nome;
        this.teleSenas = teleSenas;
    }
    
    public TeleSena[] getTeleSenas() {
        return teleSenas;
    }
    
    public String getNome() {
        return this.nome;
    }
    
     
    public String toString() {
        return "\nNome: " + this.nome + "\nQuantidade de tele senas: " + this.teleSenas.length + "\nPremiações: " + this.premiacoes;
    }
    
    public void ganhaPremio(int quantTeleSenas) {
        this.premiacoes = quantTeleSenas * 10 * 0.8;
    }
}