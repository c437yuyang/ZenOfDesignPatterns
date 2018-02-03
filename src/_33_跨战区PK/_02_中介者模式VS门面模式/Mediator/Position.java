package _33_跨战区PK._02_中介者模式VS门面模式.Mediator;

/**
 * Created by YXP on 2018/1/30.
 */
public class Position extends AbsColleague implements IPosition {

    public Position(AbsMediator _mediator) {
        super(_mediator);
    }

    @Override
    public void promote() {
        super.mediator.up(this);
    }

    @Override
    public void demote() {
        super.mediator.down(this);
    }
}
