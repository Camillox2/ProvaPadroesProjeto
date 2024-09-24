public class RelatorioCsv implements Relatorio {
    @Override
    public void gerar(String conteudo) {
        System.out.println("Gerando relatório CSV com o Desempenho: " + conteudo);
    }
}
