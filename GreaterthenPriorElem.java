import java.util.Scanner;

public class GreaterthenPriorElem {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elem");
        for(int i =0; i<n; i++){
             arr[i] = sc.nextInt();
        }
        sc.close();
        int min = -1;
        int count = 0;
        for(int i=0; i<n; i++){
            if(arr[i] > min){
                min = arr[i];
                count++;
            }
        }

        System.out.println(count);

        
    }
}
