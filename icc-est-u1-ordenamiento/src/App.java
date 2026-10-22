public class App {
    public static void main(String[] args) throws Exception {
        int[]original={5,3,4,1,2,6};
        int[]b=original.clone();
        int[]c= original;
        int[]d=original.clone();

        // USAR EL METODO DEL ARCHIVO(CLASE)BUBBLE
        //INSTANCIAR el archivo BUBBLE
        //INSTANCIA la clase Bubble
        Bubble bubble=new Bubble();  
        System.out.println();
        printArreglo(b);
        bubble.sort(b);
        printArreglo(b);


        //Instanciar seleccion
        System.out.println("Selection");
        Selection selection = new Selection();
        printArreglo(c);
        selection.sort(c);
        printArreglo(c);

        //Instanciar Insertion
        ///
        System.out.println("\n\n--- Insertion Sort ---");
        Insertion insertion = new Insertion();
        System.out.println("\n\n--- Insertion Sort ---");
        printArreglo(d, "Original");
        insertion.sort(d);
        printArreglo(d, "Ordenado Asc");


    }
    public static void printArreglo(int[] arr) {
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]+" - ");
        System.out.println();



        
    }    
     public static void printArreglo(int[] arr, String title) {
        System.out.println(title);
        for (int i=0; i < arr.length; i++)
            System.out.println(arr[i] + " - ");
        System.out.println();


    }
    }
