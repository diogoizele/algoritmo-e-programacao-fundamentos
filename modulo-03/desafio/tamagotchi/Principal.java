/**
 * Classe Principal, onde a lógica do programa será realizada
 * 
 * 
 * @DiogoIzele
 */
public class Principal {
    public static void main(String[] args) {
        // Gera um valor inteiro de 0 a 2 = [0, 1, 2]
        int desejoTamagotchi = (int) (Math.random() * 3);
        
        System.out.println(">>>BEM-VINDO AO TAMAGOTCHI<<<");
        System.out.println("Seu animalzinho digital!");
        Tamagotchi t = new Tamagotchi(Teclado.leString("Digite o nome do seu Tamagotchi"));
        t.mostraEstado();
        
        while (t.estaVivo()) {
            System.out.println("\n>>DESEJO ATUAL<<");
            if (desejoTamagotchi == 0){
                System.out.println("\"BUAAA :o ESTOU COM SONO!\" (Sentir sono)");
                System.out.println("\n1) Dormir\n2) Permancer acordado\n");
                int opcaoDormir = Teclado.leInt("Escolha uma opção:");
                while (opcaoDormir != 1 || opcaoDormir != 2) {
                    if (opcaoDormir == 1 || opcaoDormir == 2) {
                        t.sentirSono(opcaoDormir);
                        break;
                    }
    
                    opcaoDormir = Teclado.leInt("Escolha uma opção:");
                } 
            }
            if (desejoTamagotchi == 1){
                System.out.println("\"NHAAMM :P QUERO COMER!\" (Sentir fome)");
                System.out.println("\n1) Comer muito\n2) Comer pouco\n3) Não comer\n");
                int opcaoComer = Teclado.leInt("Escolha uma opção:");
                while (opcaoComer != 1 || opcaoComer != 2 || opcaoComer != 3) {
                    if (opcaoComer == 1 || opcaoComer == 2 || opcaoComer == 3) {
                        t.sentirFome(opcaoComer);
                        break;
                    }
    
                    opcaoComer = Teclado.leInt("Escolha uma opção:");
                } 
            }
            if (desejoTamagotchi == 2){
                System.out.println("\"AAAA \\o/ QUERO FAZER ALGUMA COISA!\" (Ficar Entendiado)");
                System.out.println("\n1) Correr 10 minutos\n2) Caminhar 10 minutos\n");
                int opcaoExercitar = Teclado.leInt("Escolha uma opção:");
                while (opcaoExercitar != 1 || opcaoExercitar != 2) {
                    if (opcaoExercitar == 1 || opcaoExercitar == 2) {
                        t.ficarEntediado(opcaoExercitar);
                        break;
                    }
    
                    opcaoExercitar = Teclado.leInt("Escolha uma opção:");
                } 
            }
            
            t.mostraEstado();
            desejoTamagotchi = (int) (Math.random() * 3);
        }
        
        System.out.println("Seu Tamagotchi morreu :(");
    }
}