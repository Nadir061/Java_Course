package animals;

public class Animals {

    private String type;
    private String gender;
    private String age;
    private String name;

    public Animals(String type, String gender, String age, String name) {
        this.type = type;
        this.gender = gender;
        this.age = age;
        this.name = name;
    }


    // TODO перегрузить данный метод
    public String makeSound() {
        return "Животные могут издавать звуки.";
    }

//    public String makeSound(String type) {
//        return type + " может издавать звуки.";
//    }
//
//    public String makeSound(String type, String name) {
//        return type + name + " может издавать звуки.";
//    }

    public String getType() {
        return type;
    }

    public String getGender() {
        return gender;
    }

    public String getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "type='" + type + '\'' +
                ", gender='" + gender + '\'' +
                ", age='" + age + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
