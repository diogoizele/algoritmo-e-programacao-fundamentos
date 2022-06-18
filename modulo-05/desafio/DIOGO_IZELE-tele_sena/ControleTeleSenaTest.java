public class ControleTeleSenaTest {
    public static void main (String[] args) {
        ControleTeleSena c = new ControleTeleSena();
        int [] sorteio = c.getSorteio();
      
        c.sorteiaMaisUmValor();
        c.sorteiaMaisUmValor();
        c.sorteiaMaisUmValor();
        sorteio = c.getSorteio();
        /*
        for (int i = 0; i < sorteio.length; i++) {
            System.out.println((i + 1) + ") " + sorteio[i]);
        }
        */
        
        Pessoa[] pessoas = c.getPessoas();
        
        /*
        for (int i = 0; i < pessoas.length; i++) {
            System.out.println(pessoas[i]);
        }
        */
        
        System.out.println("Vendidas " + c.getTelesenasVendidas());
        System.out.println("Lucro total " + c.getLucroTotal());
        c.confereResultado();
    }
}