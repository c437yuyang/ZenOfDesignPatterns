package _33_��ս��PK._02_�н���ģʽVS����ģʽ.Mediator;

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
