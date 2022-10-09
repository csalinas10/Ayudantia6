import java.util.ArrayList;

public class Launcher {
    public static void main(String[] args) {
        Registro registro = new Registro();
        registro.agregarPersonas(45, "Pablo");
        registro.agregarPersonas(65, "Lelo");
        registro.agregarPersonas(50,"Rogelio");
        registro.buscarPacienteNombre(registro.getPacientes());
        registro.personasMayores(registro.getEdad());

    }
}

