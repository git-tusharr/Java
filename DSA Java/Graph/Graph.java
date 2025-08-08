import java.util.ArrayList;


class Edge{
    int src;
    int dest;

    Edge(int src,int dest){

        this.src=src;
        this.dest=dest;
    }
}

public class Graph{
    public static void main (String []args){
        int vertices=4;

        ArrayList<Edge> graph[]=new ArrayList[vertices];

        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<Edge>();
        }

        graph[0].add(new Edge(1,2));
        graph[0].add(new Edge(1,3));
        graph[0].add(new Edge(1,4));


        graph[1].add(new Edge(2,1));
        graph[1].add(new Edge(2,3));


        graph[2].add(new Edge(3,1));
        graph[2].add(new Edge(3,2));
        graph[2].add(new Edge(3,4));


        graph[3].add(new Edge(4,1));
        graph[3].add(new Edge(4,3));

        for(int i=0;i<graph.length;i++){
            System.out.println("Vertex "+(i+1)+" is connected to :");

            for(Edge e:graph[i]){
                System.out.println(e.dest);
            }

            System.out.println("--------------------");
        }


    }
}