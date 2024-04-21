// PEDRO LUCAS DA SILVA MOTA
// A2565943

// i) Classe Integer: métodos bitCount() e compare()
// ii) O método contarBit vai contar o número de bits definidos como '1' em um número inteiro.
// iii) O método compararNum vai comparar dois números inteiros e retornar um valor indicando a relação entre eles.
// iv) Biblioteca Java

public class TstInt {

    public int contarBit(int num1) {
        return Integer.bitCount(num1);
    }

    public int compararNum(int num1, int num2) { 
        return Integer.compare(num1, num2);
    }
}
