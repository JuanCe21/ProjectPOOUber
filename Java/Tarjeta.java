package CURSOPOOUBER;
import java.util.Date;
public class Tarjeta extends Payment{
    String franquicia;
    Date fechaVencimiento;
    String codigocvv;
    public Tarjeta(Integer id, String franquicia, Date fechaVencimiento, String codigocvv) {
        super(id);
        this.franquicia = franquicia;
        this.fechaVencimiento= fechaVencimiento;
        this.codigocvv = codigocvv;

        this.printDataPayment();
        

    }
}