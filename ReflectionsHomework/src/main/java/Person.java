/**
 * Тестовый класс
 */
public class Person {
    String name;
    String Surname;
    int age;

    public Person() {
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        Surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
