public class App {
    public static void main(String[] args) {
        Gestor gestor = new Gestor();
        MenuHelper menuHelper = new MenuHelper();

        int opcion;
        do {
            menuHelper.mostrarMenuPrincipal();
            opcion = menuHelper.leerOpcion();
            menuHelper.limpiarBuffer();

            switch (opcion) {
                case 1:
                    gestor.crearEquipo();
                    break;
                case 2:
                    gestor.agregarEstudiante();
                    break;
                case 3:
                    gestor.mostrarEstudiantes();
                    break;
                case 4:
                    gestor.mostrarEquipos();
                    break;
                case 5:
                    gestor.buscarEquipo();
                    break;
                case 6:
                    gestor.buscarEstudiante();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
            System.out.println();
        } while (opcion != 0);
    }
}