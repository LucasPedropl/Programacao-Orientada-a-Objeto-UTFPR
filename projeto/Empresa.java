//PEDRO LUCAS DA SILVA MOTA
//a2565943

public class Empresa {
    private int cnpj;
    private String nome;

    public int getCnpj(){
        return cnpj;
    }

    public String getNome(){
        return nome;
    }

    public void setCnpj(int cnpj) throws ExeptionInvalidCnpj{
        if(Integer.toString(cnpj).length() == 14){
            this.cnpj = cnpj;this.cnpj = cnpj;
        }else{
            throw new ExeptionInvalidCnpj();
        }
    }

    public void setNome(String nome){
        this.nome = nome;
    }
}
