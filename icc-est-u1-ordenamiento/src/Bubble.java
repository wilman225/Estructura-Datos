public class Bubble {
    
    public int[] sort (int[] arreglo){
        int comparaciones=0;
        for(int i=0;i<arreglo.length;i++){
            System.out.println("Pasada: " +i);
            boolean combinaciones = false;
   
            for (int j=1; j<arreglo.length-i; j++){
                comparaciones++;

                
                if (arreglo[j-1]> arreglo[j]){

                    combinaciones = true;
                    
                    
                    int aux = arreglo[j-1];
                    arreglo[j-1]= arreglo[j];
                    arreglo[j]=  aux;

                }
            }
            if (!combinaciones){
                break;
                
            }
        }
        System.out.println("Comparaciones: " +comparaciones);
        return null;

    }
    
    
}
