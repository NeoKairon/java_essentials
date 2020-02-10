package src1.tareas;

import libs.Input;

public class Buggy1 {

	public static void main(String[] args) {
	    int i = get_negative_int();
	    Input.print(i + " is a negative integer\n");
	}

	public static int get_negative_int()
	{
	    int n;
	    do
	    {
	        Input.print("Input a negative number: \n");
	        n = Input.get_int();
	        if(n > 0)
	        	Input.print("The number is positive, try again \n");
	        else if (n==0)
	        	Input.print("The number is zero, try again \n");
	    }
	    while (n >= 0);
	    return n;
	}
}
