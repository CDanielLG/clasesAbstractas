
public class testAnimal {

	public static void main(String[] args) {
		
		//Objetos
		
		Perro perro = new Perro();
		Caballo caballo = new Caballo();
		Aguila aguila = new Aguila();
		Cisne cisne = new Cisne();
		Delfin delfin = new Delfin();
		
		
		System.out.println("****************Metodos Perro****************");
		perro.desplazarse();
		perro.sonido();
		
		System.out.println("****************Metodos Caballo**************");
		caballo.desplazarse();
		caballo.sonido();
		
		System.out.println("****************Metodos Aguila****************");
		
		aguila.desplazarse();
		aguila.sonido();
		
		System.out.println("***************Metodos Cisne******************");
		
		cisne.desplazarse();
		cisne.sonido();
		
	System.out.println("******************Metodos Delfin*******************");
		delfin.desplazarse();
		delfin.sonido();
		
		
	}

}
