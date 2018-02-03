package _34_����ģʽ_������ģʽ.command;

import _34_����ģʽ_������ģʽ.ClassUtils;
import _34_����ģʽ_������ģʽ.CommandVO;
import _34_����ģʽ_������ģʽ.command_name.CommandName;

import java.util.ArrayList;
import java.util.List;



/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public abstract class Command {
	public abstract String execute(CommandVO vo);
	
	//��������
	protected final List<? extends CommandName> buildChain(Class<? extends CommandName> abstractClass){
		//ȡ�����е��������µ�����
		List<Class> classes = ClassUtils.getSonClass(abstractClass);
		//��������ʵ���������������ϵ
		List<CommandName> commandNameList = new ArrayList<CommandName>();
		for(Class c:classes){
			CommandName commandName =null;
			try {
				//����ʵ��
				commandName = (CommandName)Class.forName(c.getName()).newInstance();
			} catch (Exception e){
				// TODO �쳣����
			}
			
			//��������
			if(commandNameList.size()>0){
				commandNameList.get(commandNameList.size()-1).setNext(commandName);
			}
			commandNameList.add(commandName);
		}
		return commandNameList;
	}
	
}
