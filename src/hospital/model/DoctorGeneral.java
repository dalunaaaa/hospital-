package hospital.model;

public class DoctorGeneral {
    private String nombre;
    private String apellido;
    private String especialidad ;
    private String email;
    private String contraseña;

    public DoctorGeneral (String nombre, String apellido, String especialidad, String email, String contraseña){
        this.nombre = nombre;
        this.apellido = apellido;
        this.especialidad = especialidad;
        this.email= email;
        this.contraseña= contraseña;

    }

}

