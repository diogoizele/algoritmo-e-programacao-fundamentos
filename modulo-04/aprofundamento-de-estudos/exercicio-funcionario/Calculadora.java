public class Calculadora {
    private double memoria = 0;
    private String cor;
    
    public Calculadora(String cor) {
        this.cor = cor;
    }
    
    public void setMemoria(double memoria) {
        this.memoria = memoria;
    }
    
    public double getMemoria() {
        return this.memoria;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public String getCor() {
        return this.cor;
    }
    
    public double soma(double x, double y) {
        this.memoria += x + y;
        return x + y;
    }
    
    public double subtracao(double x, double y) {
        this.memoria += x - y;
        return x - y;
    }
    
    public double multiplicacao(double x, double y) {
        this.memoria += x * y;
        return x * y;
    }
    
    public double divisao(double x, double y) {
        this.memoria += x / y;
        return x / y;
    }
    
    
    public int elevaAoQuadrado(int x) {
        this.memoria += x * x;
        return x * x;
    }
    
    public int elevaAoCubo(int x) {
        this.memoria += x * x * x;
        return x * x * x;
    }
    
    public String toString() {
        return "\nCALCULADORA\nMemória: " + this.memoria + "\nCor: " + this.cor;
    }
    
    public void imprimeInfo() {
        System.out.println(this);
    }
}