public class Socio {
    private String nome;
    private int idade;
    
    Socio (String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public int getIdade() {
        return this.idade;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    @Override
    public String toString() {
        return "--->SÓCIO<---\nNome: " + this.nome + "\nIdade: " + this.idade;
    }
}