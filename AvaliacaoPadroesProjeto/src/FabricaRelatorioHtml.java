public class FabricaRelatorioHtml extends FabricaRelatorio {
    @Override
    public Relatorio criarRelatorio() {
        return new RelatorioHtml();
    }
}
