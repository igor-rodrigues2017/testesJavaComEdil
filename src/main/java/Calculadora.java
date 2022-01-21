public class Calculadora {

    public Integer calculaSeculo(Integer ano) {
        if (anoForDivisivelPor100(ano)) {
            return ano / 100;
        }
        return (ano / 100) + 1;
    }

    private boolean anoForDivisivelPor100(Integer ano) {
        return ano % 100 == 0;
    }

}
