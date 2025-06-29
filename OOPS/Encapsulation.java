
// Encapsulation



class Encapsulation{
    int a;
    String b;



    void bind(int a ,String b){
        this.a=a;
        this.b=b;
    }



    void display(){
        System.out.println(a+" "+b);
    }



    public static void main(String arr[]){
        Encapsulation obj=new Encapsulation();
        obj.bind(10," mahesh");
        obj.display();
    }
}
