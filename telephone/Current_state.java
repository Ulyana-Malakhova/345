package telephone;
import java.util.Scanner;

public class Current_state {
	Scanner in = new Scanner(System.in);
	private int charge;
	private int memory;
	private String internet;
	public Current_state(int charge, int memory, String internet){
		this.charge = charge;
		this.memory = memory;
		this.internet = internet;
	}
	public Current_state(int charge){
		this.charge = charge;
		this.memory = 0;
		this.internet = "internet";
	}
	public Current_state(){
		this.charge = 0;
		this.memory = 0;
		this.internet = "internet";
	}
	public void read(Scanner in){
		System.out.println("Введем информацию о нынешнем состоянии");
		System.out.print("Заряд(в процентах): ");
		this.charge=in.nextInt();
		System.out.print("Свободная память(Гб): ");
		this.memory=in.nextInt();
		System.out.print("Интернет: ");
		this.internet=in.next();
	}
	public void display(){
		System.out.println("Нынешнее состояние:");
		System.out.println("-заряд:"+charge);
		System.out.println("-свободная память:"+ memory);
		System.out.println("-интернет:"+ internet);
	}
	public int getMemory(){
		return memory;
	}
	public void setMemory(int memory){
		this.memory = memory;
	}
	public int getCharge(){
		return charge;
	}
	public void setCharge(int charge){
		this.charge = charge;
	}
}