package cr.ac.tec.graph.api.resources;

import javax.ws.rs.DELETE;
import javax.ws.rs.PUT;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import cr.ac.tec.graph.api.dto.DB;
import cr.ac.tec.graph.api.dto.Edge;
import cr.ac.tec.graph.api.dto.Entity;
import cr.ac.tec.graph.api.dto.Graph;

public class EdgeResource {

	
	private String idEdge;
	private Graph g;
	
	public EdgeResource(Graph g, String idEdge) {
		this.idEdge = idEdge;
		this.g = g;
	}
	
	/**
	 * 
	 */
	@PUT
	@Produces("application/json")
	public Response updateEdge(Edge edge) {
		
		if(g != null) {
			for(int i = 0; i < g.getEdges().size(); i++) {
				if(g.getEdges().get(i).getId().equals(idEdge)) {
					g.getEdges().remove(i);
					g.getEdges().add(edge);
				}
			}
			return Response.status(200)
					.entity(DB.grafos.get(g))
					.build();
		}
		return Response.status(500).entity("ERROR")
				.build();
	}
	
	/**
	 * Elimina el nodo con el id pasado por parametro "PASAR COMO ENTERO http://localhost:9080/Proyecto3/graphs/13/nodes/3"
	 * @return
	 */
	@DELETE
	@Produces("application/json")
	public Response deleteEdge() {
		
		if(g != null) {
			for(int i = 0; i < g.getEdges().size(); i++) {
				if(g.getEdges().get(i).getId().equals(idEdge)) {
					g.getEdges().remove(i);
				}
			}
			return Response.status(200)
					.entity(DB.grafos.get(g))
					.build();
		}
		return Response.status(500).entity("ERROR")
				.build();
	}
	
	
}
