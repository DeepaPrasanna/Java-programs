/*pattern
 5 5 5 5 5
 4 4 4 4
 3 3 3
 2 2
 1 */
public class pattern4 {
 public static void main(String args[]){
     int i,j;
     for(i=5;i>=1;i--){
         for(j=i;j>=1;j--){
             System.out.print(i+" ");
         }
         System.out.println("");
     }
 }     
}