package hospital.services;

import hospital.model.Paciente;
import java.util.ArrayList;

public class DataPaciente {
    public static ArrayList<Paciente> ListaPacientes() {
        ArrayList<Paciente> pacientes = new ArrayList<>();

        pacientes.add(new Paciente("Juan Pérez", "juan.perez@gmail.com", "123456789", "Av. Siempre Viva 123", "1990-01-15", "07:00", "Consulta general", 3, "Dr. López"));
        pacientes.add(new Paciente("Maria López", "maria.lopez@gmail.com", "987654321", "Calle Falsa 456", "1988-04-22", "07:30", "Chequeo", 2, "Dra. Martínez"));
        pacientes.add(new Paciente("Carlos Gómez", "carlos.gomez@gmail.com", "123123123", "Av. del Sol 234", "1985-09-10", "08:00", "Dolor de cabeza", 5, "Dr. Ramírez"));
        pacientes.add(new Paciente("Ana Torres", "ana.torres@gmail.com", "456456456", "Calle Luna 987", "1978-11-29", "08:30", "Chequeo", 7, "Dra. Morales"));
        pacientes.add(new Paciente("Pedro González", "pedro.gonzalez@gmail.com", "789789789", "Calle Mar 321", "1993-03-18", "09:00", "Dolor abdominal", 4, "Dr. Pérez"));
        pacientes.add(new Paciente("Lucía Hernández", "lucia.hernandez@gmail.com", "321321321", "Calle Estrella 654", "1995-07-07", "09:30", "Chequeo", 1, "Dra. López"));
        pacientes.add(new Paciente("Roberto Sánchez", "roberto.sanchez@gmail.com", "654654654", "Av. del Rey 999", "1982-05-01", "10:00", "Consulta general", 2, "Dr. Martínez"));
        pacientes.add(new Paciente("Elena Fernández", "elena.fernandez@gmail.com", "987987987", "Calle Real 101", "1975-12-15", "10:30", "Chequeo", 6, "Dra. Ramírez"));
        pacientes.add(new Paciente("Luis Martínez", "luis.martinez@gmail.com", "123987456", "Av. Norte 444", "1998-08-23", "11:00", "Dolor muscular", 3, "Dr. Pérez"));
        pacientes.add(new Paciente("Marta Ruiz", "marta.ruiz@gmail.com", "456789123", "Calle Sur 555", "1987-02-10", "11:30", "Chequeo", 8, "Dra. Morales"));
        pacientes.add(new Paciente("Andrés García", "andres.garcia@gmail.com", "789321654", "Av. Central 777", "1979-06-11", "12:00", "Dolor en el pecho", 9, "Dr. López"));
        pacientes.add(new Paciente("Isabel Jiménez", "isabel.jimenez@gmail.com", "321654987", "Calle Oeste 888", "1992-04-17", "12:30", "Chequeo", 4, "Dra. Martínez"));
        pacientes.add(new Paciente("Raúl Díaz", "raul.diaz@gmail.com", "987123654", "Av. Libertad 222", "1980-10-21", "13:00", "Consulta general", 7, "Dr. Ramírez"));
        pacientes.add(new Paciente("Carmen Silva", "carmen.silva@gmail.com", "123456123", "Calle Este 999", "1991-01-30", "13:30", "Chequeo", 2, "Dra. Morales"));
        pacientes.add(new Paciente("Felipe Castro", "felipe.castro@gmail.com", "456123789", "Av. Amanecer 666", "1986-09-25", "14:00", "Dolor de cabeza", 3, "Dr. Pérez"));
        pacientes.add(new Paciente("Daniela Ortega", "daniela.ortega@gmail.com", "789654123", "Calle Larga 101", "1989-12-05", "14:30", "Consulta general", 5, "Dra. López"));
        pacientes.add(new Paciente("Victor Romero", "victor.romero@gmail.com", "321789654", "Calle Nueva 222", "1994-07-13", "15:00", "Chequeo", 6, "Dr. Martínez"));

        return pacientes;
    }
}
