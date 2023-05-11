//CONDICIONALES
package poo_p1_pract6_condicionales;
public class POO_P1_PRACT6_CONDICIONALES {
    public static void main(String[] args) {
        int hora = 30;
        if ((hora >= 0 ) && (hora <= 12)){
            System.out.println("Buenos dias");
        } else if ((hora > 12) && (hora <= 18)){
            System.out.println("Buenas Tardes");
        } else if (hora <= 24){
            System.out.println("Buenas Noches");
        } else {
            System.out.println("Tienes una hora incorrecta...");
        }
    }
    
}
