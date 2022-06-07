public class Teste {
    public static void main(String[] args) {
        FuncionarioCaixa funcionario = new FuncionarioCaixa();
        FuncionarioCaixa f2 = new FuncionarioCaixa();
        Empresa empresa1 = new Empresa();
        
        funcionario.setNome(Teclado.leString("Digite o nome do funcionário"));
        funcionario.setEndereco(Teclado.leString("Digite o endereço do funcionário"));
        funcionario.setSexo(Teclado.leChar("Digite o sexo do funcionário (M/F)"));
        
        funcionario.imprimeInfo();
        
        System.out.println(funcionario.soma(2, 2));
        System.out.println(funcionario.subtracao(5, 4));
        System.out.println(funcionario.multiplicacao(2, 3));
        System.out.println(funcionario.divisao(6, 3));
        System.out.println(funcionario.elevaAoQuadrado(7));
        System.out.println(funcionario.elevaAoCubo(8));
        
        
        
        empresa1.setNome(Teclado.leString("Digite o nome de sua empresa"));
        
        f2.setNome(Teclado.leString("Digite o nome do funcionário"));
        f2.setEndereco(Teclado.leString("Digite o endereço do funcionário"));
        f2.setSexo(Teclado.leChar("Digite o sexo do funcionário (M/F)"));
        
        empresa1.setFuncionarioCaixa1(funcionario);
        empresa1.setFuncionarioCaixa2(f2);
        
        empresa1.imprimeInfo();
    }
}