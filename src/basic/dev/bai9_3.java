package basic.dev;

import java.util.Scanner;

public class bai9_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tháng: ");
		int month = sc.nextInt();
		if(month == 1 || month == 3 || month == 5  || month == 7 || month == 8 || month == 10 || month == 12) {
			System.out.println("có 31 ngày");
		}
		if(month == 4 || month == 6 || month == 9 || month == 11) {
			System.out.println("có 30 ngày");
		}
		if(month == 2) {
			System.out.println("có 28 hoặc 29 ngày");
		}
	}

}
