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

        for (int[] intss : ints)
        {
            System.out.println(Arrays.toString(intss));
        }

        for (int[] intss : ints2)
        {
            System.out.println(Arrays.toString(intss));
        }

        ints[0][0] = 1;
        ints[0][1] = 2;
        ints[0][2] = 3;
        ints[1][0] = 4;
        ints[1][1] = 5;
        ints[1][2] = 6;

        ints2[0][0] = 1;
        ints2[0][1] = 2;
        ints2[1][0] = 3;
        ints2[1][1] = 4;
        ints2[2][0] = 5;
        ints2[2][1] = 6;

        for (int[] intss : ints)
        {
            System.out.println(Arrays.toString(intss));
        }

        for (int[] intss : ints2)
        {
            System.out.println(Arrays.toString(intss));
        }
    }
}
