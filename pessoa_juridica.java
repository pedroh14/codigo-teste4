package codigo4;

public class pessoa_juridica extends pessoa {
    protected int num_func;

    public pessoa_juridica() {
        super();
    }

    public pessoa_juridica(String nome, double renda_anual, int num_func) {
        super(nome, renda_anual);
        this.num_func = num_func;
    }

    public int getNum_func() {
        return num_func;
    }

    public void setNum_func(int num_func) {
        this.num_func = num_func;
    }

    @Override
    public double valor_pago2() {
        if (num_func <= 10) {
            return getRenda_anual() * 0.16;
        } else {
                return getRenda_anual() * 0.14;
            }

        }
    }
