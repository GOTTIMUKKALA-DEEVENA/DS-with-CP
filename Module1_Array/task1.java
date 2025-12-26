public class ArrayInitializationDemo {
    public static void main(String[] args) {

        int[] numbers = {3};
        String[] names = {};
        final int[] numFinal = new int[] {3}; 


        int[] numDynamic = new int[10]; 
        for (int i = 0; i < numDynamic.length; i++) {
            numDynamic[i] = i * 2; 
        }

        String[] dynamicNames;
        dynamicNames = new String[5]; 
        dynamicNames[0] = "Dhanu";
        dynamicNames[1] = "Ajay";
        dynamicNames[2] = "Charan";
        dynamicNames[3] = "Deevena";
        dynamicNames[4] = "Sanju";

        System.out.println("Static int array: " + numbers[0]);
        System.out.println("Final int array: " + numFinal[0]);
        System.out.print("Dynamic int array: ");
        for (int val : numDynamic) {
            System.out.print(val + " ");
        }
        System.out.println("\nDynamic string array:");
        for (String name : dynamicNames) {
            System.out.println(name);
        }
    }
}
