package _31_�ṹ��ģʽPK._02_decorator_vs_adapter.decorator;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class StrongBehavior extends Decorator {
	//ǿ��˭
	public StrongBehavior(Swan _swan){
		super(_swan);
	}
	
	//�������
	public void fly(){
		System.out.println("������ˣ�");
	}
}