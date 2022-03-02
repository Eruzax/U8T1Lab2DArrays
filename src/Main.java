import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        String[][] names = {{"Abby", "Don", "George", "Kim"}, {"Brian", "Elenor", "Harry", "Lenny"}, {"Cathy", "Fred", "Jill", "Matt"}};

        for (String[] str : names)
        {
            System.out.println(Arrays.toString(str));
        }

        names[1][2] = "Paul";

        for (String[] str : names)
        {
            System.out.println(Arrays.toString(str));
        }

        String temp = names[0][0];
        names[0][0] = names[2][3];
        names[2][3] = temp;

        for (String[] str : names)
        {
            System.out.println(Arrays.toString(str));
        }

        String[] tempArr = names[0];
        names[0] = names[1];
        names[1] = tempArr;

        for (String[] str : names)
        {
            System.out.println(Arrays.toString(str));
        }

        System.out.println(names[0][2] + names[2][0]);

        //2a - c
        int[][] ints = {{0, 0, 0}, {0, 0, 0}};
        int[][] ints2 = {{0, 0}, {0, 0}, {0, 0}};
    }
}
