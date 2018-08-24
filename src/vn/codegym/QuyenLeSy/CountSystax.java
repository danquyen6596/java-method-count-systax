package vn.codegym.QuyenLeSy;

import java.util.Scanner;

public class CountSystax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string;

        System.out.print("Nhập vào một chuỗi bất kỳ: ");
        string = scanner.nextLine();

        System.out.println("Số ký tự trong chuỗi là: "+countLetter(string));
    }

    public static int countLetter(String string){
        int count = string.length();

        return count;
    }
}
