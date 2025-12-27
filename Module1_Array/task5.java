class Main {
    
    static int AddTwo(int a, int b){
        int c = a+b;
        return c;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int result = AddTwo(a,b);
        
        
        System.out.println("Sum = " + result);
    }
}
