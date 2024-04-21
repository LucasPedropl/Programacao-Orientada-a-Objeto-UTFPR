

//PEDRO LUCAS DA SILVA MOTA
//A2565943

// i) Classe Short: métodos Shortparashort() e Strparashort()
// ii) O método Shortparashort vai retornar o valor primitivo de Short.
// iii) O método Strparashort vai converter uma string em short.
// iv) Biblioteca Java

public class TstShort {
    public Short Shortparashort(Short shor ){
        return shor.shortValue();
    }

    public Short Strparashort(String str ){
        return Short.parseShort(str);
    }
}
