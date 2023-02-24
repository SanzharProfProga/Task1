import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
//        Car классын тузунуз, полялары : машина маркасы, чыгарылган жылы, баасы жана кузов түрү
//    ENUM (седан, хэтчбек, кроссовер, внедорожник, универсал) . Көрсөтмөлөр боюнча bodyTypeIdentification методу болушу керек,
//        бул правилалар боюнча: седан жана хэтчбек - "легковой классындагы машина", кроссовер жана внедорожник -
//            "внедорожник классындагы машина" ,  универсал - "универсал классындагы машина" деп бизге машинан типи
//        менен кайсы класска кирет чыгарып берсин. Жана determinationoYearOfManufacture методу, азыркы жыл
//        LocalDate now getYear методтун колдонуп алып, чыгарылган жылынан эсептеп  машинага канча жыл болгонун эсептеп берсин .
        Car car = new Car("Nissan", LocalDate.of(2022, 7, 6), 120000, Type.SEDAN);
        Car car1 = new Car("Audi", LocalDate.of(2021, 9, 7), 90000, Type.HATCHBACK);
        Car car2 = new Car("Hyndai", LocalDate.of(2020, 2, 6), 60000, Type.CROSSOVER);
        Car car3 = new Car("Toyota", LocalDate.of(2019, 6, 5), 110000, Type.SUV);
        Car car4 = new Car("Subaru", LocalDate.of(2018, 9, 7), 70000, Type.STATION_WAGON);
        Car[] cars = {car, car1, car2, car3, car4};
        Type[] types = Type.values();
        for (int i = 0; i < cars.length; i++) {
            String type = types[i].name().toUpperCase();

            System.out.println(cars[i].toString());
            cars[i].bodyTypeIdentification(type);
            cars[i].determinationoYearOfManufacture();


        }
    }
}