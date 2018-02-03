package _33_��ս��PK._02_�н���ģʽVS����ģʽ.Mediator;

/**
 * Created by YXP on 2018/1/30.
 */
public class Client {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        IPosition position = new Position(mediator);
        ISalary salary = new Salary(mediator);
        ITax tax = new Tax(mediator);

        System.out.println("��ְ��");
        position.promote();
    }

}
