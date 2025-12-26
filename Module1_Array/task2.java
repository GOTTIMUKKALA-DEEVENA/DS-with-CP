class Main {
    public static void main(String[] args) {

        // from task1 last step dynamic allocatoion
        int[] n=new int[20];
        int cz=0;// current size we manually mainain for the dynamic feel
        System.out.println("capacity of array "+ n.length);

        System.out.println(" after allocation all val are by default zeros  ");

        System.out.println("current size is "+ cz);
        for(int i=0;i<n.length;i++){
            System.out.println(i+" index val is "+n[i]);
        }

        n[0]=100;
        cz=cz+1;
        n[1]=200;
        cz=cz+1;
        n[2]=300;
        cz=cz+1;

        System.out.println("current size is "+ cz);

        // step-1 or oparation -1 is append  just value

        // append the with 400
        int apVal = 400;

        if(cz==n.length){
            System.out.println("array is full con't perform append ");
        }
        else{

            n[cz]=apVal;
            cz++;
        }

        System.out.println("________after append oparation ______ ");


        System.out.println("current size is "+ cz);

        for(int i=0;i<n.length;i++){
            System.out.println(i+" index val is "+n[i]);
        }

        n[4]=500;
        cz=cz+1;

        n[5]=600;
        cz=cz+1;

        //  step-2  pop oparation
        if(cz==0){
            System.out.println("array is empty con't perform pop ");
        }else{

        n[cz-1]=0;
        cz--;
        }

        System.out.println("________after pop oparation ______ ");


        System.out.println("current size is "+ cz);

        for(int i=0;i<n.length;i++){
            System.out.println(i+" index val is "+n[i]);
        }


        // for insertion oparation we need both index and value
        int insIdx=3;
        int insVal=1000;

        if (insIdx >=0 && insIdx< cz){

        for(int i= cz; i>insIdx; i--){
            n[i]=n[i-1];
        }
        n[insIdx]=insVal;
        cz++;

        }
        else{
            System.out.println("invalid index");
        }

         System.out.println("________after insertion oparation ______ ");


        System.out.println("current size is "+ cz);

        for(int i=0;i<n.length;i++){
            System.out.println(i+" index val is "+n[i]);
        }

        // step -4 deletion oparation

        // we required index where we are deleting

        int idxToDel =3;

        if ( idxToDel >=0 && idxToDel < cz){

        for(int i= idxToDel ; i< cz-1;i++){
            n[i]=n[i+1];
        }

        // manually change it last index to zero
        n[cz-1]=0;
        cz--;
        }

        System.out.println("________after Deletion oparation ______ ");

        System.out.println("current size is "+ cz);

        for(int i=0;i<n.length;i++){
            System.out.println(i+" index val is "+n[i]);
        }
    }
}
