

//PEDRO LUCAS DA SILVA MOTA
//A2565943

// i) Classe Boolean: métodos convert_String() e convert_Boolean()
// ii) O método convert_String vai converter uma variavel boolean para string.
// iii) O método convert_Boolean vai converter uma string para uma variavel boolean .
// iv) Biblioteca Java

public class TstBool {
    public String convert_String(Boolean val){
        return Boolean.toString(val);
    }

    public Boolean convert_Boolean(String val){
        return Boolean.valueOf(val);
    }
}
