
// SUBSEQUENCE




public class Subsequence{
    public static boolean SubsequenceFinder(String str1,String str2){

        int i=0;
        int j=0;

        while(i<str1.length() && j<str2.length()){
           
            if(str1.charAt(i)==str2.charAt(j)){
                j++;
            }

            i++;
        }
            return j==str2.length();
    }

    public static void main(String []args){
        String str1="abcdef";
        String str2="abc";

    if (SubsequenceFinder(str1, str2)) {
            System.out.println(" is a Subsequence");
        } else {
            System.out.println(" is NOT a Subsequence");
        }
    }
}