package Projeto;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HorarioLancamento {
	
	public static void main(String args[]) {
		
	LocalDateTime now = LocalDateTime.now();
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/YYYY  h:mm a");
	System.out.println(dtf.format(now));
	}	
}
