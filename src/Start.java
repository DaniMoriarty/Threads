import java.util.Scanner;

public class Start {

	public static void main(String[] args) throws InterruptedException {
		Scanner input= new Scanner (System.in);
		
		System.out.println("Introduce el nombre del caballo 1:");
		Caballo caballo1= new Caballo(input.nextLine());
		System.out.println("Introduce el nombre del caballo 2:");
		Caballo caballo2= new Caballo(input.nextLine());
		System.out.println("Introduce el nombre del caballo 3:");
		Caballo caballo3= new Caballo(input.nextLine());
		
		Thread hiloUno= new Thread(caballo1);
		Thread hiloDos= new Thread(caballo2);
		Thread hiloTres= new Thread(caballo3);
				
		hiloUno.start();
		hiloDos.start();
		hiloTres.start();
		
		hiloUno.join();
		hiloDos.join();
		hiloTres.join();
		
		System.out.println(caballo1.getNombre() + " ha completado el recorrido en  " + caballo1.getTiempoTotal() + " segundos." );
		System.out.println(caballo2.getNombre() + " ha completado el recorrido en " + caballo2.getTiempoTotal() + " segundos.");
		System.out.println(caballo3.getNombre() + " ha completado el recorrido en " + caballo3.getTiempoTotal() + " segundos.");
		
		for (int i=0; i<1000; i++) {
			if(i== caballo1.getTiempoTotal()) {
				System.out.println("El ganador es " + caballo1.getNombre());
				break;
			}
			if(i== caballo2.getTiempoTotal()) {
				System.out.println("El ganador es " + caballo2.getNombre());
				break;
			}
			if(i== caballo3.getTiempoTotal()) {
				System.out.println("El ganador es " + caballo3.getNombre());
				break;
			}
		}
	}
}
