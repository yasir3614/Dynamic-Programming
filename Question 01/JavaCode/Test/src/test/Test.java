// Java program to count 
// inversions in an array 
package test;

import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class Test {
  
    //Code For Random Numbers
    public static int[] getRandomNumber(int totalData){
    
    int data[] = new int[totalData];
    for (int i=0;i<totalData;i++){
        int x = (int) ((Math.random()*((500-1)+1))+1);
        data[i]=x;
    }
        for(int i=0;i<data.length;i++){
            System.out.println(data[i]);
        }
    return data;
    }
    
    
    static int arr[] = getRandomNumber(10000);

    static void getInvCount() throws FileNotFoundException 
    { 
        int n = arr.length;
          int inv_count = 0;
        try (PrintWriter out = new PrintWriter("E:\\uni stuff\\Semester Work\\5th Semester\\Algo\\Test\\Output(10000 Numbers).txt")) {
            for(int i=0;i<arr.length;i++){
//            out.println(arr[i]);
            }
            
//            out.println("Total Inversions: " + getInvCount(arr.length));
            
        
       
        out.println("Input Size = " + arr.length);
        out.println("Total Conversions Output are on the end of file");
        out.println(("arr[i]\t"+"arr[j]\t"+"i\t" + "\tj" + "\n"));
        long startTime = System.nanoTime();
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++){ 
                if (arr[i] > arr[j]) {
                    out.println((arr[i]+"\t"+arr[j]+"\t"+i+"\t" +"\t"+ j+"\t" + "\n"));
                            
                            
                    inv_count++; 
                }
                }
        } 
        long endTime   = System.nanoTime();
            long totalTime = endTime - startTime;
            out.println("Average Execution Time: " + totalTime + " ns");
                    System.out.println("Average Execution Time: " + totalTime + " ns");

        out.println("Total Inversions: "+ inv_count);
                System.out.println("Total Inversions: "+ inv_count);

//return inv_count; 
        }  
    } 
    
    
  
    // Driver method to test the above function 
    public static void main(String[] args) throws FileNotFoundException 
    { 
       getInvCount();

//        System.out.println("Number of inversions are " + getInvCount(arr.length)); 
    } 
} 