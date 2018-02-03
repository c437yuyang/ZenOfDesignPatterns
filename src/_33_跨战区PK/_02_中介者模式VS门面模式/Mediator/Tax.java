package _33_��ս��PK._02_�н���ģʽVS����ģʽ.Mediator;

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
