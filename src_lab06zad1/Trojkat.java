
class Trojkat extends Figura{
	double wys=0, podst=0;

	public Trojkat(double wys, double podst) {
		this.wys = wys;
		this.podst = podst;
	}

	public Trojkat(String kolor, double wys) {
		super(kolor);
		this.wys = wys;
	}
	@Override void opis() {
		System.out.format("Trojkat o wymiarach: %.2f x %.2f", podst, wys);
	}
}