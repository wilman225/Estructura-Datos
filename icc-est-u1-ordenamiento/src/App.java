import java.util.Comparator;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        // runEjemplosPrimitivos();

        runEjemplosObjetos();



    }
    public static void printArreglo(Estudiante[] arr, String title) {
        System.out.println(title);
        for (int i=0; i < arr.length; i++)
            System.out.println(arr[i] + " - ");
        System.out.println();
    }

    private static void runComparaciones(){
        Integer[] original = { 5, 6, 4, 1, 2, 3 };
        Arrays.sort(original);
        for (int i=0; i < original.length; i++){
            System.out.println(original[i]);
        }
        Arrays.sort(original, Comparator.reverseOrder());
    }

    
    private static void runEjemplosObjetos() {
        Estudiante e1 = new Estudiante("Juan", 8.5);

        Estudiante[] estudiantes = { e1,
                new Estudiante(" Maria", 7.0),
                new Estudiante(" Pedro", 6.5),
                new Estudiante(" Diego", 9.0),


        };

        Bubble bubble = new Bubble();
        printArreglo(estudiantes, "Arreglo de estudiantes antes de ordenar");
        bubble.sortEstudiantes(estudiantes);
        printArreglo(estudiantes, "Arreglo de estudiantes despues de ordenar");


    }
    


    

    public static void runEjemplosPrimitivos() {
        
        throw new UnsupportedOperationException("Unimplemented method 'runEjemplosPrimitivos'");
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
