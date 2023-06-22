package Objects;

public class Reader {
    // Конструкторы
    public Reader() {}
    public Reader(String f, int n) {
        fullName = f;
        number = n;
    }

    // Блок полей
    public String fullName;
    public int number;
    public String faculty;
    public String birthDate;
    public String phone;
    // Блок методов
    public void takeBook(int k) {
        System.out.println(fullName + " взял " + k + " книги.");
    }
    public void takeBook(Book... array) {
        System.out.print(fullName + " взял книги: ");
        for (Book i: array) {
            System.out.print(i.toString() +", ");
        }
        System.out.println("");
    }
    public void returnBook(int k) {
        System.out.println(fullName + " вернул " + k + " книги.");
    }
    public void returnBook(Book... array) {
        System.out.print(fullName + " вернул книги: ");
        for (Book i: array) {
            System.out.print(i.toString() +", ");
        }
        System.out.println("");
    }
}
