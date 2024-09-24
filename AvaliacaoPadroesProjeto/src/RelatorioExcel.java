public class RelatorioExcel implements Relatorio {
    @Override
    public void gerar(String conteudo) {
        System.out.println("Gerando relatório Excel com Desempenho: " + conteudo);
    }
}
