package diaa;


public class ExercicioUm {

	public static boolean ehDiaSemana(String dia) {

		// boolean ehdia =(dia=="segunda" || dia=="terça"|| dia=="quarta"||
		// dia=="quinta"|| dia=="sexta");
		// return ehdia;

		// ou
		// if(dia.equalsIgnoreCase("domingo")||
		// dia.equalsIgnoreCasedia=="sabado")
		// {return false;}

		// else{return true}
		return !(dia.equalsIgnoreCase("domingo") || dia.equalsIgnoreCase("sabado"));
	}

	public static void main(String[] args) {
		// System.out.println(ehDiaSemana("segunda"));

		boolean diaValido = ehDiaSemana("DOMINGO");
		System.out.println("é dia da semana:" + diaValido);
	}

}
