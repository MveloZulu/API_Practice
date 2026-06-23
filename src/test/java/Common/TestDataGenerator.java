package Common;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class TestDataGenerator {
    public static String latitude = Faker.instance().address().latitude();
    public static String longitude = Faker.instance().address().longitude();
    public static String altitude = String.valueOf(Faker.instance().number().numberBetween(10, 20));


}
