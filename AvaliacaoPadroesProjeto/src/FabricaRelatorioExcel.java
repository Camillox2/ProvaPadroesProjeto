public class FabricaRelatorioExcel extends FabricaRelatorio {
    @Override
    public Relatorio criarRelatorio() {
        return new RelatorioExcel();
    }
}
