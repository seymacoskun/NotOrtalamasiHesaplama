package ortalamaHesaplama;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		int mat, fizik, kimya, turkce, tarih, muzik;
		Scanner input = new Scanner(System.in);
		System.out.println("Matematik notunuzu girin: ");
		mat = input.nextInt();
		System.out.println("Fizik notunuzu girin: ");
		fizik = input.nextInt();
		System.out.println("K�mya notunuzu girin: ");
		kimya = input.nextInt();
		System.out.println("T�rk�e notunuzu girin: ");
		turkce = input.nextInt();
		System.out.println("Tarih notunuzu girin: ");
		tarih = input.nextInt();
		System.out.println("M�zik notunuzu girin: ");
		muzik = input.nextInt();
		
		int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
		double sonuc = toplam / 6;
		System.out.println("Ortalaman�z: " +sonuc);
		
		String durum = sonuc >= 60 ? "S�n�f� ge�tin :)" : "Kald�n :(" ;
		System.out.println(durum);
	}
}
