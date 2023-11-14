package AlgoritmaDanStrukturData.Pertemuan12.Praktikum1;
import java.util.LinkedList;
import java.util.Scanner;

import AlgoritmaDanStrukturData.Pertemuan12.Praktikum2.GraphArray;

// public class Graph {
    // int vertex;
    // LinkedLists list[];

    // public Graph(int vertex){
    //     this.vertex=vertex;
    //     list = new LinkedLists[vertex];
    //     for (int i = 0; i < vertex; i++) {
    //         list[i]=new LinkedLists();
    //     }
    // }

    // public void addEdge(int source, int destination){
    //     list[source].addFirst(destination);
    //     list[destination].addFirst(source);
    // }

    // public void degree(int source) throws Exception{
    //     System.out.println("degree vertex "+ source+ " : "+ list[source].size());

    //     int k, totalIn=0, totalOut=0;
    //     for (int i = 0; i < vertex; i++) {
    //         for (int j = 0; j < list[i].size; j++) {
    //             if(list[i].get(j)==source)
    //             ++totalIn;
    //         }
    //         for (k = 0; k < list[source].size; k++) {
    //         list[source].get(k);
    //         } totalOut = k;
    //     }
    //     System.out.println("Indegree dari vertex "+source+" : "+totalIn);
    //     System.out.println("Outdegree dari evrtex "+ source +" : "+totalOut);
    //     System.out.println("degree vertex "+ source + " : "+ (totalIn+totalOut));
       
    // }

    // public void removeEdge (int source, int destination)throws Exception{
    //     for (int i = 0; i < vertex; i++) {
    //         if(i==destination){
    //             list[source].remove(destination);
    //         }
    //     }
    // }

    // public void removeAllEdges(){
    //     for (int i = 0; i < vertex; i++) {
    //         list[i].clear();
    //     } System.out.println("Graph berhasil dikosongkan");
    // }

    // public void printGraph() throws Exception{
    //     for (int i = 0; i < vertex; i++) {
    //         if (list[i].size()>0) {
    //             System.out.println("Vertex "+i+" terhubung dengan: ");
    //             for (int j = 0; j < list[i].size(); j++) {
    //                 System.out.println(list[i].get(j)+ " ");
    //             } System.out.println("");
    //         }
    //     } System.out.println(" ");
    // }

    // public static void main(String[] args) throws Exception{
    //     // Graph graph=new Graph(6);
    //     // graph.addEdge(0, 1);
    //     // graph.addEdge(0, 4);
    //     // graph.addEdge(1, 2);       
    //     // graph.addEdge(1, 3);
    //     // graph.addEdge(1, 4);    
    //     // graph.addEdge(2, 3);
    //     // graph.addEdge(3, 4);
    //     // graph.addEdge(3, 0);
    //     // graph.degree(2);
    //     // graph.removeEdge(1, 2);
    //     // graph.printGraph();


    //     // TUGAS 1
    //     int count = 1, sou = 0, des = 0;
    //     Scanner sc = new Scanner(System.in);
    //     Graph graph = new Graph(6);
    //     int v, e = 1;
    //     System.out.print("Masukkan jumlah vertices : ");
    //     v = sc.nextInt();
    //     System.out.print("Masukkan jumlah edges : ");
    //     e = sc.nextInt();
    //     System.out.println("");
    //     System.out.println("=============================");
    //     System.out.println("Masukkan edges : ");
    //     while (count <= e) {
    //         System.out.print("Masukkan Source\t\t: ");
    //         sou = sc.nextInt();
    //         System.out.print("Masukkan Destination\t: ");
    //         des = sc.nextInt();
    //         graph.addEdge(sou, des);
    //         count++;
    //     }
    //     System.out.println("");
    //     graph.printGraph();
    //     graph.degree(2);
    //     graph.removeEdge(1, 2);
    //     graph.printGraph();
    // }



    //TUGAS 2
//     int vertex;
//     boolean graphType;
//     LinkedLists list[];

//     public Graph(int vertex) {
//         this.vertex = vertex;
//         list = new LinkedLists[vertex];
//         for (int i = 0; i < vertex; i++) {
//             list[i] = new LinkedLists();
//         }
//     }

//     public void graphType(boolean isDirected) {
//         graphType = isDirected;
//     }

//     public void addEdge(int source, int destination) {
 
//         list[source].addFirst(destination);

//         if (!graphType) {
//             list[destination].addFirst(source);
//         }
//     }

//     public void degree(int source) throws Exception {
    
//         if (!graphType) { 
//             System.out.println("degree vertex " + source + " : " + list[source].size());
//         }

//         if (graphType) {
//             int totalIn = 0, totalOut = 0;
//             for (int i = 0; i < vertex; i++) {
//               for (int j = 0; j < list[i].size(); j++) {
//                   if(list[i].get(j)==source)
//                         ++totalIn;
//                 }
//                 totalOut = list[source].size();
//             }
//             System.out.println("Indegree dari vertex " + source + " :" + totalIn);
//             System.out.println("Outdegree dari vertex " + source + " :" + totalOut);
//             System.out.println("degree dari vertex " + source + " : "+ (totalIn + totalOut));
//         }
//     }

// //     public void removeEdge(int source, int destination) throws
// //      Exception {
// //         list[source].remove(destination);
// //         if (!graphType) {
// //             list[destination].remove(source);
// //         }
// //     }

//     //TUGAS 3
//     public void removeEdge(int source, int destination) throws
//     Exception {
//             int sourceIndex = -1;
//             for (int i = 0; i < vertex; i++) {
//                 if (i == source) {
//                     sourceIndex = i;
//                     break;
//                 }
//             }
    
//             if (sourceIndex != -1) {
//                 for (int i = 0; i < list[sourceIndex].size(); i++) {
//                     if (list[sourceIndex].get(i) == destination) {
//                         list[sourceIndex].remove(i);
//                         break;
//                     }
//                 }
//             }
//         } 

//     public void removeAllEdges() {
//         for (int i = 0; i < vertex; i++) {
//             list[i].clear();
//         }
//         System.out.println("Graph berhasil dikosongkan");
//     }

//     public void printGraph() throws Exception {
//         for (int i = 0; i < vertex; i++) {
//             if (list[i].size() > 0) {
//                 System.out.print("Vertex " + i + " terhubung dengan :");
//                 for (int j = 0; j < list[i].size(); j++) {
//                     System.out.print(list[i].get(j) + " ");
//                 }
//                 System.out.println("");
//             }
//         }
//         System.out.println(" ");
//     }

//     public static void main(String[] args) throws Exception {
//         int sou = 0, des = 0;

//         Scanner sc = new Scanner(System.in);
//         Graph graph = new Graph(6);

//         int menu = 0;
//         do {
//             System.out.println("============================="); 
//             System.out.println("      Menu Tipe Graph        ");
//             System.out.println("=============================");
//             System.out.println("1. Directed");
//             System.out.println("2. Undirected");
//             System.out.print("Menu : ");
//             int del = sc.nextInt();

//             int v, e = 1;
//             System.out.print("Masukkan jumlah vertices : ");
//             v = sc.nextInt();
//             System.out.print("Masukkan jumlah edges : ");
//             e = sc.nextInt();

//             if (del == 1) {
//                 graph.graphType(true);
//                 for (int i = 0; i < e; i++) {
//                     System.out.print("Masukkan Source : ");
//                     sou = sc.nextInt();
//                     System.out.print("Masukkan Destination : ");
//                     des = sc.nextInt();
//                     graph.addEdge(sou, des);
//                 }
//                 System.out.println("");
//                 graph.printGraph();
//             } else if (del == 2) {
//                 graph.graphType(false);
//                 for (int i = 0; i < e; i++) {
//                     System.out.print("Masukkan Source : ");
//                     sou = sc.nextInt();
//                     System.out.print("Masukkan Destination : ");
//                     des = sc.nextInt();
//                     graph.addEdge(sou, des);
//                 }
//                 System.out.println("");
//                 graph.printGraph();
//             }
//         } while (menu != 1 && menu != 2);
//     }
// }



        //TUGAS 4
    public class Graph <T> {
        T[] vertex;
        LinkedLists list[];
    
        public Graph(T[] vertex) {
            this.vertex = vertex;
            list = new LinkedLists[vertex.length];
            for (int i = 0; i < vertex.length; i++) {
                list[i] = new LinkedLists();
            }
        } 
    
        public void addEdge(int source, int destination) {
            list[source].addFirst(destination);
            list[destination].addFirst(source);
        }
    
        public void degree(int source) throws Exception {
    
            System.out.println("Degree vertex         " + source + " : " + list[source].size());
    
            int k, totalIn = 0, totalOut = 0;
            for (int i = 0; i < vertex.length; i++) {
                for (int j = 0; j < list[i].size(); j++) {
                    if (list[i].get(j) == source) {
                        ++totalIn;
                    }
                }
    
                for (k = 0; k < list[source].size(); k++) {
                    list[source].get(k);
                }
                totalOut = k;
            }
            System.out.println("Indegree dai vertex   " + source + " : " + totalIn);
            System.out.println("Outdegree dari vertex " + source + " : "+ totalOut);
            System.out.println("degree vertex         " + source + " : "+ (totalIn + totalOut));
        }
    
        public void removeEdge(int source, int destination) throws Exception {
            for (int i = 0; i < vertex.length; i++) {
                if (i == destination) {
                    list[source].remove(destination);
                }
            }
        }
    
        public void removeAllEdges() {
            for (int i = 0; i < vertex.length; i++) {
                list[i].clear();
            }
            System.out.println("Graph berhasil dikosongkan");
        }
    
        public void printGraph() throws Exception {
            for (int i = 0; i < vertex.length; i++) {
                if(list[i].size() > 0 ) {
                    System.out.print("Vertex " + vertex[i] + " terhubung dengan : ");
                    for(int j = 0; j < list[i].size(); j++) {
                        System.out.print(vertex[list[i].get(j)] + " ");
                    }
                    System.out.println("");
                }
            }
            System.out.println(" "); 
        } 
    
        public static void main(String[] args) throws Exception {
            Scanner sc = new Scanner(System.in);
            System.out.print("Masukkan Vertex\t: ");
            String[] vertex = new String[sc.nextInt()];
            sc.nextLine();
    
            for (int i = 0; i < vertex.length; i++) {
                System.out.print("Masukkan data vertex ke-" + i + " : ");
                vertex[i] = sc.nextLine();
            }
    
            Graph<String> gph = new Graph<String>(vertex);
            System.out.print("Masukkan Edge : ");
            int edge = sc.nextInt();
            System.out.print("Masukkan Edge : ");
            System.out.println("Masukkan Edge: <from> <to>");
            for (int i = 0; i < edge; i++) {;
                gph.addEdge(sc.nextInt(), sc.nextInt());
            }
            gph.printGraph();
        }    
     
} 

