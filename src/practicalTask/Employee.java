package practicalTask;

/**
 * Created by prots on 24.04.2017.
 */
public class Employee {
    private static double totalSum;
    private String name;
    private double rate;
    private int hours;

    public static double getTotalSum() {
        return totalSum;
    }

    public String getName() {
        return name;
    }

    public double getRate() {
        return rate;
    }

    public int getHours() {
        return hours;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    Employee() {
        setName("-");
        setRate(0.00);
        setHours(0);
    }

    Employee(String name, double rate) {
        setName(name);
        setRate(rate);
    }

    Employee(String name, double rate, int hours) {
        this(name, rate);
        setHours(hours);
        totalSum += bonuses();
    }

    public double salary() {
        return getRate() * getHours();
    }

    public String toString() {
        return getName() + " " + getRate() + " " + getHours() + " " + bonuses();
    }

    public void changeRate(double rate) {
        totalSum -= bonuses();
        setRate(rate);
        totalSum += bonuses();

    }

    public double bonuses() {
        return salary() + salary() * 0.1;
    }

    public static void main(String... args) {
        Employee worker1, worker2, worker3;
        worker1 = new Employee();
        worker2 = new Employee("Diana", 35.4, 12);
        worker3 = new Employee("Marina", 33.3, 11);

        System.out.println(worker1.toString());
        System.out.println(worker2.toString());
        System.out.println(worker3.toString());
        System.out.println("Total sum = " + getTotalSum());

        worker2.changeRate(50.8);
        worker3.changeRate(60.7);

        System.out.println();

        System.out.println(worker1.toString());
        System.out.println(worker2.toString());
        System.out.println(worker3.toString());
        System.out.println("Total sum = " + getTotalSum());
    }
}
