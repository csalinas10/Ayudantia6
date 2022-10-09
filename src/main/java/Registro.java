import java.util.ArrayList;

public class Registro {
    ArrayList<Persona> pacientes = new ArrayList<>();

    public Persona agregarPersonas(int edad, String nombre) {
        Persona personaNueva = new Persona(edad, nombre);
        this.pacientes.add(personaNueva);
        return personaNueva;
    }
    public void buscarPacienteNombre(ArrayList<Persona>pacientes){
        String nombre = "Lelo";
        for (Persona paciente : pacientes){
            if (paciente.getNombre().equals(nombre)){
                System.out.println("NOMBRE | EDAD");
                System.out.println(paciente.toString());
            }
        }
    }

    public ArrayList<Persona> getPacientes() {
        return pacientes;
    }

    public void personasMayores(ArrayList<Persona>pacientes) {
        String nombre = "Rogelio";
        int edad = 60;
        for (Persona paciente : pacientes) {
            if (pacientes > edad) {
                System.out.println(paciente.toString());
            }
        }
    }
    public ArrayList<Persona> getEdad() {
        return pacientes;
    }
}
