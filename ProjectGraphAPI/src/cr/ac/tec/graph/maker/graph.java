package cr.ac.tec.graph.maker;



public class graph {

	//____________________ Atributos
	
	private node firstPerson;
	
	private String graphName;
		
		
		
		
	//____________________ Método constructor
	public graph() {
	}
	public graph(String graphName) {
		this.graphName = graphName;
	}
		
		
	//____________________ Añadir Persona o vértice
	
	public void addPerson(String persona) {
		if(firstPerson == null) {
			node p = new node(persona);
			firstPerson = p;
		}else {
			node p = new node(persona);
			firstPerson.setNextPerson(p);
		}	
	}
	
	
	//___________________ Añadir llamada a persona especifica
	
	public void addCall(String firstPerson, int timeCall, String lastPerson) {
		node fp = choosePerson(firstPerson);		
		fp.addCall(timeCall, lastPerson);
	}
	
	
	//___________________ Seleccionar persona
	private vertice choosePerson(String name) {
		node temp = firstPerson;
		while(!temp.getPerson().equals(name)){
			temp = temp.getNextPerson();
		}
		return temp;
	}

		
		
	//___________________ Getters and Setters
	public String getNombre() {
		return graphName;
	}
	
}
