package partition;
import java.io.*; 
import java.util.Arrays;
import java.util.Random;
  
class Partition { 
  
    static boolean findPartition (int arr[], int n) throws FileNotFoundException 
    { 
        
        String filename = ("OutputArraySize"+n);
        try (PrintWriter out = new PrintWriter("E:\\uni stuff\\Semester Work\\5th Semester\\Algo\\Partition\\"+filename+".txt")){
        
        int sum = 0; 
        int i, j; 
        
        long startTime = System.nanoTime();
        for (i = 0; i < n; i++) 
            sum += arr[i]; 
  
        if (sum%2 != 0) 
            return false; 
  
        boolean part[][]=new boolean[sum/2+1][n+1]; 
  
        for (i = 0; i <= n; i++) 
            part[0][i] = true; 
  
        for (i = 1; i <= sum/2; i++) 
            part[i][0] = false; 
        for (i = 1; i <= sum/2; i++) 
        { 
            for (j = 1; j <= n; j++) 
            { 
                part[i][j] = part[i][j-1]; 
                if (i >= arr[j-1]) 
                    part[i][j] = part[i][j] || 
                                 part[i - arr[j-1]][j-1]; 
            } 
        } 
         long endTime   = System.nanoTime();
         long totalTime = endTime - startTime;
            System.out.println("Total Time Elapsed= " + totalTime);
        out.println("Total Time Elapsed= " + totalTime + " ns");
        
//        System.out.println("DP Table For The Array = " + Arrays.toString(arr));
//               out.println("DP Table For The Array = " + Arrays.toString(arr));

        System.out.println("Array Size = " + arr.length);
                out.println("Array Size = " + arr.length);
                out.println();

        
       
         for(int k=0;k<=n;k++){
             System.out.print("\t"+k);
             out.print("\t"+k);

         }
         System.out.println("");
         for(int k=0;k<=n;k++){
            System.out.print("\t"+"-");
            out.print("\t"+"-");

          }
         System.out.println("");
         System.out.println("");
         out.println("");
         out.println("");

                  
        for (i = 0; i <= sum/2; i++) 
        {
            
            System.out.print(arr[i]+"|");
            out.print(arr[i]+"|");

            for (j = 0; j <= n; j++) {
                
                if(part[i][j]){
                System.out.print("\t1");
                out.print("\t1"); 

                }else{
                System.out.print("\t0"); 
                out.print("\t0"); 

                }
                  
            }
                System.out.println("");
                out.println("");

        } 
        
       
        return part[sum/2][n]; 
    } 
   }
    
      public static int[] getRandomNumber(int totalData){
    
    int data[] = new int[totalData];
    for (int i=0;i<totalData;i++){
        int x = (int) ((Math.random()*((500-1)+1))+1);
        data[i]=x;
    }
        for(int i=0;i<data.length;i++){
//            System.out.println(data[i]);
        }
    return data;
    }
      
    public static void main (String[] args) throws FileNotFoundException 
    { 
      
        int Array10[] = getRandomNumber(10);
        int Array100[] = getRandomNumber(100);
        int Array1000[] = getRandomNumber(1000);
        int Array10000[] = getRandomNumber(10000);

        
//        int arr[] = {3, 1, 1, 2, 2,1}; 
        
        
        if (findPartition(Array1000, Array1000.length) == true) 
            System.out.println("Can be divided into two subsets of equal sum"); 
        else
            System.out.println("Can not be divided into two subsets of equal sum"); 
    } 
} 