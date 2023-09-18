package A3;

public class Vacina extends AgendamentoVeterinario{

	private int vacina;
	
	Vacina(){
	}
	Vacina (int vacina) {
		this.vacina= vacina;
	}

	public int getvacina() {
		return vacina;
	}
	public void setvacina(int vacina) {
		this.vacina = vacina;
	}
}
