package JavaFaker;
import com.github.javafaker.Faker;

public class RandomNameGenerator {
    public static void main(String[] args) {
        Faker faker = new Faker();
        String name = faker.name().fullName();
        System.out.println("Nombre generado: " + name);
    }
}
