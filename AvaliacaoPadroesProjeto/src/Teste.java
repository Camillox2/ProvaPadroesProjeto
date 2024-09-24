public class Teste {
    public static void main(String[] args) {
        RelatorioService service = new RelatorioService();

        service.imprimir(new FabricaRelatorioCsv(), "Relatório Desempenho - CSV");
        service.imprimir(new FabricaRelatorioPdf(), "Relatório Desempenho - PDF");
        service.imprimir(new FabricaRelatorioExcel(),"Relatório Desempenho - Excel");
    }
}
