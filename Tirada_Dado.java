
public class Tirada_Dado {

	public static void main(String[] args) {
		Tirada();

	}

	private static void Tirada() {
		int dau1= (int) (Math.random()*6)+1;
		int dau2= (int) (Math.random()*6)+1;
		
		System.out.println(dau1+" "+dau2);
		
		if(dau1==dau2) {
			System.out.println("Ganaste");
		}
		else {
			Tirada();
		}

		System.out.println("ESTE ES EL NUEVO CAMBIO");
		
	}

}
