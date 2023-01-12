package telephone;
import java.util.Scanner;

public class General_data {
	Scanner in = new Scanner(System.in);
	private String country;
	private String model;
	private int year;
	public General_data(String country, String model, int year){
		this.country = country;
		this.model = model;
		this.year = year;
	}
	public General_data(String model){
		this.model = model;
		this.country = "country";
		this.year = 0;
	}
	public General_data(){
		this.model="model";
		this.country = "country";
		this.year = 0;
	}
	public void read(Scanner in){
		System.out.println("Введем информацию об общих данных");
		System.out.print("Страна-производитель: ");
		this.country=in.next();
		System.out.print("Модель: ");
		this.model=in.next();
		System.out.print("Год выпуска: ");
		this.year=in.nextInt();
	}
	public void display(){
		System.out.println("Общие данные:");
		System.out.println("-страна-производитель:"+ country);
		System.out.println("-модель:"+ model);
		System.out.println("-год выпуска:"+ year);
	}
}