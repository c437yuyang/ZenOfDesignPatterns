package _34_命令模式_责任链模式.command_name.ls;


import _34_命令模式_责任链模式.CommandVO;
import _34_命令模式_责任链模式.command_name.os.FileManager;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * ls -l 命令
 */
public class LS_L extends AbstractLS {

	protected String echo(CommandVO vo) {
		return FileManager.ls_l(vo.formatData());
	}

	//l参数
	protected String getOperateParam() {
		return super.L_PARAM;
	}

}
