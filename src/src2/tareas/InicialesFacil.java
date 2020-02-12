package src2.tareas;

import libs.Input;

public class InicialesFacil {

	public static void main(String[] args) {
		Input.print("Por favor indique su nombre con las iniciales en mayúscula: \n");
		String nombre = Input.get_string();
		for(int i = 0; i<nombre.length(); i++) {
			char actual =  nombre.charAt(i);
			if (actual >= 'A' && actual <= 'Z')
				Input.print(actual);
		}
		
	}

}
