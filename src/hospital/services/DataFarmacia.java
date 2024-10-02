package hospital.services;

import hospital.model.Medicamento;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DataFarmacia {

    private List<Medicamento> listaMedicamentos;

    public DataFarmacia() {
        listaMedicamentos = new ArrayList<>();
        cargarMedicamentos();
    }

    private void cargarMedicamentos() {
        listaMedicamentos.add(new Medicamento("Paracetamol", "Tableta", "500 mg", "Paracetamol",
                LocalDate.of(2025, 5, 12), "Lote1234", 25.50, "Dolor y fiebre", "Alergia al paracetamol"));
        listaMedicamentos.add(new Medicamento("Ibuprofeno", "Cápsula", "200 mg", "Ibuprofeno",
                LocalDate.of(2026, 3, 10), "Lote5678", 30.00, "Inflamación y dolor", "Úlcera gástrica"));
        listaMedicamentos.add(new Medicamento("Amoxicilina", "Suspensión", "500 mg/5 ml", "Amoxicilina",
                LocalDate.of(2024, 8, 22), "Lote2234", 40.00, "Infecciones bacterianas", "Alergia a penicilina"));
        listaMedicamentos.add(new Medicamento("Loratadina", "Jarabe", "5 mg/5 ml", "Loratadina",
                LocalDate.of(2025, 12, 5), "Lote3345", 15.00, "Alergias", "Hipersensibilidad"));
        listaMedicamentos.add(new Medicamento("Omeprazol", "Cápsula", "20 mg", "Omeprazol",
                LocalDate.of(2024, 7, 30), "Lote4456", 60.00, "Acidez estomacal", "Insuficiencia hepática"));
        listaMedicamentos.add(new Medicamento("Aspirina", "Tableta", "100 mg", "Ácido acetilsalicílico",
                LocalDate.of(2026, 2, 15), "Lote5567", 10.00, "Dolor leve a moderado", "Úlcera péptica"));
        listaMedicamentos.add(new Medicamento("Diazepam", "Tableta", "10 mg", "Diazepam",
                LocalDate.of(2027, 11, 19), "Lote6678", 70.00, "Ansiedad", "Miastenia gravis"));
        listaMedicamentos.add(new Medicamento("Metformina", "Tableta", "850 mg", "Metformina",
                LocalDate.of(2026, 4, 7), "Lote7789", 20.00, "Diabetes tipo 2", "Insuficiencia renal"));
        listaMedicamentos.add(new Medicamento("Levotiroxina", "Tableta", "50 mcg", "Levotiroxina sódica",
                LocalDate.of(2025, 9, 18), "Lote8890", 50.00, "Hipotiroidismo", "Hipertiroidismo no tratado"));
        listaMedicamentos.add(new Medicamento("Salbutamol", "Inhalador", "100 mcg", "Salbutamol",
                LocalDate.of(2025, 1, 25), "Lote9901", 35.00, "Asma", "Cardiopatías graves"));
        listaMedicamentos.add(new Medicamento("Ranitidina", "Tableta", "150 mg", "Ranitidina",
                LocalDate.of(2024, 10, 20), "Lote1123", 25.00, "Reflujo gastroesofágico", "Porfiria"));
        listaMedicamentos.add(new Medicamento("Clonazepam", "Tableta", "2 mg", "Clonazepam",
                LocalDate.of(2026, 5, 12), "Lote2235", 80.00, "Epilepsia", "Insuficiencia respiratoria grave"));
        listaMedicamentos.add(new Medicamento("Fluconazol", "Cápsula", "150 mg", "Fluconazol",
                LocalDate.of(2025, 6, 19), "Lote3346", 45.00, "Infecciones por hongos", "Enfermedad hepática grave"));
        listaMedicamentos.add(new Medicamento("Azitromicina", "Tableta", "500 mg", "Azitromicina",
                LocalDate.of(2024, 12, 3), "Lote4457", 70.00, "Infecciones bacterianas", "Hipersensibilidad"));
        listaMedicamentos.add(new Medicamento("Furosemida", "Tableta", "40 mg", "Furosemida",
                LocalDate.of(2026, 8, 14), "Lote5568", 22.00, "Hipertensión", "Deshidratación severa"));
        listaMedicamentos.add(new Medicamento("Atorvastatina", "Tableta", "20 mg", "Atorvastatina",
                LocalDate.of(2025, 2, 28), "Lote6679", 65.00, "Colesterol alto", "Enfermedad hepática activa"));
        listaMedicamentos.add(new Medicamento("Losartán", "Tableta", "50 mg", "Losartán potásico",
                LocalDate.of(2026, 6, 30), "Lote7780", 40.00, "Hipertensión", "Embarazo"));
        listaMedicamentos.add(new Medicamento("Insulina", "Inyección", "100 UI/ml", "Insulina humana",
                LocalDate.of(2024, 11, 22), "Lote8891", 100.00, "Diabetes", "Hipoglucemia"));
        listaMedicamentos.add(new Medicamento("Amlodipino", "Tableta", "5 mg", "Amlodipino",
                LocalDate.of(2025, 4, 15), "Lote9902", 55.00, "Hipertensión", "Shock cardiogénico"));
        listaMedicamentos.add(new Medicamento("Diclofenaco", "Gel", "1%", "Diclofenaco sódico",
                LocalDate.of(2027, 7, 10), "Lote1124", 15.00, "Dolor e inflamación", "Úlcera gástrica"));
        listaMedicamentos.add(new Medicamento("Morfina", "Inyección", "10 mg/ml", "Morfina",
                LocalDate.of(2026, 9, 18), "Lote2236", 120.00, "Dolor severo", "Depresión respiratoria"));
        listaMedicamentos.add(new Medicamento("Clopidogrel", "Tableta", "75 mg", "Clopidogrel",
                LocalDate.of(2024, 10, 22), "Lote3347", 80.00, "Prevención de trombos", "Hemorragias activas"));
        listaMedicamentos.add(new Medicamento("Naproxeno", "Tableta", "250 mg", "Naproxeno",
                LocalDate.of(2025, 3, 11), "Lote4458", 35.00, "Dolor e inflamación", "Insuficiencia renal grave"));
        listaMedicamentos.add(new Medicamento("Hidrocortisona", "Crema", "1%", "Hidrocortisona",
                LocalDate.of(2026, 1, 9), "Lote5569", 20.00, "Inflamaciones cutáneas", "Infecciones cutáneas"));
        listaMedicamentos.add(new Medicamento("Cefalexina", "Cápsula", "500 mg", "Cefalexina",
                LocalDate.of(2027, 12, 5), "Lote6670", 45.00, "Infecciones bacterianas", "Alergia a las cefalosporinas"));
        listaMedicamentos.add(new Medicamento("Prednisona", "Tableta", "5 mg", "Prednisona",
                LocalDate.of(2024, 8, 12), "Lote7781", 60.00, "Alergias graves", "Infecciones sistémicas"));
        listaMedicamentos.add(new Medicamento("Simvastatina", "Tableta", "20 mg", "Simvastatina",
                LocalDate.of(2025, 11, 15), "Lote8892", 50.00, "Colesterol alto", "Enfermedad hepática activa"));
    }

    public List<Medicamento> getListaMedicamentos() {
        return listaMedicamentos;
    }


}