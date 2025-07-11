class StringReverse{
    static void rev(String str){
        char arr[]=new char[str.length()];

        for(int i=0;i<str.length();++i){
            arr[i]=str.charAt(i);
        }

        int left=0;
        int right=str.length()-1;

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