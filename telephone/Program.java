package telephone;
import telephone.Telephone;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Current_state current_state = new Current_state(0, 0, "internet");
		Dimensions dimensions = new Dimensions(0, 0, 0, 0);
		System_t system_t = new System_t("opersystem", 0, "card");
		Screen screen = new Screen(0, "pixel");
		General_data general_data = new General_data("country", "model", 0);
		System.out.println("Хотите ввести информацию о массиве объектов? 1 -да, 2-нет");
		int vv =in.nextInt();
		if (vv == 1){
			System.out.println("Работа с массивом объектов. Введите информацию о 2 телефонах");
			ArrayList<Telephone> spisok1 = new ArrayList<>();
			int i;
			for (i=0;i<2;i++){
				spisok1.add(new Telephone(current_state, dimensions, system_t, screen, general_data));
				spisok1.get(i).read(in);
				spisok1.get(i).display();
			}
			Telephone.number_phone();
			spisok1.clear();
		}
		System.out.println("Введите данные об объекте с которым будете работать");
		Telephone spisok = new Telephone(current_state, dimensions, system_t, screen, general_data);
		spisok.read(in);
		spisok.display();
		Telephone.number_phone();
		int ext = 0;
		while (ext == 0) {
			System.out.println("Выберите действие, которое хотите совершить:");
			System.out.println("1.Вывод информации");
			System.out.println("2.Зарядить телефон");
			System.out.println("3.Изменить данные памяти");
			System.out.println("4.Ввод новых данных");
			System.out.println("5.Выход");
			int d=in.nextInt();
			if (d == 1){
				spisok.display();
				Telephone.number_phone();
			}
			if (d == 2)
			{
				spisok.zaryad();
			}
			if (d == 3)
				spisok.change();
			if (d == 4) {
				spisok.read(in);
				spisok.display();
				Telephone.number_phone();
			}
			if (d == 5) {
				System.out.print("Вы действительно хотите выйти? (1-Да,2-Нет):");
				int p=in.nextInt();
				if (p == 1)
					System.exit(0);
			}
		} 
	} 
}