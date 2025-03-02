package day01_commit_push_pull;

public class Table {
    public static void main(String[] args) {
        multiplicationTable(5);
    }

    /*
    Method: multiplicationTable
    Parameter: num
    Return: Void
    prints multiplication table
     */

    public static void multiplicationTable(int num) {
        for (int i = 1; i <= 12; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));

        }

    }

}


