package hospital.model;

public class DoctorGeneral {
    private String nombre;
    private String apellido;
    private String especialidad;
    private String email;
    private String password;

    public DoctorGeneral(String nombre, String apellido, String especialidad, String email, String password) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.especialidad = especialidad;
        this.email = email;
        this.password = password;
    }

    //SETTER Y GETES
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getApellido() {return apellido;}
    public void setApellido(String apellido) {this.apellido = apellido;}

    public String getEspecialidad() {return especialidad;}
    public void setEmail(String email) {this.email = email;}

    public String getEmail() {return email;}
    public void setEspecialidad(String especialidad) {this.especialidad = especialidad;}

    public String getPassword() {return password;}
    public void setPassword(String password) {this.password = password;}
}

