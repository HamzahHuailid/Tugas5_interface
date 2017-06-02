public interface Hewan {
	public String nama = "Sapi";
	public Int jumlahKaki = "4";
	
	/* Interface tidak dapat di inisiasi*/
public static void main(String[] args) {
	Hewan h = new Hewan();
	
	/*class abstrak dapat mengimplementasi interface secara bebas*/
public abstract class abstrak implements Hewan {
	protected String getNama() {
		return this.nama;
		
	/* implement variabel interface */
public class implnt implements Hewan {
	public static void main (String[] args) {
		implnt i = new implnt();
		i.nama;
		i.jumlahKaki;
	}
}