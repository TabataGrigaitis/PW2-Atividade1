
public class ExercicioUm {
	
	public static boolean ehDiaSemana(String dia) {

		boolean ehdia =(dia=="segunda" || dia=="ter�a"|| dia=="quarta"|| dia=="quinta"|| dia=="sexta"); 
		return ehdia;
		//ou 
		//if(dia=="domingo"||dia=="sabado")
		//{return false;}
		//else{return true}
	}
	
public static void main(String[] args) {
	System.out.println(ehDiaSemana("segunda"));
	
	}

}
