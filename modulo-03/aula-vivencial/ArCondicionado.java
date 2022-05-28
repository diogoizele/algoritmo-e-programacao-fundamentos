public class ArCondicionado {
    private int temperaturaMinima;
    private int temperaturaMaxima;
    private int temperaturaAtual;
    private boolean quenteEFrio; // Se {false}, nosso ar condicionado será apenas frio
    
    public ArCondicionado(int temperaturaMinima, int temperaturaMaxima, int temperaturaAtual, boolean quenteEFrio) {
        this.temperaturaMinima = temperaturaMinima;
        this.temperaturaMaxima = temperaturaMaxima;
        this.temperaturaAtual = temperaturaAtual;
        this.quenteEFrio = quenteEFrio;
    }
    
    public int getTemperaturaMinima () {
        return this.temperaturaMinima;
    }
    
    public int getTemperaturaMaxima () {
        return this.temperaturaMaxima;
    }
    
    public int getTemperaturaAtual() {
        return this.temperaturaAtual;
    }
    
    public boolean isQuenteEFrio() {
        return this.quenteEFrio;
    }
    
    public void setTemperaturaMinima(int temperaturaMinima) {
        this.temperaturaMinima = temperaturaMinima;
    }
    
    public void setTemperaturaMaxima(int temperaturaMaxima) {
        this.temperaturaMaxima = temperaturaMaxima;
    }
    
    public void setTemperaturaAtual(int temperaturaAtual) {
        this.temperaturaAtual = temperaturaAtual;
    }
    
    public void setQuenteEFrio(boolean quenteEFrio) {
        this.quenteEFrio = quenteEFrio;
    }
    
    public String toString() {
        return ">>>Ar condicionado:<<<\nTemperatura mínima: " + this.temperaturaMinima + "\nTemperatura máxima: " + this.temperaturaMaxima + "\nTemperaturaAtual: " + this.temperaturaAtual + "\nQuente e frio? " + this.quenteEFrio;
    }
    
    public void imprimirInformacoes () {
        System.out.println(this.toString());
    }
    
    public boolean ajustaTemperaturaAtual() {
        if (this.temperaturaAtual < this.temperaturaMinima) {
            this.temperaturaAtual = this.temperaturaMinima;
            return true;
        } 
        
        if (this.temperaturaAtual > this.temperaturaMaxima) {
            this.temperaturaAtual = this.temperaturaMaxima;
            return true;
        }
        
        return false;
    }
}