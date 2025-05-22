public class Pattern {
    public static void main(String[] args)
    {
            // right angle triangle


               for(int r=1;r<=5;++r)
               {
                for(int c=1;c<=5;++c)
                {
                    if(c<=r)
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print("  ");
                    }
                }
                System.out.println();
               }


            // // Inverted left angle triangle
                
                
            //   for(int r=1;r<=5;++r)
            //    {
            //     for(int c=1;c<=5;++c)
            //     {
            //         if(c>=r)
            //         {
            //             System.out.print("*");
            //         }
            //         else
            //         {
            //             System.out.print(" ");
            //         }
            //     }
            //     System.out.println();
            //    }

            // // left angle triangle

            //   for(int r=1;r<=5;++r)
            //    {
            //     for(int c=1;c<=5;++c)
            //     {
            //         if(c>=6-r)
            //         {
            //             System.out.print("*");
            //         }
            //         else
            //         {
            //             System.out.print(" ");
            //         }
            //     }
            //     System.out.println();
            //    }


            // inverted right angle triangle

            //    for(int r=1;r<=5;++r)
            //     {
            //         for(int c=1;c<=5;++c)
            //         {
            //             if(c<=6-r)
            //             {
            //                 System.out.print("*");
            //             }
            //             else
            //             {
            //                 System.out.print(" ");
            //             }
            //         }
            //         System.out.println();

            //     }


            for(int r=1;r<=3;r++)
    {
        for(int c=1;c<=r;c++)

        {
            System.out.print("*");
        }
        System.out.println();


    }    






















    }
}
