public class komputer{
	protected  int prosesor;
	protected int memori;
	protected int storage;

	public komputer (){
		prosesor = 500;
		System.out.println("kecepatan prosesor komputer = "+prosesor);
	}
}
class Notebook12 extends komputer {
	public int baterai;
	

public Notebook12 (int pr, int me, int st, int ba) {
	prosesor = pr;
	memori =  me ;
	storage = st ;
	baterai = ba ;
}
public void CetakSpesifikasi() {
	System.out.println("kecepatan prosesor notebook: "+prosesor);
	System.out.println("kapasitas memori: "+memori);
	System.out.println("kapasitas storage: "+storage);
	System.out.println("kapasitas baterai: "+baterai+"\n");
}

public void Overclock(int han) {
prosesor = han;
System.out.println("Notebook dioverlock dengan kecepatan prosesor= "+ prosesor);

}
}