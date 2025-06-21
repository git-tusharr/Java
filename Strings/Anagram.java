
class Anagram
{
public static boolean anagram(String str1,String str2)
{

if(str1.length()!=str2.length()) return false;

int count[]=new int[26];  

for(int i=0;i<str2.length();++i)
{
    count[str1.charAt(i)-'a']++; 
     count[str2.charAt(i)-'a']--;  

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