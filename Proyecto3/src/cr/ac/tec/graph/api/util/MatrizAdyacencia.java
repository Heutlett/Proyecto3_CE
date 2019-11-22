package cr.ac.tec.graph.api.util;

import cr.ac.tec.graph.api.dto.Edge;
import cr.ac.tec.graph.api.dto.Graph;

public class MatrizAdyacencia {

	public static DGraph generarMatriz(Graph g){
		
		String[] a = new String[g.getNodes().size()];
		
		for(int i = 0; i < g.getNodes().size(); i++) {
			
			a[i] = g.getNodes().get(i).getId();
			
		}
		
		DGraph graph = new DGraph(a);
		
		for(int i = 0; i < g.getEdges().size(); i++) {
			
			graph.agregarRuta(g.getEdges().get(i).getStart(), g.getEdges().get(i).getEnd(), g.getEdges().get(i).getWeight());
			
		}
		
		return graph;
		
		
	}
	
}
