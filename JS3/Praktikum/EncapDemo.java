package PBO_SMT_3.JS3.Praktikum;

public class EncapDemo {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setNama(String newName) {
        name = newName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        if (newAge >= 30) {
            System.out.println("Umur anda melebihi batas");
        } else if(newAge <= 18) {
            System.out.println("Umur anda tidak cukup");
        } else {
            age = newAge;
        }
    }
}