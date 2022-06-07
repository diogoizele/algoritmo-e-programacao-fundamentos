public class Principal {
    public static void main(String[] args) {
        /*
         * Garantinado que o preço será maior que 0.
         */
        double precoProd1 = 0;
        while (precoProd1 < 1) {
            precoProd1 = Teclado.leDouble("Digite o preço do amaciante");
        }
        double precoProd2 = 0;
        while (precoProd2 < 1) {
            precoProd2 = Teclado.leDouble("Digite o preço do creme dental");
        }
        double precoProd3 = 0;
        while (precoProd3 < 1) {
            precoProd3 = Teclado.leDouble("Digite o preço do leite condensado");
        }

        
        
        Produto prod1 = new Produto("Amaciante", precoProd1, new Data(10, 4, 2014));
        Produto prod2 = new Produto("Creme Dental", precoProd2, new Data(5, 5, 2015));
        Produto prod3 = new Produto("Leite Condensado", precoProd3, new Data(4, 12, 2012));
        Produto prod4 = new Produto("Cortina", 167.98, new Data(13,10, 2025));
        
        Prateleira p1 = new Prateleira(prod1, prod2, prod3);
        Prateleira p2 = new Prateleira();
        p2.setProduto(prod4, 0);
        
        Mercado m = new Mercado(p1, p2);
        
        for (int i = 0; i < 3; i++) {
            Data dataVencimento = new Data(10, 10, 2014);
            if (p1.getProduto(i) != null) {
                System.out.println(p1.getProduto(i).getNome() + " está vencido? " + p1.getProduto(i).verificaProdutoVencido(dataVencimento));
            }
            
            if (p2.getProduto(i) != null) {
                System.out.println(p2.getProduto(i).getNome() + " está vencido? " + p2.getProduto(i).verificaProdutoVencido(dataVencimento));
            }
        }
        
        System.out.println("A média dos produtos é: " + m.mediaValorProdutos());
    }
}