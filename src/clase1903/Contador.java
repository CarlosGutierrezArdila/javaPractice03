package clase1903;

public class Contador {
    private  int count;

    public Contador() {
    }

    public Contador(int count) {
        this.count = count;
    }

    public Contador(Contador contadorCopy) {
        this.setCount(contadorCopy.getCount());
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void incrementar(){
        this.setCount(this.getCount()+1);
    }

    public void decrementar(){
        this.setCount(this.getCount()-1);
    }
}
