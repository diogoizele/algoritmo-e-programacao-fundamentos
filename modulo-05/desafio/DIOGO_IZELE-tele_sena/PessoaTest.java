public class PessoaTest {
    public static void main (String[] args) {
        Pessoa p = new Pessoa("Diogo Izele", new TeleSena[3]);
        
        p.compraTelesena(new TeleSena());
        p.compraTelesena(new TeleSena());
        p.compraTelesena(new TeleSena()); 
        p.compraTelesena(new TeleSena()); // Compra descondiderada
        System.out.println(p);
        for (int i = 0; i < p.getTelesenas().length; i++) {
            System.out.println(p.getTelesenas()[i]);
        }
    }
}