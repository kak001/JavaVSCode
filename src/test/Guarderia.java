public class Guarderia {
    // Atributos
    private Habitacion[] rooms;
    private int totalCollected;

    // Constructor
    public Guarderia(int numberRooms) {
        rooms = new Habitacion[numberRooms];
        for (int index = 0; index < numberRooms; index++) {
            rooms[index] = new Habitacion(index + 1);
        }
        totalCollected = 0;
    }

    // Metodos
    public void showCondition() {
        ConsoleColors.message("ESTADO DE DE LA GUARDERIA", ConsoleColors.YELLOW);
        for (Habitacion room : rooms) {
            if (room.getOccupied() == true) {
                ConsoleColors.message("Habitacion " + room.getNumber() + " | Estado: Ocupada | Pokemon: " + room.getPokemon() , ConsoleColors.RED);
            } else {
                ConsoleColors.message("Habitacion " + room.getNumber() + " | Estado: Desocupada (Vacia)", ConsoleColors.GREEN);
            }
        }
    }

    /** Imprime el resumen compacto tipo [ ocupada, desocupada, ... ] usado tras cada acción. */
    private void imprimirEstadoCompacto() {
        StringBuilder sb = new StringBuilder("Guardería [ ");
        for (int i = 0; i < rooms.length; i++) {
            sb.append(rooms[i].isOcupada() ? "ocupada" : "desocupada");
            if (i < rooms.length - 1) {
                sb.append(", ");
            }
        }
        sb.append(" ]");
        System.out.println(sb.toString());
    }

    
}
