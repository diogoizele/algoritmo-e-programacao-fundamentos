public class Principal {
    public static void main (String[] args) {
        ExerciciosArray e = new ExerciciosArray();
        
        
        // Exercício #1:
        int quantNotas = Teclado.leInt("Digite o número total de notas");
        double[] notas = new double[quantNotas];
        
        for (int i = 0; i < quantNotas; i++) 
            notas[i] = Teclado.leDouble("Digite a " + (i + 1) + "º nota");
        
        
        System.out.println("A média das notas é " + e.calcularMediaDeNotas(notas));
        
        
        
        // Exercício #2:
        int quantNomes = Teclado.leInt("Digite a quantidade de nomes que deseja cadastrar");
        String[] nomes = new String[quantNomes];
        
        for (int i = 0; i < quantNomes; i++)
            nomes[i] = Teclado.leString("Digite o " + (i + 1) + "º nome");
        
        System.out.println(e.juntaNomes(nomes));
        
        
              
        // Exercício #3:
        int quantInteiros = Teclado.leInt("Digite a quantidade de números que deseja somar");
        int[] inteiros = new int[quantInteiros];
        
        for (int i = 0; i < quantInteiros; i++)
            inteiros[i] = Teclado.leInt("Digite o " + (i + 1) + "° inteiro");
            
        System.out.println("Somatório de inteiros: " + e.somarInteiros(inteiros));
        
        
        
        // Exercício #4:
        String[] nomesFicticios = {"Ana", "Julia", "Diogo", "Gabriel"};
        
        System.out.println("Nome localizado na posição "  + e.procuraNome(nomesFicticios, "Diogo"));
        
        
        
        // Exercício #5:
        int[] arr1 = {1, 5, 6, 3};
        int[] arr2 = {2, 4, 8, 9};
        
        System.out.println(e.somaArrays(arr1, arr2));
        
       
        
        // Exercício #6:
        double[] numeros = {3.4, 7.1, 9.6, 1.5};
        e.informaArrayDeDouble(numeros);
        
        
        
        // Exercício #7:
        e.geraAleatórios();
    }

}