/* Pattern : N= 5

1
2 2
3 3 3
4 4 4 4
5 5 5 5 5

*/
class Pattern4 {
   static void Pattern4(int N)
{
    // This is the outer loop which will loop for the rows.
    for (int i = 1; i <= N; i++)
    {
       // This is the inner loop which loops for the columns
       // no. of columns = row number for each line here.
       // Here, we print numbers equal to the column number
       for (int j = 1; j <= i; j++)
        {
            System.out.print(i+" ");
        }

         // As soon as N stars are printed, we move to the
        // next row and give a line break otherwise all stars
        // would get printed in 1 line.
        System.out.println();
    }
}

    public static void main(String[] args) {
        
        // Here, we have taken the value of N as 5.
        // We can also take input from the user.
        int N = 5;
        Pattern4(N);
    }
}