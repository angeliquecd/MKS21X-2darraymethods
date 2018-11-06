public class ArrayMethods{

   /*
   *PART 1
   */
   public static int rowSum(int[][] ary, int x){
     int sum = 0;
     for (int i = 0;i<ary[x].length;i++){
       sum+=ary[x][i];
     }
     return sum;
   }
    //returns the sum of the elements in Row x of ary.
    //When x is past the last row count it as a zero. (NO indexOutOfBounds should ever occur)

   public static int columnSum(int[][] ary, int x){
     int sum=0;
     for (int i=0;i<ary.length;i++){
       sum+=ary[i][x];
     }
     return sum;
   }
   *PART 2 - use prior methods where appropriate
  */
  public static int[] allRowSums(int[][] ary){
    int[] newy= new int[ary.length];
    (for int i =0;i<ary.length;i++){
      newy[i]=rowSum(ary,i);
    }
    return newy;
  }
   //returns an array of the row sums for each row of ary.
   //Index i of the return array contains the sum of elements in row i.

   public static int[] allColSums(int[][] ary){}
   //Returns an array with the column sum of each column of ary.
   //When a row is not long enough to reach the column count it as a zero. (NO indexOutOfBounds should ever occur)
   //Index i of the return array contains the sum of elements in column i, ignoring any rows that are too short.
   //The length of the returned array should be the length of the LONGEST array in ary.



   }
    //returns the sum of the elements in Column x of ary (careful with rows of different lengths!).
    //When a row is not long enough to reach the column count it as a zero. (NO indexOutOfBounds should ever occur)
