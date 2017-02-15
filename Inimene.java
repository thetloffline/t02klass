public class Inimene{
	int vanus;
//	String sugu;
	Isikukood isikukood;
//	Keeleoskus keeled;
	Keha pikkus;
	Keha kaal;
	Keha pikkus_kaal;
	

	public Inimene(Keha pikkus_kaal, int vanus, Isikukood isikukood){
		/*if (pikkus <= 0) {throw new RuntimeException("Pikkus on puudu!");}
		if (kaal <= 0) {throw new RuntimeException("Kaal on puudu!");}*/
		if (vanus <= 0) {throw new RuntimeException("Vanus on puudu!");}
		if (vanus >= 150) {throw new RuntimeException("Nii vanu inimesi ei ole olemas!");}
		
		this.pikkus_kaal = pikkus_kaal; this.vanus = vanus; /*this.sugu = sugu;*/ this.isikukood = isikukood;
	}

	public Inimene(double pikkus, double kaal, int vanus, String isikukoodistring){
		this(new Keha(pikkus, kaal), vanus, new Isikukood(isikukoodistring));
	}

	

	String norm;
	public String BMInorms(){
		if (isikukood.kasNaine() == false) {	// MEES
			if (vanus > 20 && vanus <29) {
				norm = "sinu vanuses inimese keskmine BMI on 25.5 ";
			}
			
			if (vanus > 30 && vanus <39) {
				norm = "sinu vanuses inimese keskmine BMI on 27.5 ";
			}
		}
		if (isikukood.kasNaine() == true) {		// NAINE
			if (vanus > 20 && vanus <29) {
				norm = "sinu vanuses inimese keskmine BMI on 25.6 ";
			}
			
			if (vanus > 30 && vanus <39) {
				norm = "sinu vanuses inimese keskmine BMI on 27.6 ";
			}
		}
		return norm;

	}

	@Override
	public String toString(){     /// väljastab kogu asja stringina
		return "Pikkus: "+pikkus_kaal.pikkus+", Kaal: "+pikkus_kaal.kaal+" Vanus: "+vanus+" Sugu: "+(isikukood.kasNaine()?"Naine ":"Mees ")+/*sugu+*/" BMI: "+pikkus_kaal.bmi()+" "+BMInorms();
	}

}