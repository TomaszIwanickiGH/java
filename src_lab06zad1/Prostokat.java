
class Prostokat extends Figura {
	double wys=0, szer=0;

	public Prostokat(double wys){
		this.wys = wys;
	}
	public Prostokat(double wys,double szer){
		this.wys = wys;
		this.szer = szer;
	}

	public Prostokat(String kolor, double wys, double szer) {
		super(kolor);
		this.wys = wys;
		this.szer = szer;
	}

	double getPowierzchnia() {
		return (szer * wys);
    }

	public void przesun(double x, double y){
		this.wys += y;
		this.szer += x;
	}

	@Override void opis() {
		System.out.format("Prostokat o wymiarach: %.2f x %.2f o powierzchni %.2f\n", szer, wys, getPowierzchnia());
	}

}