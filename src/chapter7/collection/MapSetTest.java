package chapter7.collection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapSetTest {

	public static void main(String[] args) {
		Map<String, Object> map=new HashMap<>();
		
		map.put("name", "Jim");
		map.put("age", 28);
		map.put("address", "新疆乌鲁木齐");
		
		String addr=(String) map.get("address");//通过key取出value
		System.out.println(addr);
        
		Set<String> keys=map.keySet();
		for (String k : keys) {
			System.out.println(k+" "+map.get(k));
		}	
		Collection<Object> values=map.values();
		List<Object>  vaList=new ArrayList<>(values);
		System.out.println(vaList.get(0));
		System.out.println(vaList.get(1));
		System.out.println(vaList.get(2));
		System.out.println("---------------------------");
		Set<Entry<String, Object>>  se=map.entrySet();
		for(Entry<String, Object> entry:se) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
 	}

}
