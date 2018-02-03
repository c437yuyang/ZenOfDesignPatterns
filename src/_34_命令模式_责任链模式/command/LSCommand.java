package _34_命令模式_责任链模式.command;


import _34_命令模式_责任链模式.CommandVO;
import _34_命令模式_责任链模式.command_name.CommandName;
import _34_命令模式_责任链模式.command_name.ls.AbstractLS;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class LSCommand extends Command{
	
	public String execute(CommandVO vo){
		//返回链表的首节点
		CommandName firstNode = super.buildChain(AbstractLS.class).get(0);
		return firstNode.handleMessage(vo);
	}
}
