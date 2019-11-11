package cr.ac.tec.graph.maker;



public class node {
	
	//____________________ Atributos
		private String person;
		
		private node nextPerson;
		
		private edge firstCall;
			
			
			
			
		//____________________ Método constructor
		public node() {
		}
		
		public node(String person) {
			this.person = person;
		}
		
		
		//____________________ Método para añadir llamadas
		
		public void addCall(int timeCall, String lastPerson) {
			if(firstCall == null) {
				edge c = new edge(timeCall, person, lastPerson);
				firstCall = c;
			}else {
				edge c = new edge(timeCall, person, lastPerson);
				firstCall.setNextCall(c);
			}
		}
		
		

			
			
		//___________________ Getters and Setters
		public String getPerson() {
			return person;
		}	
		
		public void setNextPerson(vertice nextPerson) {
			this.nextPerson = nextPerson;
		}
		
		public node getNextPerson() {
			return nextPerson;
		}

}
