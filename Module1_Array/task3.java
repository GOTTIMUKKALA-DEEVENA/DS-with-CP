class Student{
    String name;
    int age;
    
    Student(String name, int age){
        this.name = name;
        this.age = age;
        
    }
}

class Main {
    public static void main(String[] args){
       Student b = new Student("Uday Karthik",18);
       System.out.println(b.name);
       System.out.println(b.age);
    }
}
