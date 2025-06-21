// // Strings :-

// -> Array of characters
    
//     char ch[]={'t','u','s','h','a','r'}
//     string 

// -> constructors,functions(append,firstindex etc)
// -> Strings are immutable beacause changing one values in scp is will change all values sharing that value

class One
{
public static boolean anagram(String str1="abcde",String str2="ebcd")
{

if(str1.length()!=str2.length()) return false;

int count[]=new int[26];  

for(int i=0;i<str2.length();++i)
{
    count[str1.charAt(i)-'a']++;  count[1]1
     count[str2.charAt(i)-'a']--;  count[1]-1 

}

for(int i=0;i<26;++i)
{
    if(count[i]!=0) return false;
}

return true;
}



public static void main(String args[])
{

String str="abcde";
String str2="ebcd";

if(anagram(str,str2))
{
    System.out.print("yes");
}
else
{
    System.out.print("no");
}
}

}

1 0 0 0 -1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 