
public abstract class Animal {
String nombre;





   public abstract void desplazarse();
	public abstract void sonido();


}

class Perro extends Animal{

	@Override
	public void desplazarse() {
		System.out.println("*Caminar con 4 patas*");
		
	}

	@Override
	public void sonido() {
		System.out.println("guau");
		
	}
	
	
}
class Aguila extends Animal{

	@Override
	public void desplazarse() {
		System.out.println("Volar");
		
	}

	@Override
	public void sonido() {
		System.out.println("*chillido*");
		
	}
	
}
class Caballo extends Animal {

	@Override
	public void desplazarse() {
	System.out.println("Caminar a 4 patas");
		
	}

	@Override
	public void sonido() {
		System.out.println("Relincho");
		
	}
	
	
}
class Cisne extends Animal{

	@Override
	public void desplazarse() {
	System.out.println("caminar con patas palmeadas");
	System.out.println("Nadar");
		
	}

	@Override
	public void sonido() {
	System.out.println("Graznido");
		
	}
	
}
class Delfin extends Animal{

	@Override
	public void desplazarse() {
		System.out.println("Nadar");
		
	}

	@Override
	public void sonido() {
		System.out.println("Chasquido");
		
	}
	
}
