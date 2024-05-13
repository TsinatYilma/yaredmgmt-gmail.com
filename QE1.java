package DSA;

import java.util.Scanner;

public class QE1 {
    private int[] nums;

    public QE1(int size) {
        nums = new int[size];
    }
    public void setNumbers(int[] nums) {
        this.nums = nums;
    }

    public int repitition(int findnum) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == findnum) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = ob.nextInt();
        QE1 numberSearch = new QE1(size);

        int[] nums = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("num " + (i + 1) + ": ");
            nums[i] = ob.nextInt();
        }
        numberSearch.setNumbers(nums);

        System.out.print("Enter the number to be searched: ");
        int searchNumber = ob.nextInt();


        int count = numberSearch.repitition(searchNumber);
        if (count > 0) {
            System.out.println(searchNumber + " is in the array");
            System.out.println("It appears " + count + " times");
        } else {
            System.out.println(searchNumber + " is not in the array");
        }
    }
}
