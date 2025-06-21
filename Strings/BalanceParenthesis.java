//   BALANCE PARENTHESIS


public class BalanceParenthesis{

    static boolean balanceParenthesis(String str){
        int i=0;
        int curly=0;
        int square=0;
        int circle=0;

        while(i<str.length()){
            char ch=str.charAt(i);

            if( ch=='[') square++;
            else if( ch==']') square--;

            else if( ch=='(') circle++;
            else if( ch==')') circle--;

            else if( ch=='{') curly++;
            else if( ch=='}') curly--;

            i++;
        }
        return curly==0 && square==0 && circle==0;
    }


    public static void main (String[] args){

        String str="[{()}]";


    if (balanceParenthesis(str)) {
        System.out.println(" is a Balance Parenthesis");
    } 
    else {
         System.out.println(" is NOT a Balance Parenthesis");
         }


    }
}
