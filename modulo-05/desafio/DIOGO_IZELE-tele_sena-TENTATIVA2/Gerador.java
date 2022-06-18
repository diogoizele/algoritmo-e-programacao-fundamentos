public class Gerador {
    public static String[] nomes = {"João", "Pedro", "Diogo", "Lucas", "Carlos", 
    "Márcio", "Nicolas", "Emanuel", "Matheus", "Felipe", "Guilherme",
    "Ana", "Luiza", "Júlia", "Clara", "Amanda", "Bianca", "Caroline",
    "Patrícia", "Aurora", "Vitória", "Nicole", "Beatriz", "Isadora"};
    public static String[] sobrenomes = {"Silva", "Santos", "Oliveira", "Conceição",
    "Buarque", "Veloso", "Souza", "Almeida", "Alves", "Andrade", "Barbosa",
    "Batista", "Barros", "Borges", "Campos", "Braga"};        
    
    public static int[] geraInteiros(int quantidade) {
        int i = 0;
        int[] inteiros = new int[quantidade];
        
        while ( i < inteiros.length) {
            int aleatorio = (int) (Math.random() * 60) + 1;
            boolean valorRepetido = false;
            
            for (int j = 0; j < inteiros.length; j++) {
                valorRepetido = inteiros[j] == aleatorio;
                if (valorRepetido) 
                    break;
            }
            
            if (!valorRepetido) {
                inteiros[i] = aleatorio;
                i++;
            }
        }
        
        return inteiros;
    }
    
    public static int geraAleatorio(int max) {
        return (int) (Math.random() * max) + 1;
    }
    
    public static String geraNome() {
        int aleatorioNome = geraAleatorio(nomes.length - 1); 
        int aleatorioSobrenome = geraAleatorio(sobrenomes.length - 1);     
        
        return nomes[aleatorioNome] + " " + sobrenomes[aleatorioSobrenome];
    }
}