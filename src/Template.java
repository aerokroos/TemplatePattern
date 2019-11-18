
import java.util.List;

public abstract class Template {

    public final void run() {
        List<Alumno> lista = this.obtener_lista();
        BubbleSort(lista);
        despliega_lista(lista);

    }

    private static void despliega_lista(List<Alumno> lista) {
        lista.forEach((alumno) -> {
            System.out.println(alumno.Nombre + ", " + alumno.Apellido1 + ", " + alumno.Apellido2
                    + ", " + alumno.edad + ", " + alumno.calificaion);
        });
    }

    public abstract List<Alumno> obtener_lista();
    
    //public abstract void BubbleSort(List<Alumno> lista);

    public static void BubbleSort(List<Alumno> lista) {
        String nombre, ap1, ap2;
        int e, c;
        for (int j = 0; j < lista.size(); j++) {
            for (int i = j + 1; i < lista.size(); i++) {
                if (lista.get(i).Apellido2.compareTo(lista.get(j).Apellido2) < 0) {
                    
                      Alumno temp = lista.get(j);
                      lista.set(j,lista.get(i));
                      lista.set(i, temp);
       
                }
            }
        }

    }

}
