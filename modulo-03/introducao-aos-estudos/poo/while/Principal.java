public class Principal {
    public static void main(String[] args) {
        Exercicios e = new Exercicios();
        
        String menu = "1. conta até 300\n2. imprime pares\n3. verifica primo";
        int opcao = 1;
        
        while (opcao == 1 || opcao == 2 || opcao ==3) {
            System.out.println(menu);
            opcao = Teclado.leInt("Digite a opção desejada");
            
            if (opcao == 1)
                e.contador(Teclado.leInt("Digite um número menor que 300:"));
            if (opcao == 2)
                e.imprimePares(Teclado.leInt("Imprime um número para saber os pares até ele"));
            if (opcao == 3) {
                boolean isPrimo = e.verificaPrimo(Teclado.leInt("Verifique se um número é primo"));
                if (isPrimo)
                    System.out.println("É primo");
                else 
                    System.out.println("Não é primo");
            }    
        }
    }
}