public class Pessoa {
    private String nome;
    private char sexo;
    private int idade;
    private double altura;
    private int quantidadeIrmaos;
    private String endereco;
    
    public Pessoa(
    String nome,
    char sexo,
    int idade,
    double altura,
    int quantidadeIrmaos,
    String endereco) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.altura = altura;
        this.quantidadeIrmaos = quantidadeIrmaos;
        this.endereco = endereco;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public char getSexo() {
        return this.sexo;
    }
    
    public void setSexo() {
        this.sexo = sexo;
    }
    
    public int getIdade() {
        return this.idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return this.altura;
    }
    
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public int getQuantidadeIrmaos() {
        return this.quantidadeIrmaos;
    }
    
    public void setQuantidadeIrmaos(int quantidadeIrmaos) {
        this.quantidadeIrmaos = quantidadeIrmaos;
    }
    
    public String getEndereco() {
        return this.endereco;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public void imprimeInformacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Sexo: " + this.sexo);
        System.out.println("Idade: " + this.idade);
        System.out.println("Altura: " + this.altura);
        System.out.println("Quantidade de irmãos: " + this.quantidadeIrmaos);
        System.out.println("Endereço: " + this.endereco);
    }
    
    public boolean isFilhoUnico() {
        if (this.quantidadeIrmaos == 0)
            return true;
        else
            return false;
    }
}