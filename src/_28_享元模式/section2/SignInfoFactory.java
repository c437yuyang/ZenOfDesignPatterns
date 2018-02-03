package _28_享元模式.section2;

import java.util.HashMap;


/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class SignInfoFactory {
	//池容器,static
	private static HashMap<String,SignInfo> pool = new HashMap<String,SignInfo>();
	
	//报名信息的对象工厂
	@Deprecated //尽量不要删除不用的方法，而是使用过时注解，这样有利于版本的向下兼容，特别是在产品研发中
	public static SignInfo getSignInfo(){
		return new SignInfo();
	}
	
	//从池中获得对象
	public static SignInfo getSignInfo(String key){
		//设置返回对象
		SignInfo result = null;
		//池中没有该对象，则建立，并放入池中
		if(!pool.containsKey(key)){
			System.out.println(key + "----建立对象，并放置到池中");
			result = new SignInfo4Pool(key);
			pool.put(key, result);
		}else{
			result = pool.get(key);
			System.out.println(key +"---直接从直池中取得");
		}
		return result;
	}
}
