
public class Caballo implements Runnable{

	public String nombre;
	public int tiempo;
	public int tiempoTotal;
	public int vueltas;
	
	public Caballo (String nombre) {
		this.nombre=nombre;
	}
	
	public void run() {
		try {
			tiempo=0;
			tiempoTotal=0;
			for(vueltas=0; vueltas<10; vueltas++) {
				tiempo= (int)(Math.random()*100);
				tiempoTotal=tiempoTotal + tiempo;
				System.out.println(nombre + " ha tardado " + tiempo + " segundos en completar la vuelta "  + (vueltas+1));
				if(tiempo>= 500) {
					break;
				}
			}
		}catch(Exception e) {System.out.println("Error");}
	}

	public int getTiempoTotal() {
		return tiempoTotal;
	}

	public void setTiempoTotal(int tiempoTotal) {
		this.tiempoTotal = tiempoTotal;
	}

	public int getVueltas() {
		return vueltas;
	}

	public void setVueltas(int vueltas) {
		this.vueltas = vueltas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTiempo() {
		return tiempo;
	}

	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}
}
