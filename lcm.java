// WAP to accept two numbers and find the L.C.M of the numbers.
import java.io.*;
public class lcm {
    public static void main(String args[])throws IOException{
    InputStreamReader read=new InputStreamReader(System.in);
    BufferedReader in= new BufferedReader(read);
    int a, b ,i,product=0,hcf=0;
    float lcm;
//first find the hcf
    System.out.println("Enter two numbers");
    a=Integer.parseInt(in.readLine());
    b=Integer.parseInt(in.readLine());

    product=a*b;
    for(i=1;i<=product;i++){
        if((a%i==0)&&(b%i==0)){
          hcf=i;
        }
    }
    //to find the lcm now
    lcm=product/hcf;
    System.out.println("The L.C.M of "+a +"and "+ b +" is " +lcm);

    }

}