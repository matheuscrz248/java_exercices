package challenges.pairsmallestdiff;

public class Main {

    /*
    Dado um array de inteiros e um valor alvo x, encontre dois números cuja soma seja x.
    Entrada	/ Saída
    [1, 4, 7, 10], x = 11  /  (4, 7)
    */

    public static void main(String[] args) {

    int[] nums = {1, 4, 7, 10};
    int target = 11;

    outer:
    for (int i = 0; i < nums.length; i++) {
        for (int i2 = i + 1; i2 < nums.length; i2++) {
            if (nums[i] + nums[i2] == target) {
                System.out.println(nums[i] + " " + nums[i2]);
                break outer;
            }
        }
    }

    }
}
