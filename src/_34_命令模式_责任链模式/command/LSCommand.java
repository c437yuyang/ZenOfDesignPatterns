package _34_����ģʽ_������ģʽ.command;


import _34_����ģʽ_������ģʽ.CommandVO;
import _34_����ģʽ_������ģʽ.command_name.CommandName;
import _34_����ģʽ_������ģʽ.command_name.ls.AbstractLS;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class LSCommand extends Command{
	
	public String execute(CommandVO vo){
		//����������׽ڵ�
		CommandName firstNode = super.buildChain(AbstractLS.class).get(0);
		return firstNode.handleMessage(vo);
	}
}
