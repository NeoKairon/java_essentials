/*
 * Dividir los digitos del tiempo en un arreglo de strings
 * Revisar que el arreglo de strings no supere el indice de 2 (0-2)
 * Asignar cada string del arreglo a una variable especifica (hora, minutos, segundos)
 * Al asignar cada string a la variable correspondiente hay que transformarlo a entero
 * Revisar que la variable hora este en el rango de 0-23, de no ser así imprimir error y salir del programa
 * 	Ya que el formato estará en formato am/pm (n == 0 && n>=13 && n<=23) entonces restar 12
 * 	Hacer una verificación que si el número es negativo transformalo a positivo, lo cual solo sirve para las 12 PM
 * 	Si n >=0 && n<=11 entonces AM
 *  Si n >=12 && n<=13 entonces PM
 * Revisar que la variable minutos este en el rango de 0-59, de no ser asi imprimir error y salir del programa
 * Revisar que la variable segundos este en el rango de 0-59, de no ser asi imprimir error y salir del programa
 * 
 * 
 * */


package src2.tareas;

import libs.Input;

public class horaDificil {

	public static void main(String[] args) {
		Input.print("Por favor la hora: \n");
		String hora = Input.get_string().trim();
						
		verifyFormat(hora);
		
		String[] digits = hora.split(":");
		int size = digits.length;
				
		if (size > 3)
			Input.print("El formato de la hora es incorrecto.");
		
		else {
			int hrs = Integer.parseInt(digits[0]);
			int min = Integer.parseInt(digits[1]);
			int seg = Integer.parseInt(digits[2]);
			
			verifyDigits(hrs, min, seg);
			transformHrs(hrs);
			
			Input.print(min + " minutos y " + seg + " segundos.");
		}
	}

	private static void verifyFormat(String hora) {
		for(int i = 0; i < hora.length(); i++) {
			if(Character.isAlphabetic(hora.charAt(i))) {
				Input.print("El formato de la hora es incorrecto.");
				System.exit(0);
			}
	//		else if(Character.)
		}
		
	}

	private static void transformHrs(int hrs) {
			int hr = hrs;
			
			if (hr == 0 || hr >= 13 || hr <=23) {
				hr = hr - 12;
				Math.abs(hr);
				if (hr == 1) 
					Input.print("Es la " + hr + " PM con ");
				else 
					Input.print("Son las " + hr + " PM con ");				
			}
			else {
				if (hr == 1)
					Input.print("Es la " + hr + " AM con ");
				else 
					Input.print("Son las " + hr + " PM con ");
			}			
	}

	private static void verifyDigits(int hrs, int min, int seg) {
		if (hrs > 23) {
			Input.print("El formato de la hora es incorrecto.");
			System.exit(0);
		}
		
		else if (min > 59) {
			Input.print("El formato de la hora es incorrecto.");
			System.exit(0);	
		}
		
		else if(seg > 59){
			Input.print("El formato de la hora es incorrecto.");
			System.exit(0);	
		}
	}
}

	