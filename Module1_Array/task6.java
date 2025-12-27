class Student{
    String name;
    int age;
    public Student(String a , int b){
        this.name=a;
        this.age=b;
    }
}

class Main {
    public static void main(String[] args) {
        Student a=new Student("Dhanu",19);
            System.out.println(a);
                System.out.println(a.name);
                    System.out.println(a.age);
        
    }
    }
