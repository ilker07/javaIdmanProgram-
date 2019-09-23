
public class Idman {
	
	
	private int bir_sey_sayisi;
	private int sinav_sayisi;
	private int mekik_sayisi;
	private int comelme_sayisi;
	public Idman(int bir_sey_sayisi, int sinav_sayisi, int mekik_sayisi, int comelme_sayisi) {
		
		this.bir_sey_sayisi = bir_sey_sayisi;
		this.sinav_sayisi = sinav_sayisi;
		this.mekik_sayisi = mekik_sayisi;
		this.comelme_sayisi = comelme_sayisi;
	}
	public int getBir_sey_sayisi() {
		return bir_sey_sayisi;
	}
	public void setBir_sey_sayisi(int bir_sey_sayisi) {
		this.bir_sey_sayisi = bir_sey_sayisi;
	}
	public int getSinav_sayisi() {
		return sinav_sayisi;
	}
	public void setSinav_sayisi(int sinav_sayisi) {
		this.sinav_sayisi = sinav_sayisi;
	}
	public int getMekik_sayisi() {
		return mekik_sayisi;
	}
	public void setMekik_sayisi(int mekik_sayisi) {
		this.mekik_sayisi = mekik_sayisi;
	}
	public int getComelme_sayisi() {
		return comelme_sayisi;
	}
	public void setComelme_sayisi(int comelme_sayisi) {
		this.comelme_sayisi = comelme_sayisi;
	}
	
	
	public void hareketYap(String hareket_turu,int tane)
	{
		if(hareket_turu.equals("BirSey"))
		{
			BirSey(tane);
		}
		else if(hareket_turu.equals("Sinav"))
		{
			Sinav(tane);
		}
		else if(hareket_turu.equals("Mekik"))
		{
			Mekik(tane);
		}
		else if(hareket_turu.equals("Comelme"))
		{
			Comelme(tane);
		}
		else
		{
			System.out.println("Ge�ersiz giri�...");
		}
	}
	
	
	public void BirSey(int sayi)
	{
		if(bir_sey_sayisi==0)
		
			System.out.println("Yapacak bir �ey kalmad�...");
			
		 if(sayi>bir_sey_sayisi)
		{
			System.out.println("Fazlal�k...");
			bir_sey_sayisi=0;
			System.out.println("Bir �ey say�s�: "+bir_sey_sayisi);
		}
		
		
		else
		{
			bir_sey_sayisi -=sayi;
			System.out.println("Kalan say�n�z: "+bir_sey_sayisi);
		}
		
			
	}
	
	
	public void Sinav(int sayi)
	{
		if(sinav_sayisi==0)
		
			System.out.println("Yapacak bir �ey kalmad�...");
			
		 if(sayi>sinav_sayisi)
		{
			System.out.println("Fazlal�k...");
			sinav_sayisi=0;
			System.out.println("Bir �ey say�s�: "+sinav_sayisi);
		}
		
		
		else
		{
			sinav_sayisi -=sayi;
			System.out.println("Kalan say�n�z: "+sinav_sayisi);
		}
		
			
	}
	
	
	public void Mekik(int sayi)
	{
		if(mekik_sayisi==0)
		
			System.out.println("Yapacak bir �ey kalmad�...");
			
		 if(sayi>mekik_sayisi)
		{
			System.out.println("Fazlal�k...");
			mekik_sayisi=0;
			System.out.println("Mekik say�s�: "+mekik_sayisi);
		}
		
		
		else
		{
			mekik_sayisi -=sayi;
			System.out.println("Kalan say�n�z: "+mekik_sayisi);
		}
		
			
	}
	
	public void Comelme(int sayi)
	{
		if(comelme_sayisi==0)
		
			System.out.println("Yapacak bir �ey kalmad�...");
			
		 if(sayi>comelme_sayisi)
		{
			System.out.println("Fazlal�k...");
			comelme_sayisi=0;
			System.out.println("Bir �ey say�s�: "+comelme_sayisi);
		}
		
		
		else
		{
			comelme_sayisi -=sayi;
			System.out.println("Kalan say�n�z: "+comelme_sayisi);
		}
		
			
	}
	
	
	public boolean IdmanBittiMi()
	{
		return (bir_sey_sayisi==0)&&(mekik_sayisi==0)&&(comelme_sayisi==0)&&(sinav_sayisi==0);
	}
	

}
