

//PEDRO LUCAS DA SILVA MOTA
//A2565943

// i) Classe Long: métodos divisao() e Longparalong()
// ii) O método divisao vai dividir 2 numeros long  sem sinal.
// iii) O método Longparalong converte Long para um tipo primitivo long.
// iv) Biblioteca Java

public class TstLong {
    public long divisao(long dividendo, long divisor){
        return Long.divideUnsigned(dividendo, divisor);
    }

    public long Longparalong(Long numLon){
        return numLon.longValue();
    }
}
