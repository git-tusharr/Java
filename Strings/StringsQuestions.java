// Reversing an string



// class StringsQuestions{

//     static void rev(String str){
//         char arr[]=new char [str.length()];

//         for(int i=0;i<str.length();++i){
//             arr[i]=str.charAt(i);  

//         }

//         int right =str.length()-1;
//         int left=0;

//         while(left<right){
//             char temp=arr[left];
//             arr[left]=arr[right];
//             arr[right]=temp;

//             right--;
//             left++;
//         }






//         for(char a:arr){
//             System.out.println(a);
//         }
//     }

//     public static void main (String []args){

//         String str="abcd";
//         rev(str);





//     }
// }






// Reversing of array by method ( .toCharArray() )


// class StringsQuestions{

//     static void rev(String str){
        

//         char arr[]=str.toCharArray();

//         int right =str.length()-1;
//         int left=0;

//         while(left<right){
//             char temp=arr[left];
//             arr[left]=arr[right];
//             arr[right]=temp;

//             right--;
//             left++;
//         }

//         for(char a:arr){
//             System.out.println(a);
//         }
//     }

//     public static void main (String []args){

//         String str="abcd";
//         rev(str);
//     }
// }








class StringsQuestions{

    static boolean palindrome(String str){

        int left=0;
        int right =str.length()-1;
        

        while(left<right){
            if(str.charAt(right)!=str.charAt(left)){
                return false;
            }

        left++;
        right--;
            
        }

        

        return true;
    }

    public static void main (String []args){

        String str="naman";
        if(palindrome(str)){
            System.out.println("Yes its palindrome");
        }

        else{
            System.out.println("no its not palindrome");
        }
    }
}