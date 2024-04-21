

//PEDRO LUCAS DA SILVA MOTA
//A2565943

// i) Classe Character: métodos converterMaiusculo() e converterMinusculo()
// ii) O método converterMaiusculo vai converter uma letra para maiusculo.
// iii) O método converterMinusculo vai converter uma letra para minusculo.
// iv) Biblioteca Java

public class TstChar {
    public char converterMaiusculo(char p_Maiusculo) {
        return Character.toUpperCase(p_Maiusculo);
    }

    public char converterMinusculo(char p_Minusculo){
        return Character.toLowerCase(p_Minusculo);
    }
}
