import animals.Alligator;
import animals.Animals;
import animals.Lion;

public class City {

    // Имя мэра
    String nameMayor = "Anam Nadir";

    String name = "Moscow";

    static String time1 = "9:00-17:00";
    static String time2 = "18:00";
    static String separator = "--------------------------";

    public static void main(String[] args) {

        // Создаем объект зоопарк
        Zoo myFavoriteZoo = new Zoo();

        // С помощью сеттеров устанавливаем значения для данных объекта класса Zoo
        myFavoriteZoo.setName("FunnyBober");
        myFavoriteZoo.setAddress("Moscow, VDNH");
        myFavoriteZoo.setWorkingHours("9:00-17:00");

        // Создаем объект лев
        Lion lionBarsik = new Lion("Лев", "Самец", "5 лет", "Барсик");
        // Создаем объект аллигатор
        Alligator alligatorGena = new Alligator("Аллигатор", "Самец", "3 года", "Гена");
        // Добавляем зверей в зоопарк
        myFavoriteZoo.setAnimalsList(lionBarsik);
        myFavoriteZoo.setAnimalsList(alligatorGena);
        myFavoriteZoo.getAnimalsList();

        System.out.println(separator);

        // Проверяем открыт ли зоопарк
        if (myFavoriteZoo.openCloseMainGate(time1)) {
            System.out.println("Зоопарк " + myFavoriteZoo.getName() + " открыт.");
        } else {
            System.out.println("Зоопарк " + myFavoriteZoo.getName() + " закрыт.\n"
                    + "Время работы: " + myFavoriteZoo.getWorkingHours());
        }

        System.out.println(separator);

        System.out.println(myFavoriteZoo);

        System.out.println(separator);

        // Выводим в консоль звуки, котрые могут издавать животные в зоопарке myFavoriteZoo
        for (Animals animal : myFavoriteZoo.getAnimalsList()) {
            System.out.println(animal.makeSound());
            System.out.println(separator);
        }

    }
}
