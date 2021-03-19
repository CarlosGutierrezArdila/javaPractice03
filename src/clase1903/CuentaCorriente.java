package clase1903;

public class CuentaCorriente
{
    private int saldo;
    private int id;

    public CuentaCorriente(int saldo, int id) {
        this.saldo = saldo;
        this.id = id;
    }

    public CuentaCorriente() {
    }


    public CuentaCorriente(CuentaCorriente copy) {
        this.setId(copy.getId());
        this.setSaldo(copy.getSaldo());
    }

    public void ingreso (int monto) {
        this.setSaldo(this.getSaldo()+monto);
    }

    public void egreso (int monto) {
        this.setSaldo(this.getSaldo()-monto);
    }

    public void transferencia(CuentaCorriente cuentaDestino, int monto) {
        cuentaDestino.ingreso(monto);
        this.egreso(monto);
    }

    public void reintegro(int monto) {
        this.ingreso(monto);
        System.out.println("ingresan: "+monto+" por reintegro");
    }




    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
