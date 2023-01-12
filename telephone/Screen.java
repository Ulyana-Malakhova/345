package telephone;
import java.util.Scanner;

public class Screen {
	Scanner in = new Scanner(System.in);
	private double diagonal;
	private String pixel;
	private int width_s;
	private int height_s;
	public Screen(double diagonal, String pixel, int width_s, int height_s){
		this.diagonal = diagonal;
		this.pixel = pixel;
		this.width_s = width_s;
		this.height_s = height_s;
	}
	public Screen(double diagonal){
		this.diagonal = diagonal;
		pixel = "pixel";
		height_s = 0;
		width_s = 0;
	}
	public Screen(){
		diagonal=0;
		pixel = "pixel";
		height_s = 0;
		width_s = 0;
	}
	public void read(Scanner in){
		System.out.println("Введем информацию об экране");
		System.out.print("Диагональ(дюйм): ");
		this.diagonal=in.nextDouble();
		System.out.print("Плотность пикселей(ppi): ");
		this.pixel=in.next();
		System.out.print("Ширина(мм): ");
		this.width_s=in.nextInt();
		System.out.print("Высота(мм): ");
		this.height_s=in.nextInt();
	}
	public void display(){
		System.out.println("Информация об экране:");
		System.out.println("-диагональ:"+ diagonal);
		System.out.println("-плотность пикселей:"+ pixel);
		System.out.println("-ширина:"+ width_s);
		System.out.println("-высота:"+ height_s);
	}
	public int getWidth_s(){
		return width_s;
	}
	public int getHeight_s(){
		return height_s;
	}
}