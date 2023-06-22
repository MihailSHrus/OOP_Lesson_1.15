import Objects.*;

public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("-Задание1-");
        Phone tel1 = new Phone("+78725012489", "6" , 100.65);
        Phone tel2 = new Phone("+78721052599", "6s", 189.23 );
        Phone tel3 = new Phone("+78778105519", "7" , 223.65);
        System.out.println(tel1.number +" " + tel1.model + " " + tel1.weight);
        System.out.println(tel2.number +" " + tel2.model + " " + tel2.weight);
        System.out.println(tel3.number +" " + tel3.model + " " + tel3.weight);
        System.out.print(tel1.getNumber()); tel1.receiveCall("Алексей");
        System.out.print(tel2.getNumber()); tel2.receiveCall("Марат");
        System.out.print(tel3.getNumber()); tel3.receiveCall("Ваш любимый оператор связи");
        tel3.receiveCall("+78778105519", "Опять ваш любимый оператор связи");
        tel3.sendMessagec("+78725012489","+78721052599");

        // Задание 2
        System.out.println("-Задание2-");
        Person per1 = new Person();
        Person per2 = new Person("Федотов Юрий Аркадьевич",56);
        per2.talk();

        // Задание 3
        System.out.println("-Задание3-");
        int[][] mat1 = {{5, 1, 2}, {8, 2, 4}, {7, 2, 1}};
        int[][] mat2 = {{1, 1, 1}, {2, 2, 2}, {2, 2, 2}};
        Matrix m1 = new Matrix(mat1);
        m1.sumMatrix(mat2);
        m1.printMatrix();
        m1.multNumMatrix(5);
        m1.printMatrix();

        // Задание 4
        System.out.println("-Задание4-");
        Reader test = new Reader("Петров В.В", 1);
        test.takeBook(3);
        test.returnBook(3);
        Book b1 = new Book("Приключения", "Жучкин М.А.");
        Book b2 = new Book("Словарь", "Даль В.И.");
        Book b3 = new Book("Энциклопедия", "Магелан П.П.");
        test.takeBook(b1, b2, b3);
        test.returnBook(b1, b2, b3);

    }
}