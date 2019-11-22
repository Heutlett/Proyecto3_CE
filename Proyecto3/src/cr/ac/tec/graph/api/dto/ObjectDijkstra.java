package cr.ac.tec.graph.api.dto;

import java.util.ArrayList;

public class ObjectDijkstra {
	
	private int valorCamino;
	private String[] idNodesRuta;
	private Node[] nodes;
	
	public ObjectDijkstra() {
		this.valorCamino = 0;
		this.idNodesRuta = null;
		this.nodes = null;
	}
	
	public ObjectDijkstra(int valorCamino, String[] idNodesRuta) {
		this.valorCamino = valorCamino;
		this.idNodesRuta = idNodesRuta;
	}
	
	public ObjectDijkstra(int valorCamino, Node[] nodes) {
		this.valorCamino = valorCamino;
		this.nodes = nodes;
	}

	public int getValorCamino() {
		return valorCamino;
	}

	public void setValorCamino(int valorCamino) {
		this.valorCamino = valorCamino;
	}

	public String[] getRuta() {
		return idNodesRuta;
	}

	public void setRuta(String[] idNodesRuta) {
		this.idNodesRuta = idNodesRuta;
	}

	public Node[] getNodes() {
		return nodes;
	}

	public void setNodes(Node[] nodes) {
		this.nodes = nodes;
	}
	

}
