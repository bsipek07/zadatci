
public class FizzBuzz {
    public static void main(String[] args){

        for(int i =1; i<100; i++){
            int f1=1;
            int f2=0;
            if(i%3 == 0 && i%5==0){
                f1=0;
                f2=1;
            }
            else if(i%3==0){
                System.out.println("Fizz");
                f2=1;
            }
            else if(i%5==0) {
                System.out.println("Buzz");
                f2=1;
            }
            if(f1 == 0){
                System.out.println("FizzBuzz");
            }
            if(f2==0){
                System.out.println(i);
            }

        }
    }

}
