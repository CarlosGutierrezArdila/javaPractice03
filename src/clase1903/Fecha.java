package clase1903;

import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Fecha {

    private GregorianCalendar fecha;

    public Fecha(int anio, int mes, int dia) {
        this.fecha = new GregorianCalendar(anio, mes-1, dia);
    }

    public static void main(String[] args) {
        Fecha test = new Fecha(2021,04,14);
        System.out.println(test.toString());
        System.out.println(test.fecha.toString());
        System.out.println(validateDate(2021,04,14));
        String[] arr = new String[]{"abc", "cde"};

    }

    public void sumarDia() {
        fecha.add(Calendar.DATE,1);
    }

    public static boolean validateDate(int y, int m, int d){
        System.out.println(new Fecha(y,m,d).toString());
        return  new Fecha(y,m,d).toString()== d+"/"+m+"/"+y;
    }

    @Override
    public String toString() {
        return fecha.toZonedDateTime().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
}
