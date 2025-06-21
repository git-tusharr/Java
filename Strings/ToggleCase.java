// TOGGLE CASE

public class ToggleCase{

    
    public static void Convert(String str){

    char[] arr=new char[str.length()];
    for(int i=0;i<str.length();i++){

         arr[i]=str.charAt(i);

    }
    for(int i=0;i<str.length();i++){
        if(arr[i]>='A' && arr[i]<='Z'){
            arr[i]=(char)(arr[i]+32);
        }
        else if(arr[i]>='a' && arr[i]<='z'){
            arr[i]=(char)(arr[i]-32);
        }
    }

    for (char c : arr) {
            System.out.print(c);
        }
    }

    public static void main(String []args){
        String str="ABCD";
        Convert(str);
    }


}