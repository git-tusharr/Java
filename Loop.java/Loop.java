public class Loop
{
    public static void main(String[] args) 
    {


            //HCF

        // int sn=5;
        // int ln=105;
        // int hcf=0;
        // for(int i=1;i<=sn;++i)
        // {
        //     if(sn%1==0 && ln%i==0)
        //     {
        //        hcf=i;

        //     }
            

        // }
        //   System.out.println(hcf);



        //LCM

        // int sn=5;
        // int ln=32;
        // int lcm=0;
        // for(int i=ln; ;i=i+ln)
        // {
        //     if(i%ln==0 && i%sn==0)
        //     {
        //         lcm=i;
        //         break;
        //     }

        // }
        // System.out.println(lcm);



        // Power and numbers

        // int number=2;
        // int power=3;
        // int ans=1;

        // for(int i=1;i<=power;i++)
        // {
        //     ans=ans*number;
        // }
        // System.out.println(ans);





        // perfect number - jiske factors ka sum uske hi equal ho

        int number=6;
        int sum=0;
        for(int i=1;i<number;i++)
        {
        if(number%1==0)
        
        { 
            sum=sum+i;
        }
        
        
        }
        if(sum==6)
        {
            System.out.println("perfect");
        }

    }

}

