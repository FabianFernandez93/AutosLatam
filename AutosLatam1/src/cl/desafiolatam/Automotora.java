package cl.desafiolatam;

public class Automotora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Taxi taxi1 = new Taxi("rojo","KFW-12",3500);
		System.out.println(taxi1.toString());
		Bus bus1 = new Bus("amarillo","KFW-13",44);
		System.out.println(bus1.toString());
			
		MiniBus mini1 = new MiniBus("cafe","KWF-11","normal",33);
		
		mini1.imprimeBus();
		System.out.println(mini1.toString());
		bus1.asientosDisponibles();
		

	}
	
	

}
