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

    public ArrayList<Pair<String, Integer>> counter(){    //Méthode pour compter le nombres d'arêtes par noeuds
        ArrayList<Pair<String, Integer>> cmpt = new ArrayList<Pair<String, Integer>>();
        for(String e : this.node){
            int cnt = 0;
            for(int i=0; i <= arete.size()-1; i++){
                if (arete.get(i).left == e || arete.get(i).right == e)
                    cnt++;
            }if (aretePref.size() != 0){
                for (int j = 0; j <= aretePref.size()-1; j++){
                    if (aretePref.get(j).left == e || aretePref.get(j).right == e)
                        cnt++;
                }
            }
            cmpt.add(new Pair<>(e,cnt));
        } return cmpt;
    }

}