package day21_multiDimensionalArray;

public class Class07_MultiDimensionalArrayPractice3 {
    public static void main(String[] args) {
        //- 4D array
        //-- Can only hold 3D arrays

        int[][][] arr3D1 = { {{1,2}, {3, 4, 5}} ,  {{6, 7, 8, 9},{12, 13, 14}} };
        int[][][] arr3D2 = { {{1,2}, {3, 4, 5}} ,  {{6, 7, 8, 9},{12, 13, 14}} };
        int[][][] arr3D3 = { {{1,2}, {3, 4, 5}} ,  {{6, 7, 8, 9},{12, 13, 14}} };

        int[][][][] arr4D = {   arr3D1, arr3D2, arr3D3};

        //! Iterate the 3D, 2D, 1D arrays, and elements using a nested For-Each loop
        for (int[][][] each3D : arr4D) { //!! iterates all 3D arrays from arr4D
            for (int[][] each2D : each3D) { //!! iterates all 2D arrays from each3D
                for (int[] each1D : each2D) { //!! iterates all 1D arrays from each2D
                    for (int eachElement : each1D) { //!! iterates all elements from each1D
                        System.out.print(eachElement);
                    }//inner inner inner For-Each loop close
                }//inner inner For-Each loop close
            }//inner For-Each loop close
        }//outer For-Each loop close




    }//main close
}//class close
