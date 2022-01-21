import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

    @Test
    public void deve_retornar_o_seculo_19_quando_chamar_calcula_seculo_com_ano_1900() {
        Integer seculo = new Calculadora().calculaSeculo(1900);
        Assertions.assertEquals(19, seculo);
    }

    @Test
    public void deve_retornar_o_seculo_19_quando_chamar_calcula_seculo_com_ano_1870() {
        Integer seculo = new Calculadora().calculaSeculo(1870);
        Assertions.assertEquals(19, seculo);
    }

    @Test
    public void deve_retornar_o_seculo_8_quando_chamar_calcula_seculo_com_ano_750() {
        Integer seculo = new Calculadora().calculaSeculo(750);
        Assertions.assertEquals(8, seculo);
    }

    @Test
    public void deve_retornar_o_seculo_1_quando_chamar_calcula_seculo_com_ano_1() {
        Integer seculo = new Calculadora().calculaSeculo(1);
        Assertions.assertEquals(1, seculo);
    }

}