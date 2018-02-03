package _30_������ģʽPK._02_AbstractFatory_vs_Builder.builder;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class BMWBuilder extends CarBuilder {
	
	@Override
	public String buildEngine() {
		return super.getBlueprint().getEngine();
	}

	@Override
	public String buildWheel() {
		return super.getBlueprint().getWheel();
	}

}
