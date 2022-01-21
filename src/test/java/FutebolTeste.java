import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FutebolTeste {

    @Test
    public void deve_contar_os_pontos_do_time() {
        int a = 1;
        String[] tabelaDeResultados = {
                " 3: 1 ", //3
                " 2: 2 ",//1
                " 0: 1 ",//0
                " 3: 1 ",//3
                " 2: 2 ",//1
                " 0: 1 ",//0
                " 3: 1 ",//3
                " 2: 2 ",//1
                " 0: 1 ",//0
                " 0: 1 "//0
        };

        Integer resultado = new TabelaDePontos(tabelaDeResultados).calcularPontuacao();

        Assertions.assertEquals(12, resultado);

    }

}


    /**
     * Por exemplo: [" 3: 1 "," 2: 2 "," 0: 1 ", ...]
     *
     *         - se x> y - 3 pontos
     *
     *         - se x <y - 0 ponto
     *
     *         - se x = y - 1 ponto
     *
     *         - há 10 partidas no campeonato
     *
     *         - 0 <= x <= 4
     *
     *         - 0 <= y <= 4
     */
