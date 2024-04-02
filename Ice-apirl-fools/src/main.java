

public class main{
    
    public static void main(String[] args) {
        Patient patient = new Patient("John");
        patient.recordSugarLevels("Pizza", 120, 180);
        patient.recordSugarLevels("Salad", 100, 110);
        patient.printDict();
        Patient patienta = new Patient("Juni");
        patienta.recordSugarLevels("Apple", 110, 140);
        patienta.recordSugarLevels("Sushi", 160, 180);
        patienta.printDict();
    }
}
