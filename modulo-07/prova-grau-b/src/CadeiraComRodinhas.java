public class CadeiraComRodinhas extends Cadeira {
    private Data dataUltimaManutencao;

    public CadeiraComRodinhas(Cor cor, Data dataUltimaManutencao) {
        super(cor);
        this.dataUltimaManutencao = dataUltimaManutencao;
    }

    public Data getDataUltimaManutencao() {
        return dataUltimaManutencao;
    }

    public void setDataUltimaManutencao(Data dataUltimaManutencao) {
        this.dataUltimaManutencao = dataUltimaManutencao;
    }

    @Override
    public String toString() {
        return "CadeiraComRodinhas{" +
                "dataUltimaManutencao=" + dataUltimaManutencao +
                "} " + super.toString();
    }
}
