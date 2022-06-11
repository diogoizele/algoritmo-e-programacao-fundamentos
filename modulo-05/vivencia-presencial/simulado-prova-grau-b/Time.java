public class Time {
    private String nome;
    private Socio[] socios;
    
    public Time(String nome, int quantidadeSocios) {
        this.nome = nome;
        this.socios = new Socio[quantidadeSocios];
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Socio[] getSocios() {
        return this.socios;
    }
    
    public void setSocios(Socio[] socios) {
        this.socios = socios;
    }
    
    public String toString() {
        String mostraTime = "\n--->TIME<---\nNome: " + this.nome + "\nSocios: ";
        for (int i = 0; i < this.socios.length; i++) {
            if (this.socios[i] != null) {
                mostraTime += "\n" + this.socios[i].toString();
            }
        }
        
        return mostraTime;
    }
    
    public boolean insereSocio(Socio socio) {
        boolean inseriuCorretamente = false;
        
        for (int i = 0; i < this.socios.length; i++) {
            if (this.socios[i] == null) {
                this.socios[i] = socio;
                inseriuCorretamente = true;
                break;
            }
        }
        
        return inseriuCorretamente;
    }
    
    public String socioMaisVelho() {
        Socio maisVelhoInicial = new Socio("Inicial", 0);
        
        if (socios[0] != null) {
            maisVelhoInicial = socios[0];
        }
        
        for(int i = 0; i < socios.length; i++) {
            if (socios[i] != null && socios[i].getIdade() > maisVelhoInicial.getIdade()) {
                maisVelhoInicial = socios[i];
            }
        }
        
        return maisVelhoInicial.getNome();
    }
    
    public void imprimeSocios() {
        for(int i = 0; i < socios.length; i++) {
            System.out.println(socios[i].toString());
        }
    }
        
}