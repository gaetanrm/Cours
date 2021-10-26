import java.util.*;

class ColorGraph {

    public Graphe createGraph() {   //On utlise le graphe du cours(ici celui en diamant), faudra faire aussi l'autre...
        ArrayList<String> node = new ArrayList<String>(); 
        String listNode = "x, y, z, t";
        node.add(listNode);
        ArrayList<String> arete = new ArrayList<String>();
        arete.add("xy");    //Doit y avoir mieux qu'ajouter comme ca la main
        arete.add("xz");
        arete.add("yt");
        arete.add("zt");
        ArrayList<String> aretePref = new ArrayList<String>();
        return new Graphe(node, arete, aretePref);

    }

    public void main(String[] args){
        Graphe graph = createGraph();
        graph.print();
    }

}