package _33_跨战区PK._02_中介者模式VS门面模式.Mediator;

/**
 * Created by YXP on 2018/1/30.
 */
public class Tax  extends AbsColleague implements ITax{
    public Tax(AbsMediator _mediator) {
        super(_mediator);
    }

    @Override
    public void raise() {
        super.mediator.up(this);
    }

    @Override
    public void drop() {
        super.mediator.down(this);

    }
}
