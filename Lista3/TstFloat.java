

//PEDRO LUCAS DA SILVA MOTA
//A2565943

// i) Classe Short: métodos floatParaBite() e biteParaFloat()
// ii) O método floatParaBite vai converter float para bite, no formato de int.
// iii) O método biteParaFloat faz o contrario do anterior, convertendo o bite para float.
// iv) Biblioteca Java


public class TstFloat {

    public int floatParaBite(Float num) {
        return Float.floatToIntBits(num);
    }

    public Float biteParaFloat(int num) {
        return Float.intBitsToFloat(num);
    }
}
