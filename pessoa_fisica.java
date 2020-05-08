package codigo4;

public class pessoa_fisica extends pessoa{
    protected double gastos_saude;

    public pessoa_fisica() {
        super();
    }

    public pessoa_fisica(String nome, double renda_anual, double gastos_saude) {
        super(nome, renda_anual);
        this.gastos_saude = gastos_saude;
    }

    public double getGastos_saude() {
        return gastos_saude;
    }

    public void setGastos_saude(double gastos_saude) {
        this.gastos_saude = gastos_saude;
    }

    @Override
    public double valor_pago2() {
        double valor = 0.0;
        if (renda_anual <= 20000.00) {
            return getRenda_anual() * 0.15 - getGastos_saude() * 0.5;
        } else {
            return getRenda_anual() * 0.25 - getGastos_saude() * 0.5;
        }
    }
}


