package ejemplo;

public class HolaJava{
	public String saluda(String quien){
		return String.format("Hola, %s! (en Java)",quien);
	}
	/**
	* Metodo para sumar
	* @param a Primer numero
	* @param b Segundo numero
	* @return Suma de a y b
	*/
	public int suma(int a, int b){
		return a+b;
	}
	
	public int resta(int a,int b){
		return a-b;
	}
	
	public int multiplicacion(int a, int b){
		return a*b;
	}

    public int division(int a, int b){
        return a/b;
    }
}
