package Objects;

public class Person {
    // Конструкторы
    public Person() {

    }
    public Person(String f, int a) {
        fullName = f;
        age = a;
    }
    // Блое переменных
    public String fullName;
    public int age;
    // Блок методов
    public void move() {
        System.out.println(fullName.toString() + " говорит");
    }
    public void talk() {
        System.out.println(fullName.toString() + " говорит");
    }
}
