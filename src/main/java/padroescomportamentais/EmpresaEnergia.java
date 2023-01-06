package padroescomportamentais;

public class EmpresaEnergia {

    public static String formula = "valorConta1 + valorConta2 / 2";

    public static double calcularValorConta(double valorConta1, double valorConta2) {
        String expressao;
        expressao = formula.replace("valorConta1", Double.toString(valorConta1));
        expressao = expressao.replace("valorConta2", Double.toString(valorConta2));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();
    }
}
