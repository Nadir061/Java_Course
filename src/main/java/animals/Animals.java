package animals;

public class Animals {

    String type;
    String gender;
    String age;
    String name;

    public Animals(String type, String gender, String age, String name) {
        this.type = type;
        this.gender = gender;
        this.age = age;
        this.name = name;
    }

    public String makeSound() {
        return "Животные могут издавать звуки";
    }
}
