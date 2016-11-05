import javax.xml.soap.Text;

public class Operacje {
	private double wynik;
	
	public double dodaj(double liczba1, double liczba2){
		wynik=liczba1+liczba2;
		return wynik;
	}
	public double odejmij(double liczba1, double liczba2){
		wynik=liczba1-liczba2;
		return wynik;
	}
	
	public double pomnoz(double liczba1, double liczba2){
		wynik=liczba1*liczba2;
		return wynik;
	}
	

}
