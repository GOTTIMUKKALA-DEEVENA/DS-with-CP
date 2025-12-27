class Student{
    String name;
    int age;
    
    void getName(){
        System.out.println(name);
    }
    
    void getAge(){
        System.out.println(age);
    }
}

class Main {
    public static void main(String[] args){
        Student a = new Student();
        a.name = "Deevena";
        a.age = 19;
        System.out.println(a.name);
        System.out.println(a.age);
        a.getName();
        a.getAge();
    }
}
