
public class ejercicio7 {
    public static void main(String[] args) {
        String [] array = fizzBuzzFuncion(1,8);
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }

    }


        public static String[] fizzBuzzFuncion(int a,int b){
        String [] fizzBuzz = new String [b-1];
        for (int i=a;i<b;i++){
            if (i%2==0 && i%3!=0){
                fizzBuzz[i-a]="Fizz";
            } 
            else if (i%3==0 && (i%2!=0)){
                fizzBuzz[i-a]="Buzz";
            } 
            else if ((i%2==0)&&(i%3==0)){
                fizzBuzz[i-a]="FizzBuzz";
            }
            else fizzBuzz[i-a]=String.valueOf(i);
        }
        return fizzBuzz;
    }


}
