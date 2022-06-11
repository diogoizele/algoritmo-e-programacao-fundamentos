public class Principal {
    public static void main(String[] args) {
        int quantidadeDeTimes = 0;
        
        while (quantidadeDeTimes < 1 || quantidadeDeTimes > 50) {
            quantidadeDeTimes = Teclado.leInt("Digite uma quantidade de times entre 1 e 50");
        }
        
        
        Time[] times = new Time[quantidadeDeTimes];    
                
        for (int i = 0; i < quantidadeDeTimes; i++) {
             int aleatorio = (int) (Math.random() * 2) + 1; // 1 = Primeira Divisão | 2 = Segunda Divisão.
             String nome;
             int quantidadeSocios;

             System.out.println(aleatorio);
             
             if (aleatorio == 1) {
                 System.out.println("\nPRIMEIRA DIVISÃO!\n");
                 nome = Teclado.leString("Digite o nome do time: ");
                 quantidadeSocios = Teclado.leInt("Digite a quantidade de socios do time " + nome);
                 
                 times[i] = new PrimeiraDivisao(nome, quantidadeSocios, Teclado.leInt("Digite a posição que " + nome + " está no ranking:"));
             } else {
                 System.out.println("\nSEGUNDA DIVISÃO!\n");
                 nome = Teclado.leString("Digite o nome do time: ");
                 quantidadeSocios = Teclado.leInt("Digite a quantidade de socios do time " + nome);
                 
                 times[i] = new SegundaDivisao(nome, quantidadeSocios, Teclado.leInt("Quantos anos " + nome + " está na segunda divisão?"));
             }
        }
        
        
        String[] nomesFantasias = {"Diogo", "Weslley", "Bruno", "Guilherme", "Pedro"};
        int[] idadesFantasias = {16, 17, 18, 19, 20};
        
        // Itera sobre todos os times
        for (int j = 0; j < times.length; j++) {
            
            // Gera os 20 sócios
            for(int i = 0; i < 20; i++) {
                int nomeAleatorio = (int) (Math.random() * 5);
                int idadeAleatoria = (int) (Math.random() * 5);
        
                System.out.println((i + 1) + ") inseriu sócio no time " + (j + 1) + " ? " + times[j].insereSocio(new Socio(nomesFantasias[nomeAleatorio], idadesFantasias[idadeAleatoria])));
            }
            System.out.println("\n");
        }
        
        
        for (int i = 0; i < times.length; i++) {
            System.out.println(times[i]);
        }
        
        for (int i = 0; i < times.length; i++) {
            System.out.println("No time " + times[i].getNome() + ", " + times[i].socioMaisVelho() + " é o sócio mais velho");
        }
        
        
        PrimeiraDivisao p = new PrimeiraDivisao("Teste", 0, 999 * 999); // Número muito alto pra iniciar com um valor impossívelmente imbatível
        for (int i = 0; i < times.length; i++) {
            if (times[i] instanceof PrimeiraDivisao && p.getPosicaoNoRanking() > ((PrimeiraDivisao)times[i]).getPosicaoNoRanking()) {
                p = (PrimeiraDivisao) times[i];
            }
        }
        System.out.println("\nO melhor time é o " + p.getNome() + " e ele está na " + p.getPosicaoNoRanking());
    }
}