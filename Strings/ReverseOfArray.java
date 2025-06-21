
// Reversing of array by method ( .toCharArray() )


class ReverseOfArray{

    static void rev(String str){
        

        char arr[]=str.toCharArray();

        int right =str.length()-1;
        int left=0;

        while(left<right){
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;

            right--;
            left++;
        }

        for(char a:arr){
            System.out.println(a);
        }
    }

    public static void main (String []args){

        String str="abcd";
        rev(str);
    }
}

