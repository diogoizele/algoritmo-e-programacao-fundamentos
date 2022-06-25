public class Cadeira {
    private Cor cor;
    private Aluno aluno;

    public Cadeira(Cor cor) {
        this.cor = cor;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    @Override
    public String toString() {
        return "{" +
                "cor=" + cor +
                ", aluno=" + aluno +
                '}';
    }
}
