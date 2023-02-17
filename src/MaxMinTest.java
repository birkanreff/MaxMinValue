import java.util.Scanner;

public class MaxMinTest {

	public static void main(String[] args) {
		
		System.out.print("Kaç adet sayı gireceksiniz:  ");
		Scanner input = new Scanner(System.in);
		int sayac=1;
		int max=0;
		int min=0;
		
		
		int sayiadedi=input.nextInt();
		
		while (sayac <= sayiadedi) {
			System.out.println("Yeni sayı giriniz: ");
			int sayi=input.nextInt();
		
			if (sayac == 1) {
				max = sayi;
			 min = sayi;
			
			} else if (sayac > 1) {
				
				if (sayi >  max ) {
					max = sayi;
				}
				if (sayi < min) {
					min = sayi;
					
			}
					
	} sayac++;
	
			} System.out.println("En büyük sayı:  " + max);
			
			System.out.print("En küçük sayı:  " + min);
		}
	}
		
