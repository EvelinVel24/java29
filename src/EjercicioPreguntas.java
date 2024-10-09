// Clase Pregunta que modela cada pregunta y su respuesta
class Pregunta {
    private int id;
    private String pregunta;
    private String respuesta;
    private String descripcion;

    // Constructor
    public Pregunta(int id, String pregunta, String respuesta, String descripcion) {
        this.id = id;
        this.pregunta = pregunta;
        this.respuesta = respuesta;
        this.descripcion = descripcion;
    }

    // Métodos Getters
    public int getId() {
        return id;
    }

    public String getPregunta() {
        return pregunta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    // Método para mostrar la información de la pregunta
    public void mostrarPregunta() {
        System.out.println("Pregunta " + id + ": " + pregunta);
        System.out.println("Respuesta: " + respuesta);
        System.out.println("Descripción: " + descripcion);
    }
}

// Clase principal que contiene las preguntas y respuestas
public class EjercicioPreguntas {

    public static void main(String[] args) {
        // Crear una lista de preguntas
        Pregunta[] preguntas = new Pregunta[5];
        
        // Inicializar las preguntas
        preguntas[0] = new Pregunta(1, "¿Qué funciones tiene el usuario en la aplicación Mangiare?",
                                    "Login, pedir comida, ver comida disponible, ver ruta de delivery, mostrar dirección, mostrar notificaciones",
                                    "El usuario puede realizar todas las acciones básicas relacionadas con el pedido de comida y seguimiento de la entrega.");
        
        preguntas[1] = new Pregunta(2, "¿Qué funciones tiene el proveedor de alimentos en la aplicación Mangiare?",
                                    "Recibir pago, publicar comida disponible, habilitar retiro por delivery",
                                    "El proveedor maneja las transacciones y el stock de comida disponible para la entrega.");
        
        preguntas[2] = new Pregunta(3, "¿Qué funciones tiene el delivery en la aplicación Mangiare?",
                                    "Recibir pago, notificar retiro, ver ruta, mostrar posición",
                                    "El delivery puede gestionar el estado del pedido y su ruta.");
        
        preguntas[3] = new Pregunta(4, "¿Qué funciones tiene el banco en la aplicación Mangiare?",
                                    "Verificar saldo, autorizar transacción",
                                    "El banco autoriza y valida las transacciones realizadas por el usuario.");
        
        preguntas[4] = new Pregunta(5, "¿Qué relaciones existen entre los actores de la aplicación?",
                                    "Usuario, proveedor, delivery, banco están conectados mediante casos de uso relacionados a transacciones y logística.",
                                    "Las interacciones principales son entre el usuario, el proveedor de alimentos, y el delivery, con el banco como intermediario financiero.");
        
        // Mostrar todas las preguntas y respuestas
        for (Pregunta pregunta : preguntas) {
            pregunta.mostrarPregunta();
            System.out.println();  // Espacio entre preguntas
        }
    }
}
