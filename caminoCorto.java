package com.wikitude.samples.utils.urllauncher;

public class caminoCorto {
	Grafo<String, Integer> grafo;
    Floyd floyd;
    
    public caminoCorto(){
        grafo = new Grafo<String, Integer>();
        grafo.add("A");
        grafo.add("B");
        grafo.add("C");
        grafo.add("C-1");
        grafo.add("D");
        grafo.add("E");
        grafo.add("F");
        grafo.add("G");
        grafo.add("H");
        grafo.add("I");
        grafo.add("J");
        grafo.add("J-1");
        grafo.add("K");
        grafo.add("II-1");
        grafo.add("II-2");
        grafo.add("Cancha");
        
        //TO DO, agregar Edges
        grafo.addEdge("A", "II-2", 3);
        grafo.addEdge("A", "G",1);
        grafo.addEdge("A", "K",2);        
        grafo.addEdge("II-2", "A",3);
        grafo.addEdge("II-2", "II-1", 1);
        grafo.addEdge("II-2", "F",1 );
        grafo.addEdge("II-1", "II-2",1 );
        grafo.addEdge("E", "B", 1);
        grafo.addEdge("E", "F", 1);
        grafo.addEdge("B", "E", 1);
        grafo.addEdge("B", "C", 1);
        grafo.addEdge("C", "B", 1);
        grafo.addEdge("C", "D", 1);
        grafo.addEdge("C", "C-1",1);
        grafo.addEdge("C", "Cancha", 1);
        grafo.addEdge("C", "F", 2);
        grafo.addEdge("D", "C-1",1);
        grafo.addEdge("D", "C", 1);
        grafo.addEdge("C-1", "D", 1);
        grafo.addEdge("C-1", "C", 1);
        grafo.addEdge("K", "A", 2);
        grafo.addEdge("K", "H", 1);
        grafo.addEdge("F", "II-2",1 );
        grafo.addEdge("F", "E", 1);
        grafo.addEdge("F", "C",2);
        grafo.addEdge("F", "G", 1);
        grafo.addEdge("G", "A", 1);
        grafo.addEdge("G", "F", 1);
        grafo.addEdge("G", "H", 1);
        grafo.addEdge("H", "K", 1);
        grafo.addEdge("H", "Cancha", 2);
        grafo.addEdge("H", "G", 1);
        grafo.addEdge("H", "I", 1);
        grafo.addEdge("Cancha", "H", 2);
        grafo.addEdge("Cancha", "C", 1);
        grafo.addEdge("I", "H", 1);
        grafo.addEdge("I", "J", 1);
        grafo.addEdge("J", "I", 1);
        grafo.addEdge("J", "J-1", 1);
        grafo.addEdge("J-1", "J", 1);
        
        
        floyd=new Floyd(grafo);
        
        floyd.caminoCorto();
    }
    
    
    public String shortest(String uno, String dos){
        String resultado="";
                    if(grafo.contains(uno)&&grafo.contains(dos)){
            resultado+="";
            if(grafo.getEdge(uno,dos)!=10000){
                resultado+="\nLa ruta es: "+uno;
                resultado+= floyd.regresarIntermedias(grafo.getIndex(uno), grafo.getIndex(dos));
                resultado+=", "+dos;
            }
        }
         return resultado;

    }
}
