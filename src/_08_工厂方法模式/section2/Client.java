package _08_工厂方法模式.section2;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
//工厂方法模式的通用源码
public class Client {
	
	public static void main(String[] args) {
		Creator creator = new ConcreteCreator();
		Product product = creator.createProduct(ConcreteProduct1.class);
		/*
		 * 继续业务处理
		 */
	}
}
