package src2.tareas;

import libs.Input;

public class AlgoritmoCesar {
	
	public static int K = 8;

	public static void main(String[] args) {
		 Input.print("Introduzca el mensaje a encriptar: \n");
		 	String mensaje = Input.get_string().trim();
		 	
		 	for(int i = 0; i < mensaje.length(); i++) {
		 		char actual = mensaje.charAt(i);
		 		encriptChar(actual);
		 	}

	}

	private static void encriptChar(char actual) {
		if(Character.isAlphabetic(actual)) {
			char actualMayuscula = Character.toUpperCase(actual);
			char encriptado = (char) (actualMayuscula + K);
				
			if(encriptado > 90) {
				encriptado = (char)(encriptado - 26);
				Input.print(encriptado);
			}
			else
				Input.print(Character.toUpperCase(encriptado));
		}else {
			Input.print(actual);
		}
		
	}

}
