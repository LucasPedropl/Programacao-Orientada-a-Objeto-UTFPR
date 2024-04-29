//PEDRO LUCAS DA SILVA MOTA
//a2565943

public class Projeto {
    
    private String cnpjEmp;
    private String codCliente;
    private String codLider;
    private String nomeProjeto;

    public Projeto() {
        this.cnpjEmp = "";
        this.codCliente = "";
        this.codLider = "";
        this.nomeProjeto = "Projeto nao nomeado";
    }

    public String getCnpjEmp() {
        return cnpjEmp;
    }

    public String getCodCliente() {
        return codCliente;
    }

    public String getCodLider() {
        return codLider;
    }

    public String getNomeProjeto() {
        return nomeProjeto;
    }

    public void setNomeProjeto(String nomeProjeto) throws ExceptionInvalidNome{
		if(nomeProjeto.length() > 0 && nomeProjeto.length() < 20){
			this.nomeProjeto = nomeProjeto;
		}else{
			throw new ExceptionInvalidNome();
		}
	}

    public void setCnpjEmp(String cnpjEmp, String cnpjEmpDigitado) throws ExceptionInvalidCnpj{
        if(cnpjEmp == cnpjEmpDigitado) {
            this.cnpjEmp = cnpjEmp;
        }else{
            throw new ExceptionInvalidCnpj();
        }
    }

    public void setCodCliente(String codCli, String codCliDigitado) throws ExceptionInvalidCodCli{
        if(codCli == codCliDigitado) {
            this.codCliente = codCli;
        }else{
            throw new ExceptionInvalidCodCli();
        }
    }

    public void setCodLider(String codLider, String codFunDigitado) throws ExceptionInvalidCodFun{
		if(codLider == codFunDigitado){
            this.codLider = codLider;
        }else{
            throw new ExceptionInvalidCodFun();
        }
	}
}
