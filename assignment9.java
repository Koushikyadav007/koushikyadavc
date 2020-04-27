//write a function to find the sum of first 10 odd multiples of 3.
class assignment9{ 
      public static void main(String[] args) {
           System.out.println(oddSum());///instance utilization 
      }
      public static int oddSum(){// this is a static method to find the sum of first 10 odd multiples of 3
            int sum = 0; // to store the final value 
            for (int a = 0; a<=10 ; a++ ) {// iterate from  1 to 10 
                  if (a%3 == 0) {// check if the variable a is multiple of 3
                   sum +=a;       //if yes the add it with previous multiple       
              }  
                    
            }
            return sum;// return the total addition of multiple of 3
      }

}

/* iteration flow 

iteration 1
sum = 0
a = 0 if contition failed 
sum = 0
a++
iteration 2
sum = 0
a = 1 if contition failed
sum = 0 
a++
iteration 3
sum = 0
a = 2 if contition failed 
sum = 0
a++
iteration 4
sum = 0
a = 3 if contition passed
sum = 0+3 =>3
a++
iteration 5
sum = 3
a = 4 if contition failed 
sum = 3
a++
iteration 6
sum = 3
a = 5 if contition failed 
sum = 3
a++
iteration 7
sum = 3
a = 6 if contition passed
sum = 3+6 =>9
a++
iteration 8
sum = 9
a = 7 if contition failed 
sum = 9
a++
iteration 9
sum = 9
a = 8 if contition failed 
sum = 9
a++
iteration 10
sum = 9
a = 9 if contition passed
sum = 9+9 =>18
a++
iteration 9
sum = 18
a = 10 if contition failed 
sum = 18
a++
for loop condition failed as a > 10 */