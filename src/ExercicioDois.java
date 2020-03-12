
public class ExercicioDois {
	public static void main(String[] args) {
		boolean diaehora = possoIrBanco("sabado", 12);
		System.out.println(""+diaehora);
	}
	
	public static boolean possoIrBanco(String dia, int hora) {
		boolean diaehora =((dia=="segunda"&& hora>= 10 && hora<=16)||(dia=="terça"&& hora>= 10 && hora<=16)||(dia=="quarta"&& hora>= 10 && hora<=16)||(dia=="quinta"&& hora>= 10 && hora<=16)||(dia=="sexta"&& hora>= 10 && hora<=16));
		return diaehora;
	}

}
