package animals;

public class Alligator extends Animals {

    public Alligator(String type, String gender, String age, String name) {
        super(type, gender, age, name);
    }


    @Override
    public String makeSound() {
        return "Аллигатор ревет !";
    }

    @Override
    public String toString() {
        return "Alligator{" +
                "type='" + type + '\'' +
                ", gender='" + gender + '\'' +
                ", age='" + age + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
