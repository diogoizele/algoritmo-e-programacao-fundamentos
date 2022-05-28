public class ContaCorrente {
    private int numero;
    private double saldo;
    
    public ContaCorrente(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }
    
    public int getNumero() {
        return this.numero;
    }
    
    public double getSaldo() {
        return this.saldo;    
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public String toString() {
        return "N�mero - " + this.numero + "\nSaldo: " + this.saldo + " (em reais)";
    }
    
    public void efetuaDeposito(double valor) {
        if (valor < 0) 
            System.out.println("Erro: voc� n�o pode depositar um valor inv�lido (negativo)!");
        else 
            this.saldo += valor;            
    }
    
    public void efetuaSaque(double valor) {
        if (valor > 0 && valor < this.saldo) 
            this.saldo -= valor; 
        if (valor < 0) 
            System.out.println("Erro: voc� n�o pode sacar um valor inv�lido (negativo)!");
        if (valor > this.saldo)
            System.out.println("Sinto muito mas voc� n�o tem saldo suficiente para o saque!");
    }
    
}