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



// class StringsQuestions{
    
    

// static boolean palindrome(String str){
    
//     int left=0;
//     int right=str.length()-1;
    
//     while(left<right){
//         if(str.charAt(left)!=str.charAt(right)){
//             return false;
//         }
//         left++;
//         right--;
//     }
//     return true;
// }

//     public static void main(String []args){
//         String str="ABCBa";

//         if(palindrome(str)){
//             System.out.println("it is a palindrome");
//         }
//         else{
//             System.out.println("it is not a palindrome");
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








