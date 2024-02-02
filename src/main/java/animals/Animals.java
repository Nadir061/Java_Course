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

    public String makeSound() {
        return "Животные могут издавать звуки";
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
