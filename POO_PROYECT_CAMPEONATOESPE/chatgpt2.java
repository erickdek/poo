// Clase Campeonato
public class Campeonato {
  
    // Variables del campeonato
    private int numeroEquipos;
    private int costoInscripcion;
  
    // Constructor vacío
    public Campeonato(){
  
    }
  
    // Método para crear un nuevo equipo
    public void crearEquipo(int deporte){
        switch(deporte){
            case 1: // Futbol masculino
                numeroEquipos = 8;
                costoInscripcion = 80;
                break;
            case 2: // Futbol femenino
                numeroEquipos = 4;
                costoInscripcion = 80;
                break;
            case 3: // Basquetball masculino
                numeroEquipos = 4;
                costoInscripcion = 50;
                break;
            case 4: // Basquetball femenino
                numeroEquipos = 4;
                costoInscripcion = 50;
                break;
            case 5: // Voley masculino
                numeroEquipos = 4;
                costoInscripcion = 50;
                break;
        }
    }
  
    // Método para agregar un estudiante al equipo
    public void agregarEstudiante(int id, int numInscripcion, String nombres, String apellidos, int semestre){
        try{
            // Validar si el número de grupos inscritos es menor al limite establecido
            if(numeroEquipos < 8){
                // Crear un objeto Estudiante con los datos recibidos
                Estudiante estudiante = new Estudiante(id, numInscripcion, nombres, apellidos, semestre);
  
                // Agregar el estudiante al arreglo de estudiantes del equipo 
            } else {
                // Mostar un mensaje de error si se ha alcanzado el límite de grupos
                System.out.println("No se pueden agregar más equipos, limite alcanzado");
            }
        } catch (Exception e){
            // Mostrar un mensaje de error si hay un problema al agregar un estudiante
            System.out.println("Ha ocurrido un error al intentar agregar un estudiante al equipo");
        }
    }
  
    // Método para mostrar el equipo con sus integrantes
    public void mostrarEquipo(){
        // Recorrer el arreglo de los estudiantes
        for(int i=0; i<numeroEquipos; i++){
            // Mostrar los datos del estudiante 
            Estudiante estudiante = //Obtener datos del estudiante
            System.out.println("Número del estudiante: " + estudiante.getNumero() + ", ID: " + estudiante.getId() + ", Nombres y apellidos: " + estudiante.getNombres() + " " + estudiante.getApellidos() + ", Semestre: " + estudiante.getSemestre());
        }
    }
  
    // Método para buscar un estudiante
    public void buscarEstudiante(int llave){
        try{
            // Recorrer el arreglo de los estudiantes
            for(int i=0; i<numeroEquipos; i++){
                // Obtener los datos del estudiante en la posicion i
                Estudiante estudiante = //Obtener datos del estudiante
                // Validar si el ID o la cédula del estudiante es igual a la llave
                if(estudiante.getId() == llave || estudiante.getCedula() == llave){
                    // Mostrar los datos del estudiante 
                    System.out.println("Número del estudiante: " + estudiante.getNumero() + ", ID: " + estudiante.getId() + ", Nombres y apellidos: " + estudiante.getNombres() + " " + estudiante.getApellido() + ", Semestre: " + estudiante.getSemestre());
                    break;
                }
            }
        } catch(Exception e){
            // Mostrar un mensaje de error si hay un problema al buscar un estudiante
            System.out.println("No se ha encontrado el estudiante");
        }
    }
  
    // Método para eliminar un equipo
    public void eliminarEquipo(int id, boolean eliminarEstudiantes){
        // Recorrer el arreglo de los estudiantes del equipo
        for(int i=0; i<numeroEquipos; i++){
            // Validar si el ID del estudiante coincide con la llave recibida
            Estudiante estudiante = //Obtener datos del estudiante
            if(estudiante.getId() == id){
                // Eliminar el equipo del arreglo de equipos
                if(eliminarEstudiantes){
                    // Eliminar todos los estudiantes del equipo
                }
            }
        }
    }
  
    // Método para la creación del menú
    public void menu(){
        while(true){
            System.out.println("MENU");
            System.out.println("1. Crear un equipo");
            System.out.println("2. Agregar estudiante");
            System.out.println("3. Mostrar estudiantes");
            System.out.println("4. Buscar un equipo");
            System.out.println("5. Buscar un estudiante");
            System.out.println("6. Eliminar un equipo");
            System.out.println("7. Salir");
            System.out.println("Seleccione la opción deseada:");
            Scanner scanner = new Scanner(System.in);
            int opc = scanner.nextInt();
  
            switch (opc){
                case 1: // Crear un equipo
                    System.out.println("Seleccione el deporte del equipo");
                    System.out.println("1. Futbol masculino");
                    System.out.println("2. Futbol femenino");
                    System.out.println("3. Basquet masculino");
                    System.out.println("4. Basquet femenino");
                    System.out.println("5. Voley masculino");
                    int opcDeporte = scanner.nextInt();
                    crearEquipo(opcDeporte);
                    break;
                case 2: // Agregar estudiante
                    System.out.println("Ingrese el ID del estudiante: ");
                    int id = scanner.nextInt();
                    System.out.println("Ingrese el numero de inscripción del estudiante: ");
                    int numInscripcion = scanner.nextInt();
                    System.out.println("Ingrese los nombres del estudiante:");
                    String nom = scanner.nextLine();
                    System.out.println("Ingrese los apellidos del estudiante:");
                    String ape = scanner.nextLine();
                    System.out.println("Ingrese el semestre del estudiante: ");
                    int sem = scanner.nextInt();
                    agregarEstudiante(id, numInscripcion, nom, ape, sem);
                    break;
                case 3: // Mostrar estudiantes
                    mostrarEquipo();
                    break;
                case 4: // Buscar un equipo
                    System.out.println("Ingrese el máximo de integrantes del equipo: ");
                    int intMax = scanner.nextInt();
                    // Buscar el equipo en el arreglo de equipos y mostrar los datos
                    break;
                case 5: // Buscar un estudiante
                    System.out.println("Ingrese el ID o la cédula del estudiante:");
                    int llave = scanner.nextInt();
                    buscarEstudiante(llave);
                    break;
                case 6: // Eliminar un equipo
                    System.out.println("Ingrese el ID del equipo: ");
                    int idEliminar = scanner.nextInt();
                    System.out.println("¿Desea eliminar los estudiantes del equipo? (y/n)");
                    String opcEliminar = scanner.nextLine();
                    boolean eliminarEstudiantes = false;
                    if(opcEliminar.equals("y")){
                        eliminarEstudiantes = true;
                    }
                    eliminarEquipo(idEliminar, eliminarEstudiantes);
                    break;
                case 7: // Salir
                    return;
            }
        }
    }
  
    // Método main
    public static void main(String[] args) {
        Campeonato campeonato = new Campeonato();
        campeonato.menu();
    }
  
}