package _31_�ṹ��ģʽPK._02_decorator_vs_adapter.decorator;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class BeautifyAppearance extends Decorator {
	//Ҫ����˭
	public BeautifyAppearance(Swan _swan){
		super(_swan);
	}
	
	//�����������
	@Override
	public void desAppaearance(){
		System.out.println("����Ǵ���ɫ�ģ��ǳ�����ϲ����");
	}
}
