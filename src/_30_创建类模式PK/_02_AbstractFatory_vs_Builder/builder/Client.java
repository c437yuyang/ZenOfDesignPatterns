package _30_������ģʽPK._02_AbstractFatory_vs_Builder.builder;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {

	public static void main(String[] args) {
		//�����������
		Director director =new Director();
		//����һ�����۳�SUV
		System.out.println("===����һ�����۵�SUV===");
		ICar benzSuv = director.createBenzSuv();
		System.out.println(benzSuv);
		//����һ�����������
		System.out.println("\n===����һ�����������===");
		ICar bmwVan = director.createBMWVan();
		System.out.println(bmwVan);
		//����һ����ϳ���
		System.out.println("\n===����һ����ϳ�===");
		ICar complexCar = director.createComplexCar();
		System.out.println(complexCar);
	}
}

