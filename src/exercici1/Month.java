package exercici1;


public class Month {
    public String name;
    
    public Month(String name){
        this.name = name;
    }
  
    public boolean equals( Object objeto ) {
        if (objeto == null) return false;
        Month m = (Month)objeto;
        if ((this.name).equals(m.name)){
            return true;
        }
            
        return false;
    }
    public int hashCode() {
        return this.name.hashCode();
    }
}
