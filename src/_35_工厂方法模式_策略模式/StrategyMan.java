package _35_��������ģʽ_����ģʽ;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * ���ԵǼ�
 */
public enum StrategyMan {
	
//	SteadyDeduction("com.company.SteadyDeduction"),
//	FreeDeduction("com.company.FreeDeduction");

	SteadyDeduction("_35_��������ģʽ_����ģʽ.SteadyDeduction"),
	FreeDeduction("_35_��������ģʽ_����ģʽ.FreeDeduction");
	
	String value = "";
	private StrategyMan(String _value){
		this.value = _value;
	}
	
	public String getValue(){
		return this.value;
	}
}
