package _33_跨战区PK._02_中介者模式VS门面模式.Mediator;

/**
 * Created by YXP on 2018/1/30.
 */
public class Client {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        IPosition position = new Position(mediator);
        ISalary salary = new Salary(mediator);
        ITax tax = new Tax(mediator);

        System.out.println("升职了");
        position.promote();
    }

}
