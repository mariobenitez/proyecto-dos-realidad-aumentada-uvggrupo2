package com.wikitude.samples.utils.urllauncher;

import java.io.*;

public class Archivo{
	   
    //Atributos
    File archivo;
    FileReader fr;
    BufferedReader br;
    FileWriter fw;
    PrintWriter pw;
    Grafo grafo;

    //Constructor
    public Archivo(){
        grafo = new Grafo();
    }
    
    public Grafo arregloNombres() throws IOException{
    fr = new FileReader (archivo);
    br = new BufferedReader(fr);
    String linea;
    while((linea=br.readLine())!=null){
        String[] tmp;
        tmp=linea.split(" ");
        grafo.add(tmp[0]);
        grafo.add(tmp[1]);
    }
        return grafo;
    }

    //Crea el objeto para leer el file
    public void obtenerArchivo(String direccion) throws FileNotFoundException{
       archivo=new File(direccion); 
    }  
    
    //Escribe lo que se encuentra en el archivo
    public void write(String cadena) throws IOException{
        fw = new FileWriter(archivo);
        pw = new PrintWriter(fw);
        pw.println(cadena);
    
    }
    
    //Metodo encargado de leer las lineas del archivo de texto y colocarlas en el grafo
    public Grafo matrizCostos() throws IOException{
        fr = new FileReader (archivo);
        br = new BufferedReader(fr);
        String linea;

        while((linea=br.readLine())!=null){
            String[] tmp;
            tmp=linea.split(" ");
            grafo.addEdge(tmp[0], tmp[1], tmp[2]);
        }
        return grafo;
    }
}
