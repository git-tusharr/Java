// PALINDROME


class StringsPalindrome{
static boolean palindrome(String str){
    
    int left=0;
    int right=str.length()-1;
    
    while(left<right){
        if(str.charAt(left)!=str.charAt(right)){
            return false;
        }
        left++;
        right--;
    }
    return true;
}

    public static void main(String []args){
        String str="ABCBa";

        if(palindrome(str)){
            System.out.println("it is a palindrome");
        }
        else{
            System.out.println("it is not a palindrome");
        }
    }
}
