public class Cliente {
    private int id;
    private String nome;
    private char sexo;
    private int idade;
    
    public Cliente(int id, String nome, char sexo, int idade) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public int getId() {
        return this.id;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
    public char getSexo() {
        return this.sexo;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public int getIdade() {
        return this.idade;
    }
    
    public String toString() {
        return "Id: " + this.id + "\nNome: " + this.nome + "\nSexo: " + this.sexo + "\nIdade: " + this.idade;
    }
    
    public void imprimirInformacoes() {
        System.out.println(this.toString());
    }

}