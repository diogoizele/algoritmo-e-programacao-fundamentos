public class MinhasInformacoes {
    public static void main(String[] args) {
        String nome = Teclado.leString("Digite seu nome: ");
        double altura = Teclado.leDouble("Digite sua altura: ");
        String dataNascimento = Teclado.leString("Digite sua data de nascimento: ");
        String rg = Teclado.leString("Digite seu RG: ");
        System.out.println("Agora informe seu endereço: ");
        String rua = Teclado.leString("Digite a rua onde você mora: ");
        String numero = Teclado.leString("Digite o número de sua residência: ");
        String complemento = Teclado.leString("Digite algum complemento para o endereço: ");
        
        System.out.println("Nome: " + nome);
        System.out.println("Altura: " + altura);
        System.out.println("Data de nascimento: " + dataNascimento);
        System.out.println("Endereço: " + rua + " - Número: " + numero + " - Complemento: " + complemento);
    }
}