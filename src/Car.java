import javax.security.auth.callback.LanguageCallback;
import java.time.LocalDate;
import java.time.Period;

public class Car {
    private String brand;
    private LocalDate dateOfMade;
    private double price;
    private Type type;


    public Car(String brand, LocalDate dateOfMade, double price, Type type) {
        this.brand = brand;
        this.dateOfMade = dateOfMade;
        this.price = price;
        this.type = type;
    }

    public Car() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public LocalDate getDateOfMade() {
        return dateOfMade;
    }

    public void setDateOfMade(LocalDate dateOfMade) {
        this.dateOfMade = dateOfMade;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
    public void determinationoYearOfManufacture(){
        int a = Period.between(dateOfMade,LocalDate.now()).getYears();
        System.out.println(a + " Year");
    }
    public void bodyTypeIdentification(String type){
        switch (type){
            case "SEDAN" -> System.out.println("Type: Sedan");
            case "HATCHBACK" -> System.out.println("Type: Hatchback");
            case  "CROSSOVER" -> System.out.println("Type: Crossover");
            case  "SUV" -> System.out.println("Type SUV");
            case "STATION_WAGON" -> System.out.println("Type: Station wagon");
        }
    }

    @Override
    public String toString() {
        return "\nCar: " +
                "\nBrand: " + brand +
                "\nDate of made: " + dateOfMade +
                "\nPrice: " + price + " USD";
    }
}
