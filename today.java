public class today{
    public static void main(String[] args){


int max = 0;
int min = 0;
int secondMax = 0;

int [] numbers = {2, 1, 6, 3, 4};

for(int index = 0; index < numbers.length ; index ++){
    if(numbers[index] % 2 == 0){

    if(numbers[index] > max){
       max = numbers[index];
}else if(numbers[index] > secondMax){
            secondMax = numbers[index];

}else if(numbers[index] > min){
            min = numbers[index];



}



}



}



System.out.println("Largest even number is " + max);
System.out.println("Second Largest even number is " + secondMax);
System.out.println("Mininmum even number is " + min);
//
//

























System.out.println("\nTask Two");


int largest = 0;
int thirdLargest = 0;
int secondLargest = 0;

int [] scores = {10, 5, 4, 8, 15};

for(int index = 0; index < scores.length; index ++){
     
   if(scores[index] % 2 == 0){
     
    if(scores[index] > largest){
         secondLargest =  largest;
        largest = scores[index];



  }else if(scores[index] > secondLargest){
         thirdLargest = secondLargest;
         secondLargest = scores[index];
       

  } else if(scores[index] > thirdLargest ){
           thirdLargest = scores[index];
       


}
}



}



    System.out.println("First even largest is " + largest);

    System.out.println("Second even largest is " + secondLargest);


    System.out.println("Third even Largest largest is " +  thirdLargest);


}

}


