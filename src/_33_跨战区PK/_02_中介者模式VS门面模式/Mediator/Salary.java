package _33_��ս��PK._02_�н���ģʽVS����ģʽ.Mediator;

/**
 * Created by YXP on 2018/1/30.
 */
public class Salary extends AbsColleague implements ISalary{
    public Salary(AbsMediator _mediator) {
        super(_mediator);
    }

    @Override
    public void increaseSalary() {
        super.mediator.up(this);
    }

    @Override
    public void decreaseSalary() {
        super.mediator.down(this);

    }
}
