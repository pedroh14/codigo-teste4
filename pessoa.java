package codigo4;

public abstract class pessoa {
    protected String nome;
    protected double renda_anual;

    public pessoa() {
    }

    public pessoa(String nome, double renda_anual) {
        this.nome = nome;
        this.renda_anual = renda_anual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getRenda_anual() {
        return renda_anual;
    }

    public void setRenda_anual(double renda_anual) {
        this.renda_anual = renda_anual;
    }

    public abstract double valor_pago2();

}
