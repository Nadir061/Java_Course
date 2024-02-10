package animals;

public class Lion extends Animals {

    public Lion(String type, String gender, String age, String name) {
        super(type, gender, age, name);
    }

    @Override
    public String makeSound() {
        return this.getType() + " рычит !";
    }
    // TODO неправильно перегрузить
}
