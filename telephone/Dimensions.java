package telephone;
import java.util.Scanner;

public class Dimensions {
	Scanner in = new Scanner(System.in);
	private int width;
	private int height;
	private int thickness;
	private int weight;
	public Dimensions(int width, int height, int thickness, int weight){
		this.width = width;
		this.height = height;
		this.thickness = thickness;
		this.weight = weight;
	}
	public Dimensions(int weight){
		this.weight = weight;
		this.thickness = 0;
		this.height = 0;
		this.width = 0;
	}
	public Dimensions(){
		this.weight = 0;
		this.thickness = 0;
		this.height = 0;
		this.width = 0;
	}
	public void read(Scanner in){
		System.out.println("Введем информацию о параметрах телефона");
		System.out.print("Ширина(мм): ");
		this.width=in.nextInt();
		System.out.print("Высота(мм): ");
		this.height=in.nextInt();
		System.out.print("Толщина(мм): ");
		this.thickness=in.nextInt();
		System.out.print("Вес(в граммах): ");
		this.weight=in.nextInt();
	}
	public void display(){
		System.out.println("Параметры:");
		System.out.println("-ширина:"+ width);
		System.out.println("-высота:"+ height);
		System.out.println("-толщина:"+ thickness);
		System.out.println("-вес:"+ weight);
	}
}