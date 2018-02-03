package _33_跨战区PK._02_中介者模式VS门面模式.Mediator;

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
        System.out.println("工资上升");
    }
    private void upTax(){
        System.out.println("税收上升");
    }

    private void upPosition(){
        System.out.println("职位上升");
    }

    private void downSalary(){
        System.out.println("工资下降");
    }

    private void downTax(){
        System.out.println("税收哦下降");
    }


    private void downPosition(){
        System.out.println("职位下降");
    }


}
