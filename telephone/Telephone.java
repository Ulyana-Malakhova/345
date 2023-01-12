package telephone;
import telephone.Current_state;
import telephone.Dimensions;
import telephone.System_t;
import telephone.Screen;
import telephone.General_data;
import java.util.Scanner;

public class Telephone {
	Current_state current_state;
	Dimensions dimensions;
	System_t system_t;
	Screen screen;
	General_data general_data;
	Scanner in = new Scanner(System.in);
	public Telephone(Current_state current_state, Dimensions dimensions, System_t system_t, Screen screen, General_data general_data){
		this.current_state = current_state;
		this.dimensions = dimensions;
		this.system_t = system_t;
		this.screen = screen;
		this.general_data = general_data;
	}
	public Telephone(Current_state current_state){
		this.current_state = current_state;
	}
	public Telephone(){

	}
	public void read(Scanner in){
		current_state.read(in);
		dimensions.read(in);
		system_t.read(in);
		screen.read(in);
		general_data.read(in);
	}
	public void display(){
		current_state.display();
		dimensions.display();
		system_t.display();
		screen.display();
		general_data.display();
	}
	public void zaryad(){
		System.out.print("Сколько стало процентов заряда на телефоне?");
		int charge1=in.nextInt();
		current_state.setCharge(charge1);
	}
	public void change(){
		int memory1 = current_state.getMemory();
		String card1 = system_t.getCard();
		System.out.println("Изменения с объемом памяти связаны с:");
		System.out.println("1.Изменением состояния карты памяти");
		System.out.println("2.Изменением объема информации");
	 	int i=in.nextInt();
		if (i == 1) {
			System.out.println("1.Карту памяти ставят в телефон");
			System.out.println("2.Карту памяти убирают из телефона");
			int j=in.nextInt();
			System.out.print("Какой объем памяти у карты?");
			int k=in.nextInt();
			if (j == 1) {
				if (card1.equals("no")==true) {
					memory1 += k;
					current_state.setMemory(memory1);
					system_t.setCard("yes");
				}
				else
					System.out.println("Карта или уже находится в телефоне, или информация о ней неверна");
			}
			if (j == 2) {
				if (card1.equals("yes")==true) {
					memory1 -= k;
					current_state.setMemory(memory1);
					system_t.setCard("no");
				}
				else
					System.out.println("Карты или нет в телефоне, или информация о ней неверна");
			}
		}
		if (i == 2) {
			System.out.println("1.В телефон добавляют информацию");
			System.out.println("2.Из телефона удаляют информацию");
			int j=in.nextInt();
			System.out.print("Какой объем памяти добавили или удалили?");
			int k=in.nextInt();
			if (j == 1) {
				memory1 -= k;
				current_state.setMemory(memory1);
			}
			if (j == 2) {
				memory1 += k;
				current_state.setMemory(memory1);
			}
		}
	}
}