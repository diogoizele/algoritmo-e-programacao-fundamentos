public class FuncionarioCaixa {
    private String nome = "Anônimo";
    private String endereco = "Não informado";
    private char sexo = 'u';
    private Calculadora calc = new Calculadora("Vermelha");
    
    public FuncionarioCaixa(String nome, String endereco, char sexo, Calculadora calc) {
        this.nome = nome;
        this.endereco = endereco;
        this.sexo = sexo;
        this.calc = calc;
    }
    
    public FuncionarioCaixa() {}
    
    public String getNome() {
        return this.nome;
    }
    
    public String getEndereco() {
        return this.endereco;
    }
    
    public char getSexo() {
        return this.sexo;
    }
    
    public Calculadora getCalc() {
        return this.calc;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
    public void setCalc(Calculadora calc) {
        this.calc = calc;
    }
    
    public double soma(double x, double y) {
         return calc.soma(x, y);   
    }
    
    public double subtracao(double x, double y) {
        return calc.subtracao(x, y);
    }
    
    public double multiplicacao(double x, double y) {
        return calc.multiplicacao(x, y);
    }
    
    public double divisao(double x, double y) {
        return calc.divisao(x, y);
    }
    
    public int elevaAoQuadrado(int x) {
        return calc.elevaAoQuadrado(x);
    }
    
    public int elevaAoCubo(int x) {
        return calc.elevaAoCubo(x);
    }
    
    
    public String toString() {
        return "\nFUNCIONARIO CAIXA\nNome: " + this.nome + "\nEndereco: " + this.endereco + "\nSexo: " + this.sexo + "\n" + this.calc;
    }
    
    public void imprimeInfo() {
        System.out.println(this);
    }
}