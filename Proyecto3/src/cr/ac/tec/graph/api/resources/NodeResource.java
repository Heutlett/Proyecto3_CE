package cr.ac.tec.graph.api.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.PUT;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import cr.ac.tec.graph.api.dto.DB;
import cr.ac.tec.graph.api.dto.Entity;
import cr.ac.tec.graph.api.dto.Graph;
import cr.ac.tec.graph.api.dto.Node;

public class NodeResource {

	private String idNode;
	private Graph g;
	
	public NodeResource(Graph g, String idNode) {
		this.idNode = idNode;
		this.g = g;
	}
	
	/**
	 * Elimina el nodo con el id pasado por parametro "PASAR COMO ENTERO http://localhost:9080/Proyecto3/graphs/13/nodes/3"
	 * @return
	 */
	@DELETE
	@Produces("application/json")
	public Response deleteNode() {
		
		if(g != null) {
			for(int i = 0; i < g.getNodes().size(); i++) {
				if(g.getNodes().get(i).getId().equals(idNode)) {
					g.getNodes().remove(i);
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
	 * 
	 */
	@PUT
	@Consumes("application/json")
	@Produces("application/json")
	public Response updateEntity(Entity entity) {
		
		if(g != null) {
			for(int i = 0; i < g.getNodes().size(); i++) {
				if(g.getNodes().get(i).getId().equals(idNode)) {
					g.getNodes().get(i).setEntity(entity);;
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
