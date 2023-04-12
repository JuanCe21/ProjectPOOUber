class Paypal extends PaymentMethodChangeEvent(){
    constructor(id, referencia, sucursal){
        super(id)
        this.referencia = referencia;
        this.sucursal = sucursal;
    }
}