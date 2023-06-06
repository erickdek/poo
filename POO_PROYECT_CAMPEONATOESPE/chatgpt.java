import java.util.Scanner; 
public class Campeonato {
    // Arraylist para guardar los grupos
    private static ArrayList<Grupo> grupos = new ArrayList<Grupo>(); 

    public static void main(String[] args) { 
        int opcion;
        Scanner sc = new Scanner(System.in);
        // Imprimimos el menu con las opciones
        System.out.println("Bienvenido al campeonato!\n Por favor escoja una de las siguientes opciones: \n");
        System.out.println("1. Crear un equipo"); 
        System.out.println("2. Agregar estudiante"); 
        System.out.println("3. Mostrar estudiantes y el equipo al que pertenecen"); 
        System.out.println("4. Buscar un equipo (cantidad de integrantes y su maximo) y mostrar con sus integrantes"); 
        System.out.println("5.Buscar un estudiante con el ID o su cedula "); 
        System.out.println("6. Eliminar un equipo");
        System.out.print("Opcion: "); 
        opcion = sc.nextInt(); 

//Evaluamos la opcion introduccida para ver que accion tomar
        switch(opcion) { 
            // En caso de seleccionar 1, se creara un grupo
            case 1:
            	crearGrupo(grupos);
            	break;
            // En caso de seleccionar 2, se agregara un estudiante al grupo
			case 2:
				agregarEstudiante(grupos);
				break;
            // En caso de se seleccionar 3, se mostrara los estudiantes y el grupo al que pertenecen
            case 3:
                mostrarEstudiantesYGrupo(grupos);
                break;
            // En caso de seleccionar 4, se mostrara la cantidad de integrantes y su maximo de un equipo al que busque
            case 4:
            	buscarEquipo(grupos);
            	break;
            // En caso de seleccionar 5, se podrá buscar el estudiante con su ID o su cedula
            case 5:
            	buscarEstudiante(grupos);
            	break;
            // En caso de seleccionar 6, se eliminara el equipo con sus estudiantes
            case 6: 
            	eliminarEquipo(grupos);
            	break;
        }

	} 

    // Metodo para crear una nuevo grupo
    private static void crearGrupo(ArrayList<Grupo> grupos) {
        Scanner sc = new Scanner(System.in);
        // Submenu para crear un grupo
        System.out.println("Por favor escoja una de las siguientes opciones para crear un equipo: ");
        System.out.println("1. Futbol masculino"); 
        System.out.println("2. Futbol femenino"); 
        System.out.println("3. Basquet masculino"); 
        System.out.println("4. Basquet femenino"); 
        System.out.println("5. Voley masculino");
        System.out.print("Opcion: "); 
        int opcion = sc.nextInt(); 
		
		try {
            // Obtenemos los valores para crear el nuevo grupo
            System.out.print("Ingrese el ID del grupo: "); 
            String idGrupo = sc.next(); 
            switch(opcion) {
                case 1: 
                    System.out.print("Ingrese el costo del equipo de futbol masculino (80USD): "); 
                    double costo = sc.nextDouble(); 
                    System.out.print("Ingrese el numero maximo de integrantes (8 - 16): "); 
                    int MaxIntegrantes = sc.nextInt(); 
                    // Creamos el nuevo grupo
                    ListaFutbolMasculino nuevoGrupo = new ListaFutbolMasculino(idGrupo, costo, MaxIntegrantes);
                    grupos.add(nuevoGrupo); 
                    break;
                case 2: 
                    System.out.print("Ingrese el costo del equipo de futbol femenino (80USD): "); 
                    costo = sc.nextDouble(); 
                    System.out.print("Ingrese el numero maximo de integrantes (8 - 16): "); 
                    MaxIntegrantes = sc.nextInt(); 
                    // Creamos el nuevo grupo
                    ListaFutbolFemenino nuevoGrupo = new ListaFutbolFemenino(idGrupo, costo, MaxIntegrantes); 
                    grupos.add(nuevoGrupo); 
                    break;
                case 3: 
                    System.out.print("Ingrese el costo del equipo de basket masculino (50USD): "); 
                    costo = sc.nextDouble(); 
                    System.out.print("Ingrese el numero maximo de integrantes (7 - 10): "); 
                    MaxIntegrantes = sc.nextInt(); 
                    // Creamos el nuevo grupo
                    ListaBasKetMasculino nuevoGrupo = new ListaBasKetMasculino(idGrupo, costo, MaxIntegrantes); 
                    grupos.add(nuevoGrupo); 
                    break;
                case 4: 
                    System.out.print("Ingrese el costo del equipo de basquet femenino (50USD): "); 
                    costo = sc.nextDouble(); 
                    System.out.print("Ingrese el numero maximo de integrantes (7 - 10): "); 
                    MaxIntegrantes = sc.nextInt(); 
                    // Creamos el nuevo grupo
                    ListaBasKetFemenino nuevoGrupo = new ListaBasKetFemenino(idGrupo, costo, MaxIntegrantes);
                    grupos.add(nuevoGrupo); 
                    break;
                case 5: 
                    System.out.print("Ingrese el costo del equipo de voley masculino (50USD): "); 
                    costo = sc.nextDouble(); 
                    System.out.print("Ingrese el numero maximo de integrantes (4 - 6): "); 
                    MaxIntegrantes = sc.nextInt(); 
                    // Creamos el nuevo grupo
                    ListaVoleyMasculino nuevoGrupo = new ListaVoleyMasculino(idGrupo, costo, MaxIntegrantes);
                    grupos.add(nuevoGrupo); 
                    break;
            }
            System.out.println("Grupo creado!");
		}
		// En casos de no ingresar los datos correctos se marcara el error
		catch (Error e){
			 System.out.println("Error! Por favor ingrese los datos correctamene.");
		}
    }
 
    // Metodo para agregar un estudiante
    private static void agregarEstudiante(ArrayList<Grupo> grupos) {
        Scanner sc = new Scanner(System.in);
        // Preguntamos en que grupo quiere agregar el estudiante
        System.out.println("Ingrese el ID del grupo al que quiere agregar el estudiante: "); 
        String idGrupo = sc.next(); 
        int indiceGrupo = -1;
        Grupo grupo = null; 
        
        for (int i=0; i < grupos.size(); i++) { 
            if (grupos.get(i).getIdGrupo().equals(idGrupo)) { 
                indiceGrupo = i; 
                grupo = grupos.get(i); 
				break;
            }
        }
		
		try {
            // Si no se encuentra el grupo
            if (indiceGrupo == -1) { 
                System.out.println("Grupo no encontrado"); 
            }
            else {
		        // Pedimos los datos del estudiante
                System.out.println("Ingrese el numero del estudiante: "); 
                int numero = sc.nextInt(); 
                System.out.println("Ingrese el ID del estudiante: "); 
                String idEstudiante = sc.next(); 
                System.out.println("Ingrese la cedula del estudiante (10 digitos): "); 
                String cedula = sc.next(); 
                System.out.println("Ingrese el nombre y apellidos del estudiante: "); 
                String nombreYApellido = sc.next(); 
                System.out.println("Ingrese el semestre en el que esta: "); 
                int semestre = sc.nextInt(); 
                // Creamos al estudiante con todos los datos
                Estudiante estudiante = new Estudiante(numero, idEstudiante, cedula, nombreYApellido, semestre); 
                // Agregamos el estudiante al grupo
	            grupo.agregarEstudiante(estudiante); 
	            System.out.println("Estudiante agregado!");
            }
		}	
		// En casos de no ingresar los datos correctos se marcara el error
		catch (Error e){
			 System.out.println("Error! Por favor ingrese los datos correctamene.");
		}
    }
    
    // Metodo para mostrar los estudiantes y el grupo al que pertenecen
    private static void mostrarEstudiantesYGrupo(ArrayList<Grupo> grupos) {
        Scanner sc = new Scanner(System.in);
        // Pedimos que ingresen el ID del grupo
        System.out.print("Ingrese el ID del grupo para mostrar los estudiantes y el equipo al que pertenecen: ");
        String idGrupo = sc.next(); 
        int indiceGrupo = -1; 
		
        for (int i=0; i < grupos.size(); i++) { 
            if (grupos.get(i).getIdGrupo().equals(idGrupo)) { 
                indiceGrupo = i; 
                break;
            }
        }
		
        try {
			// Si el grupo no se encuentra
            if (indiceGrupo == -1) { 
                System.out.println("Grupo no encontrado"); 
            }
            else {
                // Mostramos los estudiantes
                System.out.println("Los estudiantes del grupo " + idGrupo + " son: ");
                // Usamos un for each para recorrer los estudiantes
                for (Estudiante estudiante : grupos.get(indiceGrupo).getListaEstudiantes()) { 
                    System.out.println(" -Estudiante: " + estudiante.getNombreYApellido());
                }
            }
		}
		// En casos de no ingresar los datos correctos se marcara el error
		catch (Error e){
			 System.out.println("Error! Por favor ingrese los datos correctamene.");
		}
    }

    // Metodo para buscar un equipo
    private static void buscarEquipo(ArrayList<Grupo> grupos) {
        Scanner sc = new Scanner(System.in);
        // Pedimos el ID del grupo que quiere buscar
        System.out.print("Ingrese el ID del grupo para buscar (cantidad de integrantes y su maximo) y mostrar a sus integrantes: ");
        String idGrupo = sc.next(); 
        int indiceGrupo = -1; 
        Grupo grupo = null; 
        
        for (int i=0; i < grupos.size(); i++) { 
            if (grupos.get(i).getIdGrupo().equals(idGrupo)) { 
                indiceGrupo = i; 
                grupo = grupos.get(i); 
				break;
            }
        }
		
		try {
			// Si el grupo no se encuentra
            if (indiceGrupo == -1) { 
                System.out.println("Grupo no encontrado"); 
            }
            else {
