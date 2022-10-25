// FizzBuzz class
class FizzBuzz {
    // main method
    public static void main(String[] args) {
        // loop through 1 - 100
        for(int i = 1; i <= 100; i++) {
            // if divisible by 3 and 5 print 'FizzBuzz'
            if(i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
              // if divisible by 3 print 'Fizz'
            } else if(i % 3 == 0) {
                System.out.println("Fizz");
              // if divisible by 5 print 'Buzz'
            } else if(i % 5 == 0) {
                System.out.println("Buzz");
              // Print i
            } else {
                System.out.println(i);
            }
        }
    }
}