package _35_工厂方法模式_策略模式;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 策略登记
 */
public enum StrategyMan {
	
//	SteadyDeduction("com.company.SteadyDeduction"),
//	FreeDeduction("com.company.FreeDeduction");

	SteadyDeduction("_35_工厂方法模式_策略模式.SteadyDeduction"),
	FreeDeduction("_35_工厂方法模式_策略模式.FreeDeduction");
	
	String value = "";
	private StrategyMan(String _value){
		this.value = _value;
	}
	
	public String getValue(){
		return this.value;
	}
}
