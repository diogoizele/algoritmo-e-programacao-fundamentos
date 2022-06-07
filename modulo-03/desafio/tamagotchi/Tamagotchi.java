public class Tamagotchi {
    // Atributos que possuem acesso externo a classe:
    private String nome;
    private int idade = 0; // em dias
    private int peso = 1; // comer pouco = 1kg; comer muito = 5kg
    
    // Atributos usados para controle interno da classe:
    private int diasAcordado = 0;
    
    /*
     * Contrutor apenas com o nome, visto que um Tamagotchi
     * sempre começará com idade 0 e peso 1, já fora declarado
     * anteriormente, e o usuário declare apenas o nome.
     */
    public Tamagotchi(String nome) {
        this.nome = nome;
    }
    
    /*
     * Construtor com todos os atributos, caso o usuários preferir
     * atribuir um valor na hora de instanciar um Tamagotchi.
     */
    public Tamagotchi(String nome, int idade, int peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }
    
    /*
     * Método que altera o nome do Tamagotchi.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    /*
     * Método que recupera o nome do Tamagotchi.
     */
    public String getNome(){
        return this.nome;
    }
    
    /*
     * Método que altera a idade do Tamagotchi.
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    /*
     * Método que recupera a idade do Tamagotchi.
     */
    public int getIdade() {
        return this.idade;
    }
    
    /*
     * Método que altera o peso do Tamagotchi.
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    /*
     * Método que recupera o peso do Tamagotchi.
     */
    public int getPeso() {
        return this.peso;
    }
    
    /*
     * To string que mostra as informações do Tamagotchi.
     */
    public String toString() {
        return "Nome: " + this.nome + "\nIdade: " + this.idade + " dias\nPeso: " + this.peso + "kg";
    }
    
    /*
     * Classe que imprime o valor do Tamagotchi usando o toString
     */
    public void mostraEstado() {
        System.out.println("\nMEU TAMAGOTCHI:\n" + this);
    }

    /*
     * Método usado para verificar se o Tamagotchi está vivo,
     * baseando-se na regra de negócio de sua morte.
     */
    public boolean estaVivo() {
        if (this.idade >= 15) {
            System.out.println("\nTamagotchi chegou a sua idade máxima de 15 dias e morreu\n");
        }
        
        if (this.peso <= 0) {
            System.out.println("\nTamagotchi emagreceu demais e morreu\n");
        }
        
         if (this.peso > 20) {
            System.out.println("\nTamagotchi comeu demais e explodiu\n");
        }
        return this.idade < 15 && this.peso > 0 && this.peso <= 20;
    }

    private void dormir() {
        this.idade++;
    }
    
    private void comer(int peso) {
        this.peso += peso;
    }
    
    /*
     * Para sentir sono temos duas opções:
     * Dormir - Aumenta 1 dia a idade;
     * Permanecer acordado.
     * 
     * Lembre-se: Quando o Tamagotchi avisa que está com sono 
     * e permanece acordado 5 vezes seguidas, a próxima vez que
     * ele sentir sono ele dorme automaticamente.
     */
    public void sentirSono(int opcao) {
        if (this.diasAcordado == 5) {
            dormir(); // Dorme.
            this.diasAcordado = 0; // Zera os dias acordados.
            System.out.println("~ Tamagotchi estava há 5 dias acordado e acabou dormindo ~ ");
        } else {
            if(opcao == 1) {
                dormir();
                System.out.println("~ Tamagotchi dormiu ~");
            } else {
                this.diasAcordado++;
                System.out.println("~ Tamagotchi permaneceu acordado ~");
                System.out.println("~ Tamagotchi está há " + this.diasAcordado + " dias acordado ~ ");
            }
        }
    }

    /*
     * Para sentir fome temos três opções:
     * Comer muito - Aumenta 5 quilos e logo deve dormir;
     * Comer pouco - Aumenta 1 quilo;
     * Não comer - Emagrece 2 quilos.
     * 
     * Lembre-se: Se o Tamagotchi ultrapassar os 20 quilos 
     * ele explode. Se o Tamagotchi chegar a zero quilos, ele
     * fica desnutrido e morre.  
     */
    public void sentirFome(int opcao) {
        if (opcao == 3) {
            comer(-2);
            System.out.println("~ Tamagotchi ficou sem comer e emagreceu 2kg ~ ");
        } else {
            if(opcao == 1) {
                dormir();
                comer(5);
                System.out.println("~ Tamagotchi comeu muito e engordou 5kg ~");
                System.out.println("~ Tamagotchi dormiu por comer demais ~");
            } else {
                comer(1);
                System.out.println("~ Tamagotchi comeu pouco e engordou 1kg ~");
            }
        }
    }
    
    /*
     * Para ficar entediado temos duas opções:
     * Correr 10 minutos - Emagrece 4 quilos e deve comer muito;
     * Caminhar 10 minutos - Emagrece 1 quilo e fica com fome;
     */
    public void ficarEntediado(int opcao) {
        if (opcao == 1) { 
            System.out.println("~ Tamagotchi correu por 10 minutos ~");
            System.out.println("~ Tamagotchi emagreceu 4kg por correr ~");
            comer(-4);
            if (this.peso > 0) {
                sentirFome(1);
            }
        } else {
            System.out.println("~ Tamagotchi caminhou por 10 minuto ~");
            System.out.println("~ Tamagotchi emagreceu 1kg por caminhar ~");
            comer(-1);
            if (this.peso > 0) {
                System.out.println("~ Tamagotchi ficou com fome ~");
                System.out.println("\n1) Comer muito\n2) Comer pouco\n3) Não comer\n");
                sentirFome(Teclado.leInt("Escolha uma opção"));
            }
        }
    }
}