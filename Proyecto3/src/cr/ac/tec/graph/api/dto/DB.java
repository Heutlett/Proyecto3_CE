package cr.ac.tec.graph.api.dto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class DB {

	
	public static Map<String, Graph> grafos = new HashMap();
	
	public static boolean deleteGraph(String id) {
		
		for(int i = 0; i < grafos.size(); i++) {
			if(grafos.get(i).getId().equals(id)) {
				grafos.remove(i);
				return true;
			}
		}
		return false;
		
	}
	

	
	public static Graph searchGraph(String id) {
		
		for(int i = 0; i < grafos.size(); i++) {
			
			if(grafos.get(i).getId().equals(id)) {
				return grafos.get(i);
			}
			
		}
		return null;
	}
}
