package com.wikitude.samples.utils.urllauncher;

import java.util.Vector;

public class Grafo<V,E>{

    //Atributos
    private Vector vertices = new Vector();
    private int[][] arcos= new int [25][25];
    
    //Constructor
    public Grafo(){        
        for(int i=0;i<25;i++){
            for(int j=0;j<25;j++){
                if(i==j){
                    arcos[i][j]=0;
                }
                else{
                    arcos[i][j]=10000;
                }
            }
        }
    }
    
    //Agrega un vertice
    public void add(V label){
        if(!vertices.contains(label)){
            vertices.add(label);
        }        
    }

    //Agrega una arista
    public void addEdge(V vtx1, V vtx2, E label) {
        int i = vertices.indexOf(vtx1);
        int j = vertices.indexOf(vtx2);        
        String tmp = ""+label;
        int peso = Integer.parseInt(tmp);
        arcos[i][j]=peso;
    }
    
    //Muestra la matriz
    public void show(){
        for(int a=0;a<vertices.size();a++){
            for(int b=0;b<vertices.size();b++){
                System.out.print(""+arcos[a][b]+" ");
            }
            System.out.println("");
        }
    }
    
    //Devuelve el tamaño del grafo
    public int size(){
        return vertices.size();
    }
    
    //Obtiene arista
    public int getEdge(V label1, V label2){
        return arcos[vertices.indexOf(label1)][vertices.indexOf(label2)];
    }
    
    //Obtiene vertice
    public V get(int label){
        
        return (V)vertices.get(label);
        
    }
    
    //Obtiene donde se encuentra un vertice
    public int getIndex(V label){
        return vertices.indexOf(label);
    }
    
    //Determina si el grafo contiene el vertice
    public boolean contains(V label){
        return vertices.contains(label);
    }
}
