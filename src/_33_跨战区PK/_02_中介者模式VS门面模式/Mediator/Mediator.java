package _33_��ս��PK._02_�н���ģʽVS����ģʽ.Mediator;

/**
 * Created by YXP on 2018/1/30.
 */
public class Mediator extends AbsMediator {
    @Override
    public void up(ISalary _salary) {
        upSalary();
        upTax();
    }

    @Override
    public void up(IPosition _position) {
        upPosition();
        upSalary();
        upTax();
    }

    @Override
    public void up(ITax _tax) {
        upTax();
        downSalary();
    }

    @Override
    public void down(ISalary _salary) {

    }

    @Override
    public void down(IPosition _position) {

    }

    @Override
    public void down(ITax _tax) {

    }

    private void upSalary(){
        System.out.println("��������");
    }
    private void upTax(){
        System.out.println("˰������");
    }

    private void upPosition(){
        System.out.println("ְλ����");
    }

    private void downSalary(){
        System.out.println("�����½�");
    }

    private void downTax(){
        System.out.println("˰��Ŷ�½�");
    }


    private void downPosition(){
        System.out.println("ְλ�½�");
    }


}
