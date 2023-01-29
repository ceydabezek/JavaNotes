public class RecapDemo1 {
    
    public static void main (String[] args){
        int number1 = 20;
        int number2 = 25;
        int number3 = 26;
        int biggestNumber = number1;

        if (biggestNumber<number2){
            biggestNumber= number2;
            
        }
        if (biggestNumber<number3){
            biggestNumber= number3;
     
        }
        System.out.println("The biggest number = "+biggestNumber);
    }
    
}
