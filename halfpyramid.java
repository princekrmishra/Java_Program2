import java.util.Scanner; 
public class halfpyramid{ 
  public static void main(String[] args) { 
    Scanner sc=new Scanner(System.in); 
    System.out.println("Enter number of rows of pyramid: "); 
    int n=sc.nextInt(); System.out.println("Half Pyramid: "); 
    for(int i=1;i<=n;i++) { 
      for(int j=1;j<=i;j++) { 
        System.out.print("*"+" "); 
      } 
      System.out.println(); 
    } 
  } 
}
