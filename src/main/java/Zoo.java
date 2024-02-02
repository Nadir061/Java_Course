import animals.Animals;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private String name;
    private String address;
    private String workingHours;
    List<Animals> animalsList = new ArrayList<>();

    public Zoo() {
    }

    public Zoo(String name, String address, String workingHours) {
        this.name = name;
        this.address = address;
        this.workingHours = workingHours;
    }

    public boolean openCloseMainGate(String time) {
        return time.equals(workingHours);
    }

    public void setAnimalsList(Animals animal) {
        this.animalsList.add(animal);
    }

    public List<Animals> getAnimalsList() {
        return animalsList;
    }

    @Override
    public String toString() {
        return "Zoo\n{" +
                "name='" + name + '\'' + ",\n" +
                "address='" + address + '\'' + ",\n" +
                "workingHours='" + workingHours + '\'' + ",\n" +
                "animalsList=" + animalsList +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getWorkingHours() {
        return workingHours;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setWorkingHours(String workingHours) {
        this.workingHours = workingHours;
    }
}
