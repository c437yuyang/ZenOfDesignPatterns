package _17_װ��ģʽ.section3;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {
	
	public static void main(String[] args) {
		Component component = new ConcreteComponent();
		
		//��һ������
		component = new ConcreteDecorator1(component);
		
		//�ڶ�������
		component = new ConcreteDecorator2(component);
		
		//���κ�����
		component.operate();
		//���е�������: ��ʱ�ȵ���component.operate(),ʵ���ϵ��õ���ConcreteDecorator2��operate(),
		//Ȼ��ConcreteDecorator2��operate()����super().operate(),ʵ�������ʱ��super��һ��ConcreteDecorator1����
		//��˵�������operator���õ���ConcreteDecorator1��operate(),��������������Component.operator()
		
	}

}
