package statik.variable.test;

import java.util.HashMap;
import java.util.Map;

public class Operator {

	public void load(){
		Map<Object, String> map = new HashMap<Object, String>();
		map.put(1, "Dask");
		map.put(0, "Konut");
		map.put("yes", "Evet");
		map.put("AIG", "AIG Sigorta A.Ş");
		StaticRepository.setMap(map);
	}
}
