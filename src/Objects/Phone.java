package Objects;

import java.io.Serializable;

public class Phone implements Serializable {
    // Конструкторы д) е) ж) з)
    public Phone() {

    }
    public Phone(String nu, String mo) {
        number = nu;
        model = mo;
    }
    public Phone(String n, String m, double w) {
        this(n, m);
        weight = w;
    }
    // Блок переменных
    public String number;
    public String model;
    public double weight;
    // Блок методов     г)
    public String getNumber() {
        return number;
    }
    public String getModel() {
        return model;
    }
    public double getWeight() {
        return weight;
    }
    public void setNumber(String num) {
        number = num;
    }
    public void setModel(String mod) {
        model = mod;
    }
    public void setWeight(double wei) {
        weight = wei;
    }
    public void receiveCall(String name) {
        System.out.println(" Звонит " + name);
    }
    public void receiveCall(String number, String name) {
        System.out.println(number + " Звонит " + name);
    }
    public void sendMessagec(String... array){
        for (String i:array) {
            System.out.println(i + " ");
        }
    }
}
