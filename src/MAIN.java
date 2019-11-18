
public class MAIN {
    
    public static void main(String args[]) {
        
        System.out.println("    --- Ordenando archivo txt ---   ");
        LeeArchivo_txt txt = new LeeArchivo_txt();
        txt.run();
        
        System.out.println("    --- Ordenando archivo excel ---   ");
        LeeExcel excel = new LeeExcel();
        excel.run();
        
    }
}
