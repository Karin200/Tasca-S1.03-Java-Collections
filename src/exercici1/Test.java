package exercici1;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;


public class Test {

    public static void main(String[] args) {
        String[] meses = new String[]{"Enero","Febrero","Marzo","Abril","Mayo",
                                      "Junio","Julio","Septiembre","Octubre","Noviembre","Diciembre"};
        
        ArrayList<Month> Meses = new ArrayList<>();
        
        for (int i = 0; i < meses.length; i++) {
            Month m = new Month(meses[i]);
            Meses.add(m);
        }
        
        Meses.add(7, new Month("Agosto"));
        
        System.out.println("-----------------\nArrayList Montth\n-----------------");
        for (int i = 0; i < Meses.size(); i++) {
            System.out.println(Meses.get(i).name);
        }
        
       
        System.out.println("-----------------\nHashSet For Montth\n-----------------");
        HashSet<Month> hashSet = new HashSet<>(Meses);
        hashSet.add(new Month("Agosto"));
        for (Month value : hashSet) {
            System.out.println(value.name);
        }

        System.out.println("-----------------\nHashSet Iterator Montth\n-----------------");
        Iterator<Month> iterate_value = hashSet.iterator();
        while (iterate_value.hasNext()) { 
            System.out.println(iterate_value.next().name); 
        } 
    }
    
}

