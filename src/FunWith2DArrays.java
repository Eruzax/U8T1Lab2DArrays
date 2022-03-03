public class FunWith2DArrays
{
    public static int totalElements(int[][] ints)
    {
        return ints.length * ints[0].length;
    }

    public static void fourCorners(String[][] str)
    {
        System.out.println(str[0][0]);
        System.out.println(str[0][str[0].length - 1]);
        System.out.println(str[str.length - 1][0]);
        System.out.println(str[str.length - 1][str[str.length - 1].length - 1]);
    }

    public static double average(int[][] ints)
    {
        double counter = 0.0;
        double total = 0.0;
        for (int i = 0; i < ints.length; i++)
        {
            for(int j = 0; j < ints[0].length; j++)
            {
                total += ints[i][j];
                counter++;
            }
        }
        return total / counter;
    }

    public static int[] indexFound(String[][] str, String target)
    {
        int[] foundIndex = new int[2];

        for (int i = 0; i < str.length; i++)
        {
            for (int j = 0; j < str[0].length; j++)
            {
                String element =str[i][j];
                if (element.equals(target))
                {
                    foundIndex[0] = i;
                    foundIndex[1] = j;

                    return foundIndex;
                }
            }
        }
        foundIndex[0] = -1;
        foundIndex[1] = -1;
        return foundIndex;
    }
}
