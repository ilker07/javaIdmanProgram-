import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Ýdman Programýna hoþgeldiniz...");
		
		String idmanlar="1.Bir Þey\n"
				+ "2.Þýnav\n"
				+ "3.Mekik\n"
				+ "4.Çömelme";
		
		
		System.out.println(idmanlar);
		
		System.out.println("***************************");
		
		System.out.print("Bir þey sayýsýný giriniz:");
		int bir_sey=scan.nextInt();
		
		
		
		System.out.print("Þýnav sayýsýný giriniz...");
		int sinav=scan.nextInt();
		
		System.out.print("Mekik sayýsýný giriniz...");
		int mekik=scan.nextInt();
		
		System.out.print("Çömelme sayýsýný giriniz...");
		int comelme=scan.nextInt();
		scan.nextLine();
		
		
		
		Idman idman=new Idman(bir_sey, sinav, mekik, comelme);
		
		while(idman.IdmanBittiMi()==false)
		{
			String hareket ;
			
			
			
				
				
			  System.out.println("Hareket turunu giriniz.Hareketler: "+idmanlar);	
			  String deger=scan.nextLine();
			  System.out.println("Sayýsý?:");
			  int sayisi=scan.nextInt();
			  
			  scan.nextLine();
			
			  idman.hareketYap(deger, sayisi);
			 
				
			
			
			
		}
		System.out.println("Ýdman baþarýyla bitti...");
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
