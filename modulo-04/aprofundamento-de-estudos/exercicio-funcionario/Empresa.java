public class Empresa {
    private String nome = "Não informado";
    private FuncionarioCaixa funcionarioCaixa1;
    private FuncionarioCaixa funcionarioCaixa2;
    
    public Empresa(String nome, FuncionarioCaixa f1, FuncionarioCaixa f2) {
        this.nome = nome;
        this.funcionarioCaixa1 = f1;
        this.funcionarioCaixa2 = f2;
    }
    
    public Empresa(String nome) {
        this.nome = nome;
    }
    
    public Empresa() {}
    
    public void setNome(String nome)  {
        this.nome = nome;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setFuncionarioCaixa1(FuncionarioCaixa f1) {
        this.funcionarioCaixa1 = f1;
    }
    
    public FuncionarioCaixa getFuncionarioCaixa1() {
        return this.funcionarioCaixa1;
    }
    
    public void setFuncionarioCaixa2(FuncionarioCaixa f2) {
        this.funcionarioCaixa2 = f2;
    }
    
    public FuncionarioCaixa getFuncionarioCaixa2() {
        return this.funcionarioCaixa2;
    }
    
    public String toString() {
        return "\nEMPRESA\nNome: " + this.nome + "\nFuncionarios:\n1) " + this.funcionarioCaixa1 + "\n2) " + this.funcionarioCaixa2;
    }
    
    public void imprimeInfo() {
        System.out.println(this);
    }
}