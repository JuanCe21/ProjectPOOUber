class Car {
    private Integer id;
    private String license;
    private String driver;
    private Integer passengenger;
 
    public Car(String license, Account Driver ){
        this.license = license;
        this.driver = driver;
            
    }
    void printDataCar() {
        if(passengenger != null){
            System.out.println("License: " + license + "Name Driver: " + driver.name + " Passengers: " + passengenger);
        }
        
    }


    public Integer getPassenger(){
        return passengenger;
    }

    public void setPassenger(Integer passenger) {
        if(passenger == 4){
            this.passengenger = passenger;
        }else{
            System.out.println("Necesitas asignar 4 pasajeros")
        }

    }

    
}