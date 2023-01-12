package telephone;
import java.util.Scanner;

public class System_t {
	Scanner in = new Scanner(System.in);
	private String opersystem;
	private int internalm;
	private String card;
	public System_t(String opersystem, int internalm, String card){
		this.opersystem = opersystem;
		this.internalm = internalm;
		this.card = card;
	}
	public System_t(String opersystem){
		this.opersystem = opersystem;
		this.internalm = 0;
		this.card = "card";
	}
	public System_t(){
		this.opersystem = "opersystem";
		this.internalm = 0;
		this.card = "card";
	}
	public void read(Scanner in){
		System.out.println("Введем информацию о системе");
		System.out.print("Операционная система: ");
		this.opersystem=in.next();
		System.out.print("Встроенная память(Гб): ");
		this.internalm=in.nextInt();
		System.out.print("Карта памяти(yes/no): ");
		this.card=in.next();
	}
	public void display(){
		System.out.println("Система:");
		System.out.println("-операционная система:"+ opersystem);
		System.out.println("-встроенная память:"+ internalm);
		System.out.println("-карта памяти:"+ card);
	}
	public String getCard(){
		return card;
	}
	public void setCard(String card){
		this.card = card;
	}
}