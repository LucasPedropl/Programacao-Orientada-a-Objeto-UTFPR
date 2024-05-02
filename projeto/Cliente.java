//PEDRO LUCAS DA SILVA MOTA
//a2565943

public class Cliente extends Pessoa implements InterfaceContato{

    private String codCliente;
    private int numProjetos;
    private Projeto projeto;
    private String email;
    private String telefone;
    private String celular;

    public Cliente(){
        codCliente = "";
        numProjetos = 0;
        projeto = new Projeto();
        email = "";
        telefone = "";
        celular = "";
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

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setEmail(String email) {
        this.email = email;
        
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
        
    }

    public void setCelular(String celular) {
        this.celular = celular;
        
    }
}
