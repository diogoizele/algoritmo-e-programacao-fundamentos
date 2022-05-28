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
        return "Número - " + this.numero + "\nSaldo: " + this.saldo + " (em reais)";
    }
    
    public void efetuaDeposito(double valor) {
        if (valor < 0) 
            System.out.println("Erro: você não pode depositar um valor inválido (negativo)!");
        else 
            this.saldo += valor;            
    }
    
    public void efetuaSaque(double valor) {
        if (valor > 0 && valor < this.saldo) 
            this.saldo -= valor; 
        if (valor < 0) 
            System.out.println("Erro: você não pode sacar um valor inválido (negativo)!");
        if (valor > this.saldo)
            System.out.println("Sinto muito mas você não tem saldo suficiente para o saque!");
    }
    
}