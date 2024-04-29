//PEDRO LUCAS DA SILVA MOTA
//a2565943

public class Cliente extends Pessoa{

    private String codCliente;
    private int numProjetos;
    private Projeto projeto;

    public Cliente(){
        codCliente = "";
        numProjetos = 0;
        projeto = new Projeto();
    }

    public String getCodCliente() {
        return codCliente;
    }

    public int getnumProjetos() {
        return numProjetos;
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }

    public void setCodCliente(String codCliente) throws ExceptionInvalidCodCli{
        this.codCliente = codCliente;
        if(codCliente.length() > 0){
            this.codCliente = codCliente;
        }else{
            throw new ExceptionInvalidCodCli();
        }
    }

    public void setnumProjetos(int numProjetos) {
        this.numProjetos = numProjetos;
    }
}
