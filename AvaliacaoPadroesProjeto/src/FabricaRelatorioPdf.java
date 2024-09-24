public class FabricaRelatorioPdf extends FabricaRelatorio {
    @Override
    public Relatorio criarRelatorio() {
        return new RelatorioPdf();
    }
}
