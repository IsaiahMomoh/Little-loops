public class PrimeNumber{
    public static void main(String[] args){

    for(int number = 2; number <= 100; number ++){
    boolean isPrime = true;
   

    for( int index = 2; index <= Math.sqrt(number); index ++){
    if(number % index == 0){
        isPrime = false;

        }
      }
    if (isPrime){
        System.out.println(number + " ");
        }
      }
    
   }
}
          
 
        
       
