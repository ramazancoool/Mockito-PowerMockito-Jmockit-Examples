package statik.variable.test;

import java.util.Map;

public class StaticRepository {

	private static Map<Object, String> map;
	
	private StaticRepository(){
		throw new RuntimeException("unauthorized access");
	}
	
	public static void setMap(Map<Object, String> mapArg){
		map = mapArg;
	}
	
	public static Map<Object, String> getMap(){
		return map;
	}
	
}
