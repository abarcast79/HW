package com;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.out.println("Hello World!");
		System.out.println("Hello World again!!!");
		System.out.println("Third line");*/
		
		Persona niño = new Persona();
		niño.setEdad(10);
		niño.setNombre("Abraham");
		
		System.out.println("hola mi nombre es: "+niño.getNombre()+" y tengo "+niño.getEdad()+" años");
	}

}
