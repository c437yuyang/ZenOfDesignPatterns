package _19_适配器模式.section2;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 适配器
 */
public class Adapter extends Adaptee implements Target {
	
	public void request() {
		super.doSomething();
	} //来调用原来的业务逻辑实现业务的适配

}
