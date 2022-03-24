import java.util.*;

public class Graphe implements IGraphe {
    int n;
    private String[][] nodeAndEdge = new String[n][n]; //Ce tableau représente les arêtes entre les différents noeuds, 0 pas d'arête, 1 une arête, 2 une arête de préférence

    public Graphe(String[][] nodeAndEdge, int n){
        this.nodeAndEdge = nodeAndEdge;
        this.n = n;
    }

    public String[][] getNodeAndEdge(){
        return nodeAndEdge;
    }

    public ArrayList<Pair<String, Integer>> counter(){
        ArrayList<Pair<String, Integer>> cmpt = new ArrayList<Pair<String, Integer>>();
        int cpt;
        for (int i = 0; i < n; i++){
            cpt = 0;
            for(int j = 0; j < n; j++){
                if(nodeAndEdge[i][j] == "1" || nodeAndEdge[i][j] == "2"){
                    cpt++;
                }
            }cmpt.add(new Pair<>(nodeAndEdge[i][0], cpt));
        }return cmpt;
    }

    public void print(){
        String edge;
        for (int i = 0; i < n; i++){
            edge= "";
            for (int j = 0; j < n; j++){
                if (nodeAndEdge[i][j] == "1"){
                    edge = edge + " " + nodeAndEdge[0][j];
                }else if (nodeAndEdge[i][j] == "2"){
                    edge = edge + " " + nodeAndEdge[0][j];
                }
            }System.out.println("Noeud : " + nodeAndEdge[i][0] + "Arêtes : " + edge);
        }
    }
}
