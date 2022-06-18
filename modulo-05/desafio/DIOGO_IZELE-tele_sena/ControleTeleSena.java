import java.util.Arrays;

public class ControleTeleSena {
    private Pessoa[] pessoas = new Pessoa[20];
    private TeleSena[] telesenas = Gerador.geraTelesenas(300);
    /*
     * Sorteio inicial é referente aos 25 primeiros números que
     * serão sorteados na instância da classe de Controle.
     * Após isso, caso nenhuma das 20 pessoas consiga acertar os
     * 25 números do sorteio inicial, será adicionado um item em 
     * Sorteio.
     */
    private int[] sorteioInicial = new int[25];
    /*
     * Sorteio por sua vez é o que cobrirá até o caso final, por 
     * exemplo, se são 60 valores no total, mesmo que por um azar
     * nenhum dos números anteriores fechem os 25, teremos que
     * testar todas as opções, porém geralmente as posições finais
     * deste array serão 0;
     */
    private int[] sorteio = new int[60];
    private int telesenasVendidas = 0;
    private float lucroTotal;
    private float lucroSilvioSantos;
    private float lucroDistribuido;
    private int quantidadeGanhadores;
    
    public int getTelesenasVendidas() {
        return this.telesenasVendidas;
    }
    
    public void setTelesenasVendidas(int telesenasVendidas) {
        this.telesenasVendidas = telesenasVendidas;
    }
    
    public float getLucroTotal() {
        return this.lucroTotal;
    }
    
    public void setLucroTotal(float lucroTotal) {
        this.lucroTotal = lucroTotal;
    }
    
    public float getLucroSilvioSantos() {
        return this.lucroSilvioSantos;
    }
    
    public void setLucroSilvioSantos(float lucroSilvioSantos) {
        this.lucroSilvioSantos = lucroSilvioSantos;
    }
    
    public float getLucroDistribuido() {
        return this.lucroDistribuido;
    }
    
    public void setLucroDistribuido(float lucroDistribuido) {
        this.lucroDistribuido = lucroDistribuido;
    }
    
    public int getQuantidadeGanhadores() {
        return this.quantidadeGanhadores;
    }
    
    public void setQuantidadeGanhadores(int quantidadeGanhadores) {
        this.quantidadeGanhadores = quantidadeGanhadores;
    }
    
    public Pessoa[] getPessoas() {
        return this.pessoas;
    }

    public void setPessoas(Pessoa[] pessoas) {
        this.pessoas = pessoas;
    }
    
    public TeleSena[] getTelesenas() {
        return this.telesenas;
    }
    
    public void setTelesenas(TeleSena[] telesenas) {
        this.telesenas = telesenas;
    }
    
    public int[] getSorteioInicial() {
        Arrays.sort(sorteioInicial);
        return this.sorteioInicial;
    }
    
    public void setSorteioInicial(int[] sorteioInicial) {
        this.sorteioInicial = sorteioInicial;
    }
    
    public int[] getSorteio() {
        Arrays.sort(sorteio);
        return this.sorteio;
    }
    
    public void setSorteio(int[] sorteio) {
        this.sorteio = sorteio;
    }
    
    public ControleTeleSena() {
        int i = 0;
        while (i < sorteioInicial.length) {
            int aleatorio = Gerador.geraAleatorio(60);
            boolean valorRepetido = false;
 
            for (int j = 0; j < sorteioInicial.length; j++) {
                valorRepetido = sorteioInicial[j] == aleatorio;
                if (valorRepetido)
                    break;
            }
            
            if (!valorRepetido) {
                sorteioInicial[i] = aleatorio;
                sorteio[i] = aleatorio;
                i++;
            }
        }
        
        /*
         * Esse trecho adiciona o número 999 nas posições posteriores
         * a 25, para podermos ordenar corretamente o array e adicionarmos
         * os próximos valores de forma incremental.
         */
        for (int j = 26; j < sorteio.length; j++) {
            sorteio[j] = 999;
        }
        Arrays.sort(sorteioInicial);
        Arrays.sort(sorteio);
        
        /*
         * Criando as 20 pessoas com suas respectivas Tele Senas.
         * Para facilitar a codificação, 300 Tele Senas serão 
         * vendidas em ordem: 1, 2, 3...
         */
        for (int k = 0; k < pessoas.length; k++) {
            int quantidadeTelesenas = Gerador.geraAleatorio(15);
            TeleSena[] ts = new TeleSena[quantidadeTelesenas];            
            pessoas[k] = new Pessoa(Gerador.geraNome(), ts);
            
            for (int h = 0; h < ts.length; h++) {
                /*
                 * Na linha a seguir vou atribuir na variável lucro total
                 * o que ela já tem mais o retorno do método de compra
                 * telesena, comprando a próxima telesena válida das 300,
                 * baseando-se na telesena vendida
                 */
                lucroTotal += pessoas[k].compraTelesena(telesenas[telesenasVendidas]);
                /*
                 * Por fim incrementando a venda, para que a próxima compra seja
                 * em uma telesena nova.
                 */
                telesenasVendidas++;
            }
        }
    }
    
      /*
     * Função que verifica a próxima posição disponível no array
     * (posição que contém um 999 como elemento), e então sorteia
     * um valor. Após sortear verifica se esse valor já foi sorteado
     * se sim, repete o processo até ter um valor que ainda não
     * foi sorteado.
     */
    public void sorteiaMaisUmValor() {
        for (int i = 0; i < sorteio.length; i++) {
            if (sorteio[i] == 999) {
                boolean criterioDeParada = false;
                while (!criterioDeParada) {
                    int aleatorio = Gerador.geraAleatorio(60);
                    boolean gerouDiferente = true;
                    for (int j = 0; j < sorteio.length; j++) {
                        if (aleatorio == sorteio[j]) {
                            gerouDiferente = false;
                            break;
                        }
                    }
                    if (gerouDiferente) {
                        criterioDeParada = true;
                        sorteio[i] = aleatorio;
                    }
                }
                break;
            }
        }
    }
    
    /*
     * Essa função vai iterar sobre:
     * 1. Pessoas > 2. Telesenas > 3. Conjunto de 25 números,
     * ou seja, vamos comprar o nosso sorteio com todas as Pessoas
     * que possuem telesenas, que essas possuem conjuntos, e esses
     * conjuntos que podem ou não ser os que garantirão o acerto.
     */
    public void confereResultado() {
        for (int i = 0; i < pessoas.length; i++) {
            TeleSena[] t = pessoas[i].getTelesenas();
            for (int j = 0; j < t.length; j++) {
                System.out.println(t);
            }
        }
    }
}