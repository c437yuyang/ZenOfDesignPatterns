package _34_����ģʽ_������ģʽ.command_name.df;


import _34_����ģʽ_������ģʽ.CommandVO;
import _34_����ģʽ_������ģʽ.command_name.os.DiskManager;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class DF_G extends AbstractDF{
	//����һ���Լ��ܴ���ʲô����
	protected String getOperateParam() {
		return super.G_PARAM;
	}
	
	//�����
	protected String echo(CommandVO vo) {
		return DiskManager.df_g();
	}
}
