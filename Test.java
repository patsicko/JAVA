public class Test {

public static void main(String []args){
  
int[] arr={4,2,3,4,5,6,7,55,48};

int largest=arr[0];
int secondLargest=arr[0];

for(int i=0; i<arr.length; i++){
    if(arr[i]>largest){
     secondLargest=largest;
     largest=arr[i];
    }else if(arr[i]>secondLargest && arr[i]!=largest){
secondLargest=arr[i];
    }
}

System.out.println(largest);
System.out.println(secondLargest);

    }
}
