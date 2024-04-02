import java.util.HashMap;
import java.util.Map;

public class Patient {
    
    String name;
    HashMap<String, Integer> foodSugar = new HashMap<String, Integer>();
    
    public Patient(String name) {
        this.name = name;
    }
        
    public void recordSugarLevels(String food, int beforeBloodSugarLevel, int afterBloodSugarLevel) {
        int difference = afterBloodSugarLevel - beforeBloodSugarLevel;
        foodSugar.put(food, difference);
    }

    public int getBloodSugarInc(String food) {
        return foodSugar.get(food);
    }

    public void printDict() {
        for (Map.Entry<String, Integer> entry : foodSugar.entrySet()) {
            String food = entry.getKey();
            Integer bloodSugarInc = entry.getValue();
            System.out.println(this.name + ": "+food + ": " + bloodSugarInc);
        }
    }
}