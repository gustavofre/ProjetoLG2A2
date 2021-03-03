package Projeto;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HorarioLancamento {
	
	protected LocalDateTime agora = LocalDateTime.now();
		
	HorarioLancamento (LocalDateTime agora){
		setAgora(agora);
	}
	
	
	 public LocalDateTime getAgora() {
		return agora;
	}


	public void setAgora(LocalDateTime agora) {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/YYYY  h:mm a");
		this.agora = agora;
		System.out.println(dtf.format(agora));
		
	}
}
