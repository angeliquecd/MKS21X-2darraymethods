public class ArrayMethods{

   /*
   *PART 1
   */
   public static int rowSum(int[][] ary, int x){
     int sum = 0;
    if (x>=ary.length) return 0;
     for (int i = 0;i<ary[x].length;i++){
       sum+=ary[x][i];
     }
     return sum;
   }
    //returns the sum of the elements in Row x of ary.
    //When x is past the last row count it as a zero. (NO indexOutOfBounds should ever occur)
    public static int longest(int[][] ary){
    int longest=ary[0].length;
    for(int i=0;i<ary.length;i++){
      if (ary[i].length>longest){
        longest=ary[i].length;
      }
    }
    return longest;
  }
   public static int columnSum(int[][] ary, int x){
     int sum=0;
     if (x>=longest(ary)) return 0;
     for (int i=0;i<ary.length;i++){
       if (x>=ary[i].length) sum+=0;
       else{
       sum+=ary[i][x];}
     }
     return sum;
   }
   //PART 2 - use prior methods where appropriate

  public static int[] allRowSums(int[][] ary){
    int[] newy= new int[ary.length];
    for (int i =0;i<ary.length;i++){
      newy[i]=rowSum(ary,i);
    }
    return newy;
  }
   //returns an array of the row sums for each row of ary.
   //Index i of the return array contains the sum of elements in row i.

   public static int[] allColSums(int[][] ary){
     int[] newy= new int[longest(ary)];
     for (int i =0;i<longest(ary);i++){
       newy[i]=columnSum(ary,i);
     }
     return newy;
   }
   /*
*PART 3 - use prior methods where appropriate
*/
public static boolean isRowMagic(int[][] ary){
  int early=rowSum(ary,0);
  for (int i=1;i<ary.length;i++){
    if (early!=rowSum(ary,i)) return false;
    early=rowSum(ary,i);
  }
  return true;
}
  //checks if the array is row-magic (this means that every row has the same row sum).

public static boolean isColumnMagic(int[][] ary){
  int early=columnSum(ary,0);
  for (int i=1;i<ary.length;i++){
    if (early!=columnSum(ary,i)) return false;
    early=columnSum(ary,i);
  }
  return true;
}
 //checks if the array is column-magic (this means that every column has the same column sum).

}
