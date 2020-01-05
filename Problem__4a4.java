
package problem__4a4;

public class Problem__4a4 {
    public static void onesdigit(int a,int b){
        int r;
         r=Math.min(a,b)%10;
          if(r==0)
            System.out.println("the one's digit in the smallest number can't be zero");
        else{
            System.out.println("the numbers divisible by "+r+" between "+Math.min(a, b)+" and "+Math.max(a, b)+" are:");
             for(int i=Math.min(a, b);i<=Math.max(a, b);i++){
             if(i%r==0)
                 System.out.print(i+" ");
                }
             System.out.println();
        }
    }
  
    public static void main(String[] args) {
        int a,b,r;
        do{
      a= (int) (10+Math.random() * 101);
      b=  (int) (10+Math.random() * 101);
        System.out.println("the randomly generated integers are "+a+" and "+b);
        
       onesdigit(a,b);
        r=Math.min(a,b)%10;
        }while(r==0);
        }
    }