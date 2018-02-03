package _17_装饰模式.section3;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {
	
	public static void main(String[] args) {
		Component component = new ConcreteComponent();
		
		//第一次修饰
		component = new ConcreteDecorator1(component);
		
		//第二次修饰
		component = new ConcreteDecorator2(component);
		
		//修饰后运行
		component.operate();
		//运行的流程是: 此时先调用component.operate(),实际上调用的是ConcreteDecorator2的operate(),
		//然后ConcreteDecorator2的operate()调用super().operate(),实际上这个时候super是一个ConcreteDecorator1对象，
		//因此调用它的operator调用的是ConcreteDecorator1的operate(),依次类推最后调用Component.operator()
		
	}

}
