public class Proov1{
	public static void main(String[] args){
		Inimene jaan = new Inimene(188, 85.5, 25, "38401023456");
		Inimene jaanus = new Inimene(180, 65.5, 31, "49002222745");
		Inimene jaanika = new Inimene(170, 55.5, 33, "50011112234");
/*		System.out.println(jaan.bodyMI());
		System.out.println(jaanus.bodyMI());
		System.out.println(jaan.toString());
		System.out.println(jaanus.toString());
		System.out.println(jaanika.toString());
		System.out.println(jaan.BMInorms());
		System.out.println(jaanus.BMInorms());
*/	
		Inimene[] inimesed = new Inimene[3];
			inimesed[0] = jaan;
			inimesed[1] = jaanus;
			inimesed[2] = jaanika;
			for (int i=0; i<inimesed.length ;i++ ) {
				System.out.println(inimesed[i]);
			}

	}
}


/*
Pikkus: 188.0, Kaal: 85.5 Vanus: 25 Sugu: Mees  BMI: 24.0 sinu vanuses inimese keskmine BMI on 25.5
Pikkus: 180.0, Kaal: 65.5 Vanus: 31 Sugu: Naine  BMI: 20.0 sinu vanuses inimese keskmine BMI on 27.6
Pikkus: 170.0, Kaal: 55.5 Vanus: 33 Sugu: Mees  BMI: 19.0 sinu vanuses inimese keskmine BMI on 27.5
*/