// inheritance


class Inhertance{
    public int a;
    public String b;
}

class Inhertance2 extends Inhertance{

    class Inhertance3 extends Inhertance2{
        public static void main(String arr[]){
            Inhertance3 obj=new Inhertance3();
            obj.a=10;
            obj.b="String";
            System.out.println(obj.a+" "+obj.b);

        }

    }
}
