import java.util.*;

class  Graphe {
    private ArrayList<String> node = new ArrayList<>(); //Pour tous les noeuds du graphe
    private ArrayList<Pair<String, String>> arete = new ArrayList<Pair<String, String>>(); //Pour les arêtes
    private ArrayList<Pair<String, String>> aretePref = new ArrayList<Pair<String, String>>(); //Pour les arêtes de préférences

    public Graphe(ArrayList<String> node, ArrayList<Pair<String, String>> arete, ArrayList<Pair<String, String>> aretePref){
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

    public ArrayList<Pair<String, String>> getArete(){
        return arete;
    }

    public ArrayList<Pair<String, String>> getAretePref(){
        return aretePref;
    }

    public ArrayList<Integer> counter(){
        ArrayList<Integer> cmpt = new ArrayList<Integer>(); //Dans cette liste, les valeurs pour chaque noeuds ont le meme indice que dans la liste node
        for(String e : this.node){
            int cnt = 0;
            for(int i=0; i < arete.size()-1; i++){
                if (arete.get(i).left.contains(e))
                    cnt++;
                else if(arete.get(i).right.contains(e))
                    cnt++;
            }cmpt.add(cnt);
        } return cmpt;
    }

}