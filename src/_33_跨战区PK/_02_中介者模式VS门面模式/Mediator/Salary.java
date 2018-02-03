package _33_跨战区PK._02_中介者模式VS门面模式.Mediator;

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
