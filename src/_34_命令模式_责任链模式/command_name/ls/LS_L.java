package _34_����ģʽ_������ģʽ.command_name.ls;


import _34_����ģʽ_������ģʽ.CommandVO;
import _34_����ģʽ_������ģʽ.command_name.os.FileManager;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * ls -l ����
 */
public class LS_L extends AbstractLS {

	protected String echo(CommandVO vo) {
		return FileManager.ls_l(vo.formatData());
	}

	//l����
	protected String getOperateParam() {
		return super.L_PARAM;
	}

}
