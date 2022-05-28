public class Principal {
    public static void main(String[] args) {
        int numero = Teclado.leInt("Digite o número da conta: ");
        double saldo = Teclado.leDouble("Digite o saldo da conta: ");     
        
        ContaCorrente conta = new ContaCorrente(numero, saldo);
        
        int menuOpcoes = 0;
        
        while (menuOpcoes != 4) {
            menuOpcoes = Teclado.leInt("1) Efetuar um saque\n2) Efetuar um depósito\n3) Imprimir informações da conta\n4) Sair do menu");
            
            if (menuOpcoes == 1)
                conta.efetuaSaque(Teclado.leDouble("Digite um valor para sacar: "));
            if (menuOpcoes == 2)
                conta.efetuaDeposito(Teclado.leDouble("Digite um valor para depositar: "));
            if (menuOpcoes == 3)
                System.out.println(conta);
        }
        
        System.out.println("\n\nVocê saiu da interface de contas...");
        System.out.println("Agora você deve criar 3 imóveis...\n");
         
        for (int i = 0; i < 3; i++) {
            int numeroImovel = i + 1; // Mostrar o imóvel atual
            
            String endereco = Teclado.leString("Digite o endereço para o " + numeroImovel + "º imóvel: ");
            double valorVenda = 0;
            double valorAluguel = 0;
            char novoAuxiliar = 't'; // variável auxiliar para saber se o valor é true (s) ou false (n);
            boolean novo = false; // variável que irá na instância do objeto.
        
            while (valorVenda <= 0) {
                valorVenda = Teclado.leDouble("Digite um valor de venda para o " + numeroImovel + "º imóvel: ");
            }
        
            while (valorAluguel <= 0) {
                valorAluguel = Teclado.leDouble("Digite um valor de aluguél para o " + numeroImovel + "º imóvel: ");
            }
        
            while (novoAuxiliar != 's' || novoAuxiliar != 'n') {
                novoAuxiliar = Teclado.leChar("O " + numeroImovel + "º imóvel é novo? (s/n) ");
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
        
            System.out.println("\n\n" + numeroImovel + "º IMÓVEL");
            System.out.println(imovel);
            System.out.println("O valor do imposto é: " + imovel.calculaImposto() + " reais\n\n");
        }
        
        System.out.println("Você saiu do programa!");
    }
}