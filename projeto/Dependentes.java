//PEDRO LUCAS DA SILVA MOTA
//a2565943

public class Dependentes extends Pessoa{
    private String Familiaridade;
    private String codFun;

    public Dependentes() {
        this.Familiaridade = "";
        this.codFun = "";
    }

    public String getFamiliaridade() {
        return Familiaridade;
    }

    public String getCodFun() {
        return codFun;
    }

    public void setFamiliaridade(String familiaridade) {
        Familiaridade = familiaridade;
    }

    public void setCodFun(String codFun, String codFunDigitado) throws ExceptionInvalidCodFun{
		if(codFun == codFunDigitado){
            this.codFun = codFun;
        }else{
            throw new ExceptionInvalidCodFun();
        }
	}
}
