package cr.ac.tec.graph.api.resources;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/graph")
public class GraphsFinalResource {

	
	
	
	/**
	 * Busca un grafo por id y realiza diferentes acciones
	 * @param graphId
	 * @return
	 */
	@Path("{id}")
	public GraphFinalResource handleSigleGraph(@PathParam("id") String graphId) {
		return new GraphFinalResource(graphId);
	}
	
}
