public class GeneradorNombre {
    public static void main(String[] args) {
        String nombreReal="Montserrat González Carretero";

        System.out.println("! Has clonado el repositorio correctamente!");
        System.out.println("Tu misión: Debes ejecutar el programa con tu nombre y apellidos");

        String[] sustantivos={"Rayo", "Eclipse", "Gigante", "Trueno", "Científico"};
        String[] adjetivos={"Veloz","Oscuro","Atómico","Elástico","Invencible"};

        int indiceAdj = (nombreReal.length() -1) % adjetivos.length;
        int indiceSustantivo= (nombreReal.length()-1) % sustantivos.length;

        String nuevoNombre=  sustantivos[indiceSustantivo] + " " + adjetivos[indiceAdj] ;
        System.out.println(nombreReal + " tienes un nuevo nombre superhumano: " + nuevoNombre);

    }
}
