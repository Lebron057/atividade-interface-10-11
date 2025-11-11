package application;

import java.time.LocalDateTime;

public abstract class Pagamento {
    String idTransacao;
    double valor;
    LocalDateTime dataHora;
    String descricao;
    String status;

    // Construtor
    public Pagamento(double valor, String descricao) {
        this.valor = valor;
        this.descricao = descricao;
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
    public abstract void exibirDetalhesPagamento();
    public abstract boolean autenticar();
    public abstract boolean validarDados();

    // !!! FAZER !!!
    // private String gerarIdUnico();

}
