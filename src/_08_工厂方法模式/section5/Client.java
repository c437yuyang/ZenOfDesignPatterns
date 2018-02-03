package _08_工厂方法模式.section5;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */

//对应8.4.3 替代单例模式
public class Client {
	public static void main(String[] args) {
		SingletonFactory.getSingleton().doSomething();
	}
}
