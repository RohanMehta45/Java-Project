import java.util.Scanner;

public class MaxaaaaaaPartition {
    public static void main(String[] args) {
        
               Scanner sc=new Scanner(System.in);
               System.out.println("enter string ");
               String str=sc.next();
               System.out.println("parts in");
               int n=sc.nextInt();
               sc.close();
               int max=0,count=0;
               for(int i=0; i<str.length(); i++){
                    
                  if(i % n == 0){
                    max = Math.max(count,max);
                    count = 0;
                  }

                  if(str.charAt(i) =='a'){
                     count++;
                  }
               }

               max = Math.max(max,count);
               System.out.println(max);

    }
}
