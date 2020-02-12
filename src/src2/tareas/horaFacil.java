/*
 * Obtener la hora con un get string
 * Revisar el string y usar split para separar los números
 * Hacer un input print para hora, minutos y segundos respectivamente
 * 
 * 
 * 
 * */


package src2.tareas;

import libs.Input;

public class horaFacil {

	public static void main(String[] args) {
		Input.print("Por favor la hora: \n");
		String hora = Input.get_string().trim();
		String[] digits = hora.split(":");
				
		Input.print("Son las " + digits[0] + " horas con " + digits[1] + " minutos con " + digits[2] + " segundos");
				
		}
}

	