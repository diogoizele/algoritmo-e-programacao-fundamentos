/**
 * A classe Gerador trata-se de uma classe auxiliar, que não 
 * foi cobrado no trabalho, porém, para manter uma organização
 * e um código um pouco mais limpo, fiz ela para gerar as 20 
 * pessoas do sistema com seus respectivos nomes etc...
 */
public class Gerador {
    public static String[] nomes = {"João", "Pedro", "Diogo", "Lucas", "Carlos", 
    "Márcio", "Nicolas", "Emanuel", "Matheus", "Felipe", "Guilherme",
    "Ana", "Luiza", "Júlia", "Clara", "Amanda", "Bianca", "Caroline",
    "Patrícia", "Aurora", "Vitória", "Nicole", "Beatriz", "Isadora"};
    public static String[] sobrenomes = {"Silva", "Santos", "Oliveira", "Conceição",
    "Buarque", "Veloso", "Souza", "Almeida", "Alves", "Andrade", "Barbosa",
    "Batista", "Barros", "Borges", "Campos", "Braga"};        
            
    
    public static int geraAleatorio(int max) {
        return (int) (Math.random() * max) + 1;
    }
    
    public static String geraNome() {
        int aleatorioNome = geraAleatorio(nomes.length - 1); 
        int aleatorioSobrenome = geraAleatorio(sobrenomes.length - 1);     
        
        
        return nomes[aleatorioNome] + " " + sobrenomes[aleatorioSobrenome];
    }
    
    public static TeleSena[] geraTelesenas(int quantidade) {
        TeleSena[] t = new TeleSena[quantidade];
        for (int i = 0; i < t.length; i++) {
            t[i] = new TeleSena();
        }
        return t;
    }
}