package _03_依赖倒置原则.section2;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 业务场景类
 */
public class Client {
	public static void main(String[] args) {
		IDriver zhangSan = new Driver(); //使用DIP,全部依赖于抽象接口
		//ICar benz = new Benz();
		ICar bmw = new BMW();
		
		//张三开奔驰车
		zhangSan.drive(bmw);
	}
}
