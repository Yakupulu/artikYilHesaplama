import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int year, hundredYear;
        Scanner input = new Scanner(System.in);
        System.out.print("yil giriniz:");
        year = input.nextInt();
        hundredYear = year % 100;


        if (year % 4 == 0) {
            if (hundredYear == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + "  bir artik yildir.");
                } else {
                    System.out.println(year + "  bir artik yil degildir.");
                }
            } else {
                if (year % 4 == 0) {
                    System.out.println(year + "  bir artik yildir.");
                } else {
                    System.out.println(year + "  bir artik yil degildir.");
                }
            }

        } else {
        System.out.println(year + "  bir artik yil degildir.");
    }


}
}
