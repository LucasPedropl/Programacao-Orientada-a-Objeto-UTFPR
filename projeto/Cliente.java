

public class Cliente extends Pessoa{

    private int codCliente;
    private String nomeProjeto;

    public int getCodCliente() {
        return codCliente;
    }

    public String getNomeProjeto() {
        return nomeProjeto;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public void setNomeProjeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
    }
}
