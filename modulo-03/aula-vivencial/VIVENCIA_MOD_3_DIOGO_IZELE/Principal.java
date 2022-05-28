public class Principal {
    public static void main(String[] args) {
        int numero = Teclado.leInt("Digite o n�mero da conta: ");
        double saldo = Teclado.leDouble("Digite o saldo da conta: ");     
        
        ContaCorrente conta = new ContaCorrente(numero, saldo);
        
        int menuOpcoes = 0;
        
        while (menuOpcoes != 4) {
            menuOpcoes = Teclado.leInt("1) Efetuar um saque\n2) Efetuar um dep�sito\n3) Imprimir informa��es da conta\n4) Sair do menu");
            
            if (menuOpcoes == 1)
                conta.efetuaSaque(Teclado.leDouble("Digite um valor para sacar: "));
            if (menuOpcoes == 2)
                conta.efetuaDeposito(Teclado.leDouble("Digite um valor para depositar: "));
            if (menuOpcoes == 3)
                System.out.println(conta);
        }
        
        System.out.println("\n\nVoc� saiu da interface de contas...");
        System.out.println("Agora voc� deve criar 3 im�veis...\n");
         
        for (int i = 0; i < 3; i++) {
            int numeroImovel = i + 1; // Mostrar o im�vel atual
            
            String endereco = Teclado.leString("Digite o endere�o para o " + numeroImovel + "� im�vel: ");
            double valorVenda = 0;
            double valorAluguel = 0;
            char novoAuxiliar = 't'; // vari�vel auxiliar para saber se o valor � true (s) ou false (n);
            boolean novo = false; // vari�vel que ir� na inst�ncia do objeto.
        
            while (valorVenda <= 0) {
                valorVenda = Teclado.leDouble("Digite um valor de venda para o " + numeroImovel + "� im�vel: ");
            }
        
            while (valorAluguel <= 0) {
                valorAluguel = Teclado.leDouble("Digite um valor de alugu�l para o " + numeroImovel + "� im�vel: ");
            }
        
            while (novoAuxiliar != 's' || novoAuxiliar != 'n') {
                novoAuxiliar = Teclado.leChar("O " + numeroImovel + "� im�vel � novo? (s/n) ");
                if (novoAuxiliar == 's') {
                    novo = true;
                    break;
                } 
                if (novoAuxiliar == 'n') {
                   novo = false;
                   break;
                }
            }
        
            Imovel imovel = new Imovel(endereco, valorVenda, valorAluguel, novo);
        
            System.out.println("\n\n" + numeroImovel + "� IM�VEL");
            System.out.println(imovel);
            System.out.println("O valor do imposto �: " + imovel.calculaImposto() + " reais\n\n");
        }
        
        System.out.println("Voc� saiu do programa!");
    }
}