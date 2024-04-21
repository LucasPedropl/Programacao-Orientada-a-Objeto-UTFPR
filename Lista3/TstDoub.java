

//PEDRO LUCAS DA SILVA MOTA
//A2565943

// i) Classe Double: métodos transformarDouble() e finitoInfinito()
// ii) O método transformarDouble vai converter o num Double para o tipo primitivo double.
// iii) O método finitoInfinito vai receber um numero double, e dizer se ele é finito ou infinito, retornando true ou false.
// iv) Biblioteca Java

public class TstDoub {

    public double transformarDouble(Double num) {
        return num.doubleValue(); 
    }
    

    public boolean finitoInfinito(double num){
        return Double.isFinite(num);
    }

}
