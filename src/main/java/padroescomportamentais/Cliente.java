package padroescomportamentais;

public class Cliente {

    private double valorConta1;
    private double valorConta2;

    public double getValorConta1() {
        return valorConta1;
    }

    public void setValorConta1(double valorConta1) {
        this.valorConta1 = valorConta1;
    }

    public double getValorConta2() {
        return valorConta2;
    }

    public void setValorConta2(double valorConta2) {
        this.valorConta2 = valorConta2;
    }

    public double calcularValorConta() {
        return EmpresaEnergia.calcularValorConta(this.valorConta1, this.valorConta2);
    }
}
