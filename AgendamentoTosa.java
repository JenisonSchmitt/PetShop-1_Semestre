package A3;

public class AgendamentoTosa extends AgendamentoPet {

	private int valortosa;
	
	AgendamentoTosa(){
	}
	AgendamentoTosa (int valortosa, String tosa) {
		this.valortosa = valortosa;
	}
	public int getvalortosa() {
		return valortosa;
	}
	public void setvalortosa(int string) {
		this.valortosa = string;
	}
}
