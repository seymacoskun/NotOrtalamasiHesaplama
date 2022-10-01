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
		System.out.println("KÝmya notunuzu girin: ");
		kimya = input.nextInt();
		System.out.println("Türkçe notunuzu girin: ");
		turkce = input.nextInt();
		System.out.println("Tarih notunuzu girin: ");
		tarih = input.nextInt();
		System.out.println("Müzik notunuzu girin: ");
		muzik = input.nextInt();
		
		int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
		double sonuc = toplam / 6;
		System.out.println("Ortalamanýz: " +sonuc);
		
		String durum = sonuc >= 60 ? "Sýnýfý geçtin :)" : "Kaldýn :(" ;
		System.out.println(durum);
	}
}
