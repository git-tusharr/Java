class One{

int a;

void set(int a){
    this.a=a;
}

void get(){
    System.out.println(a);
}

public static void main(String srgs[]){
    One obj=new One();
    obj.set(10);
    obj.get();
}

}