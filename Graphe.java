import java.util.*;

class  Graphe {
    private ArrayList<String> node = new ArrayList<>(); //Pour tous les noeuds du graphe
    private ArrayList<String> arete = new ArrayList<>(); //Pour les arêtes
    private ArrayList<String> aretePref = new ArrayList<>(); //Pour les arêtes de préférences

    public Graphe(ArrayList<String> node, ArrayList<String> arete, ArrayList<String> aretePref){
        this.node = node;
        this.arete = arete;
        this.aretePref = aretePref;
    }

    public void print(){
        System.out.println("Node : " + node + "\nArete : " + arete + "\nAretePref : " + aretePref);
    }

    public ArrayList<String> getNode(){
        return node;
    }

    public ArrayList<String> getArete(){
        return arete;
    }

    public ArrayList<String> getAretePref(){
        return aretePref;
    }

}