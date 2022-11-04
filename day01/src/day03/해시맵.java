package day03;

import java.awt.RenderingHints.Key;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class 해시맵 {

	

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		//객체 삽입하기
		map.put("a", 100);
		map.put("b", 400);
		map.put("c", 300);
		map.put("d", 200);
		
		//객체 검색하기
		System.out.println(map.get("d"));
		
		//모든 값을 다 출력하기
		//먼저 key만 모은다 
		Set keySet = map.keySet();
		Iterator<String> it = keySet.iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key);
			System.out.println(map.get(key));
		}
	}

}
