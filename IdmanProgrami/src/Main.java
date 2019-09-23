import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("�dman Program�na ho�geldiniz...");
		
		String idmanlar="1.Bir �ey\n"
				+ "2.��nav\n"
				+ "3.Mekik\n"
				+ "4.��melme";
		
		
		System.out.println(idmanlar);
		
		System.out.println("***************************");
		
		System.out.print("Bir �ey say�s�n� giriniz:");
		int bir_sey=scan.nextInt();
		
		
		
		System.out.print("��nav say�s�n� giriniz...");
		int sinav=scan.nextInt();
		
		System.out.print("Mekik say�s�n� giriniz...");
		int mekik=scan.nextInt();
		
		System.out.print("��melme say�s�n� giriniz...");
		int comelme=scan.nextInt();
		scan.nextLine();
		
		
		
		Idman idman=new Idman(bir_sey, sinav, mekik, comelme);
		
		while(idman.IdmanBittiMi()==false)
		{
			String hareket ;
			
			
			
				
				
			  System.out.println("Hareket turunu giriniz.Hareketler: "+idmanlar);	
			  String deger=scan.nextLine();
			  System.out.println("Say�s�?:");
			  int sayisi=scan.nextInt();
			  
			  scan.nextLine();
			
			  idman.hareketYap(deger, sayisi);
			 
				
			
			
			
		}
		System.out.println("�dman ba�ar�yla bitti...");
		}
			
		
		
	
	
	
	public static boolean isNumeric(String deger)
	{
		for(char c:deger.toCharArray())
		{
			if(!Character.isDigit(c))
				return false;
		}
		return true;
	}

}
