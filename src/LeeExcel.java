
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LeeExcel extends Template {
    
    public LeeExcel (){
        
    }
    
    public final String archivo = "C:\\Users\\alber\\Documents\\Template\\AlumnosExcel.xlsx";

    @Override
    public List<Alumno> obtener_lista() {
        List<Alumno> lista = new ArrayList<>();
        String nombre = "", apellido1 = "", apellido2 = "";
        int edad = 0, calificacion = 0;
        try {
            FileInputStream file = new FileInputStream(new File(archivo));
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            XSSFSheet sheet = workbook.getSheetAt(0);
            Iterator<Row> rowIterator = sheet.iterator();
            Row row;
            // se recorre cada fila hasta el final
            while (rowIterator.hasNext()) {
                row = rowIterator.next();
                //System.out.println(row);
                //se obtiene las celdas por fila
                Iterator<Cell> cellIterator = row.cellIterator();
                Cell cell;
                int contador = 0;
                //se recorre cada celda
                while (cellIterator.hasNext()) {
                    // se obtiene la celda en específico y se la imprime
                    cell = cellIterator.next();
                    nombre = cell.toString();
                    cell = cellIterator.next();
                    apellido1 = cell.toString();
                    cell = cellIterator.next();
                    apellido2 = cell.toString();
                    cell = cellIterator.next();
                    edad = (int) cell.getNumericCellValue();
                    cell = cellIterator.next();
                    calificacion = (int) cell.getNumericCellValue();
                    lista.add(new Alumno(nombre, apellido1, apellido2, edad, calificacion));
                }
                //System.out.println();
            }
        } catch (FileNotFoundException e) {
            Logger.getLogger(LeeExcel.class.getName()).log(Level.SEVERE, null, e);
        } catch (IOException ex) {
            Logger.getLogger(LeeExcel.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;
    }

}
