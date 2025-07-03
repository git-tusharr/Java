// Inheritance Example

class Inheritance {
    public int a;
    public String b;
}

class Inheritance2 extends Inheritance {
}

class Inheritance3 extends Inheritance2 {
    public static void main(String[] args) {
        Inheritance3 obj = new Inheritance3();
        obj.a = 10;
        obj.b = "String";
        System.out.println(obj.a + " " + obj.b);
    }
}