public class Traversing
{
    public static void main(String[] args)
    {
        System.out.println("PROBLEM 1:");

        int[][] testArr1 = {{1, 2},
                {3, 4},
                {5, 6}};
        // write code below that uses nested INDEX-BASED for loops
        // to print each element in testArr1 in ROW-MAJOR order; i.e. 1, 2, 3, 4, 5, 6
        for(int row = 0; row < testArr1.length; row++)
        {
            for(int col = 0; col < testArr1[0].length; col++)
            {
                System.out.println(testArr1[row][col]);
            }
        }

        /* WRITE CODE HERE! */

        System.out.println("---------");
        // now, write code below that uses nested ENHANCED for loops
        // to print each element in testArr1 in row-major order AGAIN; i.e. 1, 2, 3, 4, 5, 6

        for(int[] row : testArr1)
        {
            for(int element : row)
            {
                System.out.println(element);
            }
        }

        System.out.println("---------");
        // lastly, write code below that uses nested INDEX-BASED for loops
        // to print each element in testArr1 in COLUMN-MAJOR order; i.e. 1, 3, 5, 2, 4, 6

        for(int col = 0; col < testArr1[0].length; col++)
        {
            for(int row = 0; row < testArr1.length; row++)
            {
                System.out.println(testArr1[row][col]);
            }
        }

        /* --- PROBLEM 2 --- */
        System.out.println("---------");
        System.out.println("PROBLEM 2:");

        String[][] testArr2 = {{"ant", "bird", "camel"}, {"dog", "elephant", "fish"}};
        // write code below using a nested ENHANCED for loop to print each element in
        // testArr2 in ROW-MAJOR order; i.e. ant, bird, camel, dog, elephant, fish
        for(String[] row : testArr2)
        {
            for(String element : row)
            {
                System.out.println(element);
            }
        }

        /* WRITE CODE HERE! */

        System.out.println("---------");
        // write code below using an INDEX-BASED nested for loop to print each element in
        // testArr2 in COLUMN-MAJOR order; i.e. ant, dog, bird, elephant, camel, fish

        /* WRITE CODE HERE! */
        for(int col = 0; col < testArr2[0].length; col++)
        {
            for(int row = 0; row < testArr2.length; row++)
            {
                System.out.println(testArr2[row][col]);
            }
        }
    }
}