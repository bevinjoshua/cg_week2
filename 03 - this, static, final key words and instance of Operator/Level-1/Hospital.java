class Patient {
    static String hospitalName = "SRM Hospitals";
    static int totalPatients = 0;
    final int patientID;
    String name;
    int age;
    String ailment;
    Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }
    void display() {
        if (this instanceof Patient) {
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
            System.out.println("Hospital: " + hospitalName);
        }
    }
    static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }
    public static void main(String[] args) {
        Patient p = new Patient(1, "Resh", 19, "Fever");
        p.display();
        Patient.getTotalPatients();
    }
}
