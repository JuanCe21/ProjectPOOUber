from car import Car
from payment import Payment
from account import Account

if __name__ == "__main__":
    print("Hola Mundo")
    car = Car()
    car.license = "AMS234"
    car.driver = "Andres Herrera"
    print(vars(car))

    car2 = Car()
    car2.license = "QWE567"
    car2.driver = "Matha"
    print(vars(car2))

    paypal = Payment()
    paypal.id = 21231
    paypal.email = "SHlaoa@gmail.com"
    print(vars(paypal))

    user = Account() 
    user.id = 21222
    user.name = "Juan"
    user.document = "1000"
    user.email = "juancepr@mail.com"
    user.password = "Type2"
    print(vars(user))

   
    
