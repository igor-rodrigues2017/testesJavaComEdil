import java.util.Arrays;

public class TabelaDePontos {

    private String[] resultados;

    public TabelaDePontos(String[] resultados) {
        this.resultados = resultados;
    }

    public Integer calcularPontuacao() {
        //" x: y "
        int resultadoFinal = 0;
        for (String umJogo: resultados) {
            String [] placar = umJogo.split(":"); // [" x"," y "]
            String meuPlacar = placar[0];
            String adversario = placar[1];
            String meuPlacarSemEspacos = meuPlacar.trim();
            String adversarioSemEspacos = adversario.trim();
            Integer meuPlacarEmNumero = Integer.valueOf(meuPlacarSemEspacos);
            Integer adversarioEmNumero = Integer.valueOf(adversarioSemEspacos);

            if (meuPlacarEmNumero == adversarioEmNumero) {
                resultadoFinal += 1;
            } else if (meuPlacarEmNumero > adversarioEmNumero) {
                resultadoFinal += 3;
            }

        }

        return resultadoFinal;
    }
}
