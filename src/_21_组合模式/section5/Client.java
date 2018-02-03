package _21_组合模式.section5;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {

	public static void main(String[] args) {
		//创建一个根节点
		Composite root = new Composite();
		root.doSomething();
		
		//创建一个树枝构件
		Composite branch = new Composite();
		//创建一个叶子节点
		Leaf leaf = new Leaf();
		
		//建立整体
		root.add(branch);
		branch.add(leaf);		
	}
	
	//通过递归遍历树
	public static void display(Component root){

		for(Component c:root.getChildren()){ //透明模式下，遍历比较方便，只需要调用这个方法即可判断，其实二叉树的一般实现也就是这个透明模式把
			if(c instanceof Leaf){ //叶子节点
				c.doSomething();
			}else{ //树枝节点
				display(c);
			}
		}
		
	}
}
