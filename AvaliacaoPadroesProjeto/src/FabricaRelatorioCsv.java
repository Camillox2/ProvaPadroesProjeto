public class FabricaRelatorioCsv extends FabricaRelatorio {
    @Override
    public Relatorio criarRelatorio() {
        return new RelatorioCsv();
    }
}
