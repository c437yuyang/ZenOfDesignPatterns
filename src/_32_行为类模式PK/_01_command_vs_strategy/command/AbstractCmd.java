package _32_��Ϊ��ģʽPK._01_command_vs_strategy.command;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public abstract class AbstractCmd {
	//�Խ����ߵ�Ӧ��
	protected IReceiver compressReceiver = new CompressReceiver();
	protected IReceiver uncompressReceiver = new UncompressReceiver();
	
	//���󷽷�������ľ��嵥Ԫ
	public abstract boolean execute(String source,String to);
}
