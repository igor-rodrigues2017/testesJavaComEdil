import javax.swing.*;

public class Aplicacao {

    public static void main(String[] args) {
        String anoDigitado = JOptionPane.showInputDialog("Digite o ano");
        Integer ano = Integer.valueOf(anoDigitado);
        Integer seculo = new Calculadora().calculaSeculo(ano);
        System.out.println(seculo);
    }


}
