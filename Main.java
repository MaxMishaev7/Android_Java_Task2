import java.util.Scanner;
import ru.netology.service.CustomsService;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scan = new Scanner(System.in);
        int weight;
        int price;
        System.out.print("Введите цену товара (руб.): ");
        price = scan.nextInt();
        System.out.print("Введите вес товара (кг.): ");
        weight = scan.nextInt();
        int duty = CustomsService.calculateCustoms(price, weight);
        System.out.println(duty);
    }
}