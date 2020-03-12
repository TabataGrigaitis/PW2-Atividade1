 package diaa;
 
 import diaa.ExercicioUm;

 public class ExercicioDois {
	public static void main(String[] args) {
		// boolean diaehora = possoIrBanco("sabado", 12);
		// System.out.println(""+diaehora);
		boolean diaValido = possoIrBanco("segunda", 186);
		System.out.println("é dia da semana e horario comercial:" + diaValido);
	}

	public static boolean possoIrBanco(String dia, int hora) {
		//boolean diaehora =((dia=="segunda"&& hora>= 10 && hora<=16)||(dia=="terça"&& hora>= 10 && hora<=16)||(dia=="quarta"&& hora>= 10 && hora<=16)||(dia=="quinta"&& hora>= 10 && hora<=16)||(dia=="sexta"&& hora>= 10 && hora<=16));
		//return diaehora;
		
		/*boolean diaativo = !(dia.equalsIgnoreCase("domingo") || dia.equalsIgnoreCase("sabado"));
		boolean horaati = (hora>= 10 && hora<=16);
		boolean validar =( diaativo && horaati && ExercicioUm.ehDiaSemana(dia));
		return validar;*/
		
		return ExercicioUm.ehDiaSemana(dia) && hora>= 10 && hora<=16;
		
		//return (!(dia.equalsIgnoreCase("sabado") || dia.equalsIgnoreCase("domingo")) && (hora>= 10 && hora<=16));
	}

}
