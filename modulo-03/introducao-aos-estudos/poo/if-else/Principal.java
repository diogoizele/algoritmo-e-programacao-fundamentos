public class Principal {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Joaquim", 'M', 19, 1.78, 0, "Rua C, 145");
        Pessoa p2 = new Pessoa("Manuelita", 'F', 30, 1.67, 3, "Rua dos Camelos, 12");
        Pessoa p3 = new Pessoa("Pedro", 'M', 10, 1.91, 1, "Rua dos Gigantes, 189");
       
        p1.imprimeInformacoes();
        System.out.println();
        p2.imprimeInformacoes();
        System.out.println();
        p3.imprimeInformacoes();
        System.out.println();
       
        if (p1.isFilhoUnico()) 
            System.out.println("Filho único"); 
        else 
            System.out.println("Não é filho único");
            
        if (p2.isFilhoUnico()) 
            System.out.println("Filha única"); 
        else 
            System.out.println("Não é filha único");
            
        if (p3.isFilhoUnico()) 
            System.out.println("Filho único"); 
        else 
            System.out.println("Não é filho único");
    }
}