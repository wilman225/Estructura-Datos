


//Una clase Estudiante 
//con 2 atributos 
//con construcotr lleno
//con getter y setters 
public class Estudiante {
    private String nombre;
    private Double nota;


    //Constructor lleno

    public Estudiante(String nombre, Double nota){
        this.nombre=nombre;
        this.nota=nota;
    }

    //Constructor vacio
    public Estudiante(){

    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public Double getNota() {
        return nota;
    }


    public void setNota(Double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Estudiante [nombre=" + nombre + ", nota=" + nota + "]";
    }

    
    
}
