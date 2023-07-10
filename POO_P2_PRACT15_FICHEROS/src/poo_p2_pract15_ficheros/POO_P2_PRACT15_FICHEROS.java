package poo_p2_pract15_ficheros;
/**
 *
 * @author ESPE
 */
public class POO_P2_PRACT15_FICHEROS {
    public static void main(String[] args) {
        FileManage fm = new FileManage();
        fm.crearArchivo("archivo\\file.txt");
        fm.writeArchivo("archivo\\file.txt", "Holaaa");
        fm.writeArchivo("archivo\\file.txt", "linea 2");
        fm.writeArchivo("archivo\\file.txt", "Linea 3");
        fm.writeArchivo("archivo\\file.txt", "Linea 4");
        fm.readArchivo("archivo\\file.txt");
        fm.deleteArchivo("archivo\\file.txt");
    }
}
