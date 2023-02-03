package IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {
		//Creación de objetos tipo empleado
/*
		Empleados empleado1 = new SecretarioEmpleado();

		//Uso de los objetos creados

		System.out.println(empleado1.getTareas());*/

		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");

		Empleados Juan = contexto.getBean("miEmpleado", Empleados.class);

		System.out.println(Juan.getTareas());

		//cerramos el contexto o bean
		contexto.close();
	}
}
