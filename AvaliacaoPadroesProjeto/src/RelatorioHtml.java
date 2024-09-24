public class RelatorioHtml implements Relatorio {
    @Override
    public void gerar(String conteudo) {
        System.out.println("Gerando relatório HTML com o Desempenho " + conteudo);
    }
}
