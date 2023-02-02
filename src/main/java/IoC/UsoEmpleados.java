package IoC;

public class UsoEmpleados {

	public static void main(String[] args) {
		//Creación de objetos tipo empleado
/*
		Empleados empleado1 = new SecretarioEmpleado();

		//Uso de los objetos creados

		System.xout.println(empleado1.getTareas());*/

		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
	}
}
