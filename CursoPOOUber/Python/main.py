from car import Car
from account import Account

if __name__ == "__main__":
    print("Hola Mundo")

    car = Car("AMS234", Account("Andrés Herrera", "ANDA876"))
    # car.license = "AMS234"
    # car.driver = "Andres Herrera"
    print(vars(car))
    print(vars(car.driver))
