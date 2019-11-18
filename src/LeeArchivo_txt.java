

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



public class LeeArchivo_txt extends Template {
    
    public LeeArchivo_txt(){
        
    }

    String archivo = "C:\\Users\\alber\\Documents\\Template\\Alumnos_txt.txt";

    @Override
    public List<Alumno> obtener_lista() {
        Alumno alumnos;
        List<Alumno> lista = new ArrayList<>();
        try {
            String cadena;
            FileReader f = new FileReader(archivo);
            try (BufferedReader b = new BufferedReader(f)) {
                while ((cadena = b.readLine()) != null) {
                    String[] partes = cadena.split(",");
                    String nombre = partes[0];
                    String apellido1 = partes[1];
                    String apellido2 = partes[2];
                    String edad = partes[3];
                    String calificacion = partes[4];
                    alumnos = new Alumno(nombre, apellido1, apellido2, Integer.parseInt(edad), Integer.parseInt(calificacion));
                    lista.add(alumnos);
                }
            }

        } catch (IOException | NumberFormatException e) {
        }

        return lista;
    }

}
