package _02_��ʽ�滻ԭ��.section3;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * ҵ�񳡾�ģ����
 */
public class Client {
	
	public static void main(String[] args) {
		//������ë����ѻ���
		Snipper sanMao = new Snipper();
		sanMao.setRifle((AUG)(new Rifle()));//ClassCastException ���಻��ת�������ֻ࣬�ܷ�����֮
		sanMao.killEnemy();
	}
}
