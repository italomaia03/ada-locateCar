package model.cliente;

public abstract class Cliente {
    private String nomeCliente;

    public Cliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Cliente() {
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
}
