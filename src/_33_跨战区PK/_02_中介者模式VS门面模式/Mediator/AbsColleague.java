package _33_跨战区PK._02_中介者模式VS门面模式.Mediator;


/**
 * Created by YXP on 2018/1/30.
 */
public abstract class AbsColleague {
    protected AbsMediator mediator;
    public AbsColleague(AbsMediator _mediator){
        this.mediator = _mediator;
    }
}
