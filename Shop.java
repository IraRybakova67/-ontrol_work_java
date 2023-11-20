import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {

        Lot pc1 = new Lot("Aser", 8, 256, "Windows Pro", "Серебристый", 31904, 3);
        Lot pc2 = new Lot("Huawei", 16, 512, "Windows Pro", "Черный", 35790, 2);
        Lot pc3 = new Lot("Honor", 16, 256, "Windows Home", "Серебристый", 87290, 1);
        Lot pc4 = new Lot("Asus", 16, 512, "Без системы", "Черный", 66321, 5);
        Lot pc5 = new Lot("Lenovo", 16, 1024, "Windows Home", "Серебристый", 124120, 2);

        HashSet<Lot> laptops = new HashSet<>();
        laptops.add(pc1);
        laptops.add(pc2);
        laptops.add(pc3);
        laptops.add(pc4);
        laptops.add(pc5);

        for (Lot pc : laptops) {
            System.out.println(pc);
            System.out.println();

        }
        System.out.println();

        System.out.println(
                "==============================================================================================");
        System.out.println();
        Map<Integer, String> mapCrit = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        mapCrit.put(1, "ОЗУ");
        mapCrit.put(2, "Oбъем ЖД");
        mapCrit.put(3, "Минимальная цена");

        System.out.println("Введите 1. ОЗУ: ");
        int ramUser = sc.nextInt();
        System.out.println("Введите 2. Oбъем ЖД: ");
        int storUser = sc.nextInt();
        System.out.println("Введите 3. Минимальную цену ");
        int priceUser = sc.nextInt();

        System.out.println();

        for (Lot lap : laptops) {
            if ((lap.getRandomAccessMemory() >= ramUser) && (lap.getHardDiskDrive() >= storUser)
                    && (lap.getPrice() >= priceUser)) {
                System.out.println(lap.toString());
                System.out.println();

            }

        }
        sc.close();
    }

}