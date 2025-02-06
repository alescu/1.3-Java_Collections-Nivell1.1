
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {


    /**
     * Crea una classe anomenada Month amb un atribut "name" (que emmagatzemarà el nom del mes de l'any).
     * Afegeix 11 objectes Month (cadascun amb el seu atribut diferent) en un ArrayList, a excepció de
     * l'objecte amb atribut "Agost". Després, efectua la inserció en el lloc que correspon a aquest mes
     * i demostra que l’ArrayList manté l'ordre correcte.
     *
     * Converteix l’ArrayList de l’exercici anterior en un HashSet i assegura’t que no permet duplicats.
     *
     * Recorre la llista amb un for i amb un iterador.
     */
    public static void main(String args[]) {

        ArrayList<Month> llistatDeMessos = new ArrayList<>();
        Month month = null;

        for (Month.NomMes nomMes : Month.NomMes.values()) {
            if(!Month.NomMes.AGOST.toString().equals(nomMes)){
                month = new Month(nomMes.toString());
                llistatDeMessos.add(month);
            }
        }
        for(Month mesObj : llistatDeMessos){
            System.out.print(mesObj.getName()+ " / ");
        }
        System.out.println("\n---------- inserim Agost al seu lloc");
        month = new Month(Month.NomMes.AGOST.toString());
        llistatDeMessos.add(7, month);

        for(Month mesObj : llistatDeMessos){
            System.out.print(mesObj.getName()+ " / ");
        }

        // ArrayList a HasSet
        HashSet<Month> hashSet = new HashSet<Month>(llistatDeMessos);

        System.out.println("\n\n---------- Repetim Agost, per tal de veure si el podem repetir.");
        hashSet.add(new Month(Month.NomMes.AGOST.toString().toLowerCase()));

        System.out.println("\n---------- Llistem el hashset amb un for clàssic: " + hashSet.size() + " items");
        // for(int i=0;i<hashSet.size()-1;i++){
        for(Month mesObj : hashSet){
            System.out.print(mesObj.getName()+ " / ");
        }

        System.out.println("\n---------- Llistem hashset amb un Iterador: l'ordre es perd");
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            System.out.print(((Month)it.next()).getName() + " / ");
        }

        System.out.println("\n\n");
    }

}
