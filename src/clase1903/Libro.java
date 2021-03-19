package clase1903;

public class Libro
{
    private  String título;
    private  int isbn;
    private String autor;
    private boolean enPrestamo;


    public Libro() {
    }

    public Libro(String título, int isbn, String autor) {
        this.título = título;
        this.isbn = isbn;
        this.autor = autor;
        this.enPrestamo = false;
    }

    public void prestamo(){
        this.setEnPrestamo(true);
        System.out.println("Se prestò el libro"+this.getTítulo());
    }


    public void devolucion(){
        this.setEnPrestamo(false);
        System.out.println("Se devolviò el libro"+this.getTítulo());
    }

    @Override
    public String toString() { // Al cambiar nombre el error es que el metodo no sobreescribe ningun metodo de la superclase
        return this.getTítulo()+" "+this.getIsbn()+" "+this.getAutor();
    }

    public String getTítulo() {
        return título;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isEnPrestamo() {
        return enPrestamo;
    }

    public void setEnPrestamo(boolean enPrestamo) {
        this.enPrestamo = enPrestamo;
    }
}
