package application;

import java.time.LocalDateTime;
import java.util.UUID;

public abstract class Pagamento {
    private String idTransacao;
    private double valor;
    private LocalDateTime dataHora;
    private String descricao;
    private String status;

    // Construtor
    public Pagamento(double valor, String descricao) {
        this.idTransacao = gerarIdUnico();
        this.valor = valor;
        this.descricao = descricao;
        this.dataHora = LocalDateTime.now();
        this.status = "Pendente";
    }

    // Getters
    public String getIdTransacao() { return this.idTransacao; }
    public double getValor() { return this.valor; }
    public LocalDateTime getDataHora() { return this.dataHora; }
    public String getDescricao() { return this.descricao; }
    public String getStatus() { return this.status; }
    
    // Setters
    protected void setStatus(String status) { this.status = status; }
    
    // Outros métodos
    public void exibirDetalhesPagamento() {
        System.out.println("--- Detalhes do Pagamento ---");
        System.out.println("ID: " + this.idTransacao);
        System.out.println("Valor: " + this.valor);
        System.out.println(" data e hora: " + this.dataHora);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Status: " + this.status);

    };

    private void registrarDataHora()  {
        this.dataHora = LocalDateTime.now();
    }
    
    private String gerarIdUnico() {
        return "TRA-" + UUID.randomUUID().toString().toUpperCase();
    }
    
    public abstract boolean autenticar();
    public abstract boolean validarDados();
}
