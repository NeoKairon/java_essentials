/*
  	Obtener string
	Revisar string y hacer un arreglo de strings usando splits
	Revisar cada string del arreglo y tomar el primer caracter alfabético para transformarlo en mayúscula
	Im
	primir el caracter
 */

package src2.tareas;

import libs.Input;

public class InicialesDificil {

	public static void main(String[] args) {
		Input.print("Por favor escriba su nombre: \n");
		String nombre = Input.get_string().trim();
		String[] nombres = nombre.split(" ");
		
		for(int i=0; i<nombres.length; i++) {
			String palabraActual =  nombres[i];
			
			if(palabraActual.length() > 0 )
				Input.print(Character.toUpperCase(palabraActual.charAt(0)));
		}
	}
}

	