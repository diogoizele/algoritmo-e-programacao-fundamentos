import javax.swing.*;
import java.awt.Color;

public class Principal {
    public static void main(String[] args) {
        int capacidadeCadeiras = (int) (Math.random() * 20) + 1;

        Sala sala = new Sala(Teclado.leString("Qual o nome da sala?"), capacidadeCadeiras);
        System.out.println("\n---------------------//---------------------\n");
        System.out.println("Sala");
        System.out.println(sala);


        System.out.println("\n---------------------//---------------------\n");
        System.out.println("Adicionando alunos");
        for (int i = 0; i < 20; i++) {
            int nomeAleatorio = (int) (Math.random() * 3) + 1;
            int idadeAleatoria = (int) (Math.random() * 3) + 1;
            int tipoCadeiraAleatorio = (int) (Math.random() * 2) + 1;


            String nome = "";
            int idade = 0;
            String tipoCadeira = "";


            if (nomeAleatorio == 1)
                nome = "Diogo";
            if (nomeAleatorio == 2)
                nome = "Ana";
            if (nomeAleatorio == 3)
                nome = "Bianca";

            if (idadeAleatoria == 1)
                idade = 10;
            if (idadeAleatoria == 2)
                idade = 20;
            if (idadeAleatoria == 3)
                idade = 30;

            if (tipoCadeiraAleatorio == 1)
                tipoCadeira = "mesa";
            else
                tipoCadeira = "rodinha";


            System.out.println(sala.entraAluno(new Aluno(nome, idade), tipoCadeira));
        }

        System.out.println("\n---------------------//---------------------\n");
        System.out.println("Cadeiras com Mesa");
        for (int i = 0; i < sala.getCadeiras().length; i++) {
            if (sala.getCadeiras()[i] instanceof  CadeiraComMesa) {
                System.out.println(((CadeiraComMesa) sala.getCadeiras()[i]).calculaArea());
            }
        }

        System.out.println("\n---------------------//---------------------\n");
        System.out.println("Cadeiras com Rodinhas");
        for (int i = 0; i < sala.getCadeiras().length; i++) {
            if (sala.getCadeiras()[i] instanceof CadeiraComRodinhas) {
                System.out.println(((CadeiraComRodinhas) sala.getCadeiras()[i]).getDataUltimaManutencao());
            }
        }

        System.out.println("\n---------------------//---------------------\n");
        System.out.println("Aluno pesquisado");
        String nomeAlunoPesquisado = Teclado.leString("Digite o nome do aluno que você quer pesquisar");

        for (int i = 0; i < sala.getCadeiras().length; i++) {
            Cadeira cadeira = sala.getCadeiras()[i];


            if (cadeira.getAluno().getNome().equals(nomeAlunoPesquisado)) {
                System.out.println("Aluno(a) " + cadeira.getAluno().getNome() + " foi encontrado");

                JFrame a = new JFrame();
                a.setSize(200, 200);
                JPanel j = new JPanel();
                j.setBackground(new Color(cadeira.getCor().getR(), cadeira.getCor().getG(), cadeira.getCor().getB()));
                a.add(j);
                a.setVisible(true);

                System.out.println("R:" + cadeira.getCor().getR());
                System.out.println("G:" + cadeira.getCor().getG());
                System.out.println("B:" + cadeira.getCor().getB());
                break;
            }
        }
    }

}
