import java.util.Arrays;
public class Main {
    public static void main( String[] args){
        String[][] list1 = {
                {"Abby", "Don", "George", "Kim"},
                {"Brian", "Elenor", "Harry", "Lenny"},
                {"Cathy", "Fred", "Jill", "Matt"}
        };
        list1[1][2] = "Paul";
        for(String[] str: list1)
        {
            System.out.println(Arrays.toString(str));
        }

        String temp = list1[0][0];
        list1[0][0] = list1[2][3];
        list1[2][3] = temp;
        for(String[] str: list1)
        {
            System.out.println(Arrays.toString(str));
        }

        String temp1 = list1[0][0];
        String temp2 = list1[0][1];
        String temp3 = list1[0][2];
        String temp4 = list1[0][3];
        list1[0][0] = list1[1][0];
        list1[0][1] = list1[1][1];
        list1[0][2] = list1[1][2];
        list1[0][3] = list1[1][3];
        list1[1][0] = temp1;
        list1[1][1] = temp2;
         list1[1][2] = temp3;
         list1[1][3] = temp4;
        for(String[] str: list1)
        {
            System.out.println(Arrays.toString(str));
        }
        int[][] list2 = new int [2][3];
        int[][] list3 = new int [3][2];
        list2[0][0] = 1;
        list2[0][1] = 2;
        list2[0][2] = 3;
        list2[1][0] = 4;
        list2[1][1] = 5;
        list2[1][2] = 6;
        for(int[] str: list2)
        {
            System.out.println(Arrays.toString(str));
        }
        list3[0][0] = 1;
        list3[0][1] = 4;
        list3[1][0] = 2;
        list3[1][1] = 5;
        list3[2][0] = 3;
        list3[2][1] = 6;
        for(int[] str: list3)
        {
            System.out.println(Arrays.toString(str));
        }
        System.out.println(FunWith2DArrays.totalElements(list3));
    }


}
