class S {
    int a;
    String b;
    float c;

    int sumOfTwo(int a, int b) {
        int c = a + b;
        return c;
    }

    public static void main(String[] args) {
        S obj = new S();               // create object
        int result = obj.sumOfTwo(2, 9); // call method
        System.out.println(result);    // output
    }
}
