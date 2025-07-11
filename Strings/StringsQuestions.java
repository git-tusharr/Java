// Reversing an string



class StringsQuestions{

    static void rev(String str){
        char arr[]=new char [str.length()];

        for(int i=0;i<str.length();++i){
            arr[i]=str.charAt(i);  

        }

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




// class StringsQuestions{

//     static void reverse(String str){

//         char arr[]=new char[str.length()];        
//         for(int i=0;i<str.length();i++){
//             arr[i]=str.charAt(i);
//         }


//         int left=0;
//         int right =str.length()-1;

//         while(left<right){
//             char temp =arr[left];
//             arr[left]=arr[right];
//             arr[right]=temp;

//             right--;
//             left++;
//         }


//         for(char a:arr){
//             System.out.println(a);
//         }


//     }

//     public static void main(String []args){
//         String str="abcde";
//         reverse(str);

//     }
// }




// class StringsQuestions{

//     static void rev(String str){
//         char arr[]=new char [str.length()];

//         for(int i=0;i<str.length();++i){
//             arr[i]=str.charAt(i);  

//         }

//         int right =str.length()-1;
//         int left=0;

// for(int i=0;i<str.length()/2;i++){
//     char temp=arr[left];
//     arr[left]=arr[right];
//     arr[right]=temp;
    
//     left++;
//     right--;


//     }

//         for(char a:arr){
//             System.out.println(a);
//         }
//     }

//     public static void main (String []args){

//         String str="abcd";
//         rev(str);
//     }
// }


// class StringsQuestions{

//     static boolean palindrome(String str){

//         int left=0;
//         int right =str.length()-1;
        

//         while(left<right){
//             if(str.charAt(right)!=str.charAt(left)){
//                 return false;
//             }

//         left++;
//         right--;
            
//         }

        

//         return true;
//     }

//     public static void main (String []args){

//         String str="naman";
//         if(palindrome(str)){
//             System.out.println("Yes its palindrome");
//         }

//         else{
//             System.out.println("no its not palindrome");
//         }
//     }
// }







// 



//     public static void Convert(String str){

//     char[] arr=new char[str.length()];
//     for(int i=0;i<str.length();i++){

//          arr[i]=str.charAt(i);

//     }
//     for(int i=0;i<str.length();i++){
//         if(arr[i]>='A' && arr[i]<='Z'){
//             arr[i]=(char)(arr[i]+32);
//         }
//         else if(arr[i]>='a' && arr[i]<='z'){
//             arr[i]=(char)(arr[i]-32);
//         }
//     }

//     for (char c : arr) {
//             System.out.print(c);
//         }



//     }

//     public static void main(String []args){
//         String str="ABCD";
//         Convert(str);
//     }
// }






// Ques. convert uppercase to lowercase 

// class StringsQuestions{

    


// public class StringsQuestions{

//     public static void ToLowercase(String str){
//         char[] arr=new char[str.length()];

//         for(int i=0;i<str.length();i++){
//             arr[i]=str.charAt(i);
//         }

//         for(int i=0;i<str.length();i++){
//             if(arr[i]>='A' && arr[i]<='z'){
//                 arr[i]=(char)(arr[i]+32);
//             }
//         }
//             for (char c : arr) {
//             System.out.print(c);
//             }
         

//     }
//     public static void main(String []args){

//         String str="ABCD";
//         ToLowercase(str);

//     }
// }




// Ques- Converts lowercase to upper case


// public class StringsQuestions{

//     public static void ToLowercase(String str){
//         char[] arr=new char[str.length()];

//         for(int i=0;i<str.length();i++){
//             arr[i]=str.charAt(i);
//         }

//         for(int i=0;i<str.length();i++){
//             if(arr[i]>='A' && arr[i]<='z'){
//                 arr[i]=(char)(arr[i]-32);
//             }
//         }
//             for (char c : arr) {
//             System.out.print(c);
//             }
         

//     }




//     public static void main(String []args){

//         String str="abcd";
//         ToLowercase(str);

//     }
// }




// Ques - printing array values using comma seperator


// public class StringsQuestions{
//     public static void main(String [] args){
//         int arr[]=new int[]{1,2,3,4};


        
//     for(int k=0;k<arr.length;k++)
//          {
            


          
//             System.out.print(arr[k]);
            
            
        
//          }
//     }
// }




// Que - Subsequence


// public class StringsQuestions{
//     public static boolean Subsequence(String one,String two){
//         char arr1[]=one.toCharArray();
//         char arr2[]=two.toCharArray();

//         int j=0;

//         for(int i=0;i<arr1.length();i++){
//                 if(arr1[i]==arr2[j]){
//                     j++;

//                 }

//                      if(j==arr1.length){
//                      return true;
//                 }
//         }

   

//     }

//     public static void main(String []args){
//         String one="abcdef";
//         String two="abc";

//     if (Subsequence(one, two)) {
//             System.out.println(" is a subsequence");
//         } else {
//             System.out.println(" is NOT a subsequence");
//         }


//     }


// }


























