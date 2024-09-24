public class RelatorioPdf implements Relatorio {
    @Override
    public void gerar(String conteudo) {
        System.out.println("Gerando relatório PDF com o Desempenho: " + conteudo);
    }
}
