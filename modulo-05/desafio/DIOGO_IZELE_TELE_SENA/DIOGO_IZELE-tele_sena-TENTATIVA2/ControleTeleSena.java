public class ControleTeleSena {
    private int[] sorteados = new int[60];
    private Pessoa[] pessoas = new Pessoa[20];
    private int vendidas = 0;
    private Pessoa[] ganhadores = new Pessoa[20];
    
    public ControleTeleSena() {
        for (int i = 0; i < pessoas.length; i++) {
            int quantidadeTeleSenas = Gerador.geraAleatorio(15);
            
            TeleSena[] teleSenas = new TeleSena[quantidadeTeleSenas];
            vendidas += quantidadeTeleSenas;
            
            for (int j = 0; j < teleSenas.length; j++) {
                teleSenas[j] = new TeleSena();
            }
            
            pessoas[i] = new Pessoa(Gerador.geraNome(), teleSenas);
        }
    }
    
    
    public void iniciaSorteio() {
        int i = 0;
        boolean temosGanhador = false;
        TeleSena teleSenaGanhadora = new TeleSena();
        Pessoa ganhador = new Pessoa("Teste", new TeleSena[1]);
        
        while (!temosGanhador) {
            int aleatorio = (int) (Math.random() * 60) + 1;
            boolean valorRepetido = false;
            
            for (int j = 0; j < sorteados.length; j++) {
                valorRepetido = sorteados[j] == aleatorio;
                if (valorRepetido) 
                    break;
            }
            
            /* Se passou pela verificação acima, é porque um
             * aleatório foi escolhido, logo a função pra verificar
             * com as telesenas será feita abaixo, com o aleatório
             * escolhido.
             */
            if (!valorRepetido) {
                sorteados[i] = aleatorio;
                i++;
            }
            
            for (int j = 0; j < pessoas.length; j++) {
                Pessoa pessoa = pessoas[j];
                
                System.out.println(pessoa);
                for (int k = 0; k < pessoa.getTeleSenas().length; k++) {
                    TeleSena teleSena = pessoa.getTeleSenas()[k];
                    
                    if (teleSena.conjuntoPossuiNumero(aleatorio, 1)) {
                        teleSena.incrementaAcertoConjunto1();
                    }
                    
                    if (teleSena.conjuntoPossuiNumero(aleatorio, 2)) {
                        teleSena.incrementaAcertoConjunto2();
                    }
                    
                    if (teleSena.getAcertosConjunto1() >= 25 || teleSena.getAcertosConjunto2() >= 25) {
                        teleSenaGanhadora = teleSena;
                        pessoa.ganhaPremio(vendidas);
                        ganhador = pessoa;
                        
                        temosGanhador = true;
                    }
                    
                    System.out.println(teleSena);
                    System.out.println("Conjunto 1: " + teleSena.conjuntoPossuiNumero(aleatorio, 1));
                    System.out.println("Conjunto 2: " + teleSena.conjuntoPossuiNumero(aleatorio, 2));
                }
                
            }
        }
        String sorteadosString = "";
        int quantidadeNumSorteados = 0;
        for (int d = 0; d < sorteados.length; d++) {
            if (sorteados[d] != 0) {
                sorteadosString += sorteados[d];
                quantidadeNumSorteados++;
                if (sorteados[d] != sorteados.length - 1) {
                    sorteadosString += " - ";
                }
            }
        }
        
        System.out.println("\n\n>>>>>>RESULTADO FINAL<<<<<<\n\nO ganhador foi " + ganhador);
        System.out.println("Com a tele sena " + teleSenaGanhadora);
        System.out.println("Quantidade de Tele Senas Vendidas: " + this.vendidas);
        System.out.println("A quantidade de numeros sorteados foi: " + quantidadeNumSorteados);
        System.out.println("Numeros sorteados: " + sorteadosString);
        System.out.println("O lucro de Silvio Santos foi: " + vendidas * 10 * 0.2);
    }
    
    public void adicionaGanhador(Pessoa ganhador) {
        for (int i = 0; i < ganhadores.length; i++) {
            if (ganhadores[i] == null) {
                ganhadores[i] = ganhador;
            }
        }
    }
    
}