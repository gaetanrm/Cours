import java.util.*;

class ColorGraph {

    public Graphe createGraph() {   //On utlise le graphe du cours(ici celui en diamant), faudra faire aussi l'autre...
        ArrayList<String> node = new ArrayList<String>(); 
        node.add("x");      //Doit y avoir mieux qu'ajouter comme ca la main
        node.add("y");
        node.add("z");
        node.add("t");
        ArrayList<Pair<String, String>> arete = new ArrayList<Pair<String, String>>();
        arete.add(new Pair<>("x", "y"));    //idem
        arete.add(new Pair<>("x", "z"));
        arete.add(new Pair<>("y", "t"));
        arete.add(new Pair<>("z", "t"));
        ArrayList<Pair<String, String>> aretePref = new ArrayList<Pair<String, String>>();
        return new Graphe(node, arete, aretePref);

    }

    public void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int k;
        System.out.println("Quel \"k\" voulez vous pour l'algo ? ");
        k = keyboard.nextInt();
        Graphe graph = createGraph();
        ColorAlgo(graph, k);
        graph.print();
        keyboard.close();
    }

    public void ColorAlgo(Graphe graph, int k){
        ArrayList<String> nodeSpill = new ArrayList<String>();  //Liste des noeuds spillé
        ArrayList<String> nodeColor = new ArrayList<String>();  //Liste des noeuds colorés



    }

}