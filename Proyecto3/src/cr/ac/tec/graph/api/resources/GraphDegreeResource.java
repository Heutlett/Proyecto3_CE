package cr.ac.tec.graph.api.resources;

import java.util.HashMap;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import cr.ac.tec.graph.api.dto.DB;
import cr.ac.tec.graph.api.dto.Graph;
import cr.ac.tec.graph.api.dto.Node;

public class GraphDegreeResource {
	
	private Graph g;
	
	public GraphDegreeResource(Graph g) {
		this.g = g;
	}
	
	/**
	 * Devuelve la lista de grafos
	 * @return
	 */
	@GET
	@Produces("application/json")
	public Response getNodesByDegree(@QueryParam("sort") String sort) {
		
		Node [] nodes = new Node[g.getNodes().size()];
		
		for(int i = 0; i < g.getNodes().size(); i++) {
			
			nodes[i] = g.getNodes().get(i);
			
		}
		
		if(sort.equals("DESC")) {
			
			Node aux;
			
			for(int i = 0; i < nodes.length-1; i++) {
				
				for(int j = 0; j < nodes.length-1; j++) {
					
					int promedio1 = nodes[j + 1].getInDegree() + nodes[j + 1].getOutDegree();
					int promedio2 = nodes[j].getInDegree() + nodes[j].getOutDegree();
					
	                if (promedio1 > promedio2) {
	                    aux = nodes[j + 1];
	                    nodes[j + 1] = nodes[j];
	                    nodes[j] = aux;
	                }
					
				}
				
			}
			
			return Response.status(200)
					.entity(nodes)
					.build();
			
		}else if(sort.equals("ASC")) {
			
			Node aux;
			
			for(int i = 0; i < nodes.length-1; i++) {
				
				for(int j = 0; j < nodes.length-1; j++) {
					
					int promedio1 = nodes[j + 1].getInDegree() + nodes[j + 1].getOutDegree();
					int promedio2 = nodes[j].getInDegree() + nodes[j].getOutDegree();
					
	                if (promedio1 < promedio2) {
	                    aux = nodes[j + 1];
	                    nodes[j + 1] = nodes[j];
	                    nodes[j] = aux;
	                }
					
				}
				
			}
			
			return Response.status(200)
					.entity(nodes)
					.build();
			
		}
		return Response.status(500)
				.build();

	}

}
