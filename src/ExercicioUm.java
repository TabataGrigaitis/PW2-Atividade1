
public class ExercicioUm {
	
	public static boolean ehDiaSemana(String dia) {

		boolean ehdia =(dia=="segunda" || dia=="ter�a"|| dia=="quarta"|| dia=="quinta"|| dia=="sexta"|| dia=="sabado"|| dia=="domingo"); 
		return ehdia;
				
	}
	
public static void main(String[] args) {
	System.out.println(ehDiaSemana("segunda"));
	
	}

}
