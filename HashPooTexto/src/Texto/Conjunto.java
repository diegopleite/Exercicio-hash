package Texto;

public class Conjunto {
	private String palavra;
		private int frequencia;
		
				
		
		public Conjunto(String palavra, int frequencia ) {
			this.palavra = palavra;
			this.frequencia = frequencia;
			
			
		}
		public String getpalavra() {
			return palavra;
		}
		public int getfrequencia() {
			return frequencia;
		}
		@Override
		public String toString() {
			return "Conjunto [palavra=" + palavra + ", frequencia=" + frequencia + "]";
		}
		
	
		


}
