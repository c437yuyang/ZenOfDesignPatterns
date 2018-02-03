package _02_里式替换原则.section3;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 业务场景模拟类
 */
public class Client {
	
	public static void main(String[] args) {
		//产生三毛这个狙击手
		Snipper sanMao = new Snipper();
		sanMao.setRifle((AUG)(new Rifle()));//ClassCastException 父类不能转换成子类，只能反向行之
		sanMao.killEnemy();
	}
}
