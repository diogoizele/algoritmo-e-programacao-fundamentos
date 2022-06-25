import java.util.Arrays;

public class Sala {
    private String nome;
    private Cadeira[] cadeiras;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cadeira[] getCadeiras() {
        return cadeiras;
    }

    public void setCadeiras(Cadeira[] cadeiras) {
        this.cadeiras = cadeiras;
    }

    public Sala(String nome, int quantCadeiras) {
        this.nome = nome;
        this.cadeiras = new Cadeira[quantCadeiras];


        for (int i = 0; i < quantCadeiras; i++) {
            int tipoCadeira = (int) (Math.random() * 2) + 1;

            int numR = (int) (Math.random() * 255) + 1;
            int numG = (int) (Math.random() * 255) + 1;
            int numB = (int) (Math.random() * 255) + 1;

            Cor corAleatoria = new Cor(numR, numG, numB);


            if (tipoCadeira == 1) {
                cadeiras[i] = new CadeiraComMesa(corAleatoria, 25, 5 );
            } else {
                Data dataUltimaManutencao = new Data(23, 03, 2022);
                cadeiras[i] = new CadeiraComRodinhas(corAleatoria, dataUltimaManutencao);
            }

        }


    }

    @Override
    public String toString() {
        return "Sala{" +
                "nome='" + nome + '\'' +
                ", cadeiras=" + Arrays.toString(cadeiras) +
                '}';
    }

    public int cadeirasComMesaDisponiveis() {
        int quantAlunos = 0;
        for (int i = 0; i < cadeiras.length; i++) {
            if (cadeiras[i] instanceof  CadeiraComMesa && cadeiras[i].getAluno() == null)
                quantAlunos++;
        }
        return quantAlunos;
    }

    public int cadeirasComRodinhasDisponiveis() {
        int quantAlunos = 0;
        for (int i = 0; i < cadeiras.length; i++) {
            if (cadeiras[i] instanceof CadeiraComRodinhas && cadeiras[i].getAluno() == null)
                quantAlunos++;
        }
        return quantAlunos;
    }

    public String entraAluno(Aluno aluno, String tipoCadeira) {
        // tipoCadeira = "mesa" | "rodinha";
        boolean adicionouNaCorreta = false;
        boolean adicionouEmPeloMenosUma = false;
        String mensagemFinal = "";

        if (tipoCadeira == "mesa") {
            adicionouNaCorreta = false;
            for (int i = 0; i < cadeiras.length; i++) {
                Cadeira cadeira = cadeiras[i];
                if (cadeira.getAluno() == null && cadeira instanceof CadeiraComMesa) {
                    cadeira.setAluno(aluno);
                    adicionouNaCorreta = true;
                    adicionouEmPeloMenosUma = true;
                    break;
                }
           }

            if (!adicionouNaCorreta) {
                for (int i = 0; i < cadeiras.length; i++) {
                    Cadeira cadeira = cadeiras[i];
                    if (cadeira.getAluno() == null) {
                        cadeira.setAluno(aluno);
                        adicionouNaCorreta = false;
                        adicionouEmPeloMenosUma = true;
                        break;
                    }
                }
            }
        }

        if (tipoCadeira == "rodinha") {
            adicionouNaCorreta = false;
            for (int i = 0; i < cadeiras.length; i++) {
                Cadeira cadeira = cadeiras[i];
                if (cadeira.getAluno() == null && cadeira instanceof CadeiraComRodinhas) {
                    cadeira.setAluno(aluno);
                    adicionouNaCorreta = true;
                    adicionouEmPeloMenosUma = true;
                    break;
                }
            }

            if (!adicionouNaCorreta) {
                for (int i = 0; i < cadeiras.length; i++) {
                    Cadeira cadeira = cadeiras[i];
                    if (cadeira.getAluno() == null) {
                        cadeira.setAluno(aluno);
                        adicionouNaCorreta = false;
                        adicionouEmPeloMenosUma = true;
                        break;
                    }
                }
            }
        }

        if (adicionouEmPeloMenosUma) {
            if (adicionouNaCorreta)
                mensagemFinal = "ocupou a cadeira desejada";
            else
                mensagemFinal = "ocupou outro tipo de cadeira";
        } else
            mensagemFinal = "não ocupou cadeira alguma";


        return mensagemFinal;
    }

}
