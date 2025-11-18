package application;

public class Main {
    public static void main(String[] args) {
        PagamentoCartaoCredito pag1 = new PagamentoCartaoCredito(
            200, "Exemplo de Pagamento", "123454323456",
            "Fulano de Tal", "11/26", "345", 2);
        
        pag1.exibirDetalhesPagamento();
        
        Priorizavel pri = pag1;
        Pagamento pag2 = pag1;

        pri.definirPrioridade(4);

        System.out.println(pag1.obterNivelPrioridade());

        pag1.processar();
    }
}
