package _03_��������ԭ��.section5;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * ˾��
 */
public class Driver implements IDriver{
	private ICar car;

	//setterע��
	public void setCar(ICar car){
		this.car = car;
	}
	
	//˾������Ҫְ����Ǽ�ʻ����
	public void drive(){
		this.car.run();
	}
}
