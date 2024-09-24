public class RelatorioService {
    public void imprimir(FabricaRelatorio fabrica, String conteudo) {
        Relatorio relatorio = fabrica.criarRelatorio();
        relatorio.gerar(conteudo);
    }
}
