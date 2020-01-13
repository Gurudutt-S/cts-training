import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapInterfaceexample {

	public static void main(String[] args) {
		HashMap<String,Integer> map1=new HashMap<String,Integer>();
		map1.put("Java", 10000);
		map1.put("C",20000);
		System.out.println(map1);
		System.out.println(map1.get("Java"));
		System.out.println(map1.containsKey("C"));
		System.out.println(map1.containsValue(10000));
		map1.replace("C", 20000,50000);
		System.out.println(map1);

		//Set<Entry<String,Integer>> entries= map1.entrySet();
		for(Entry<String, Integer> entry:map1.entrySet())
		{
			System.out.println(entry.getKey()+"----------->"+entry.getValue());
			
		}
		
		LinkedHashMap<String, Integer> map=new LinkedHashMap<String, Integer>();
		map.put("Angular",50);
		map.put("Bootstrap",100);
		System.out.println(map);
	}

}
