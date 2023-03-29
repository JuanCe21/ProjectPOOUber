class Car {
    Integer id;
    String license;
    String driver;
    Integer passengenger;
 
    public Car(String license, Account Driver ){
        this.license = license;
        this.driver = driver;
    
    }
    void printDataCar() {
        System.out.println("License: " + license + "Name Driver: " + driver.name);
    }
}