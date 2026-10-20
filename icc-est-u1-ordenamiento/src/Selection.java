public class Selection {
    public void sort(int[] arreglo){
        for (int i=0; i<arreglo.length-1;i++) {
            int minimo=i;
            
            for (int j=i+1; j<arreglo.length; j++){
                if (arreglo[j]<arreglo[minimo]){
                    minimo=j;
                }
            }

                    if (minimo != i){
                        int aux=arreglo[i];
                        arreglo[i]=arreglo[minimo];
                        arreglo[minimo]=aux;


                    }

            }

        }

    }

