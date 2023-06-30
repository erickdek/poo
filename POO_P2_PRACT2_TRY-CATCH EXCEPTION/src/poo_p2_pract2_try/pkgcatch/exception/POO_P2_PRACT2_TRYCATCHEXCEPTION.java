package poo_p2_pract2_try.pkgcatch.exception;

public class POO_P2_PRACT2_TRYCATCHEXCEPTION {

    public static void main(String[] args) {
        int numero[] = new int[5];
        try {
            String str = null;
            numero[7] = 0;
            //System.out.println(str.length());  // Lança NullPointerException
        } catch (ArrayIndexOutOfBoundsException error) {
            System.out.println("Errooooor: ArrayIndexOutOfBoundsException");
        } catch (Exception error) {
            System.out.println("Errooooor: Exception geral");
        }
    }
    
}
