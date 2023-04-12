import java.util.ArrayList;
import java.util.Map;

class UberVan extends Car {
        Map<String, ArrayList<String,Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;

    public UberBlack(String license, Account driver, Map<String, ArrayList<String,Integer>> typeCarAccepted){
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
        
    }
}