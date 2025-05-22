package com.campusdual.classroom;


import java.util.ArrayList;
import java.util.List;

public class Exercise07 {

    public static void main(String[] args) {
        positionInAList(13);
        sumFirstNaturalNumbers(10);
        showFirstNaturalNumbers(10);
    }

    //TODO ↓
    // ESTE MÉTODO NO ES NECESARIO HACERLO POR PARTE DE LOS ALUMNOS
    // Crear una List<Integer> con los números del 10 al 1. Luego buscar el elemento
    // que se le pasa por parámetro.
    // Si lo encuentra, que imprima el siguiente mensaje → El elemento X se encuentra en la posición: Y
    // Si NO lo encuentra, que imprima el siguiente mensaje → El elemento X no se encuentra en la lista.
    public static void positionInAList(int num) {
        List<Integer> listaEnteros = new ArrayList<>();
        listaEnteros.add(10);
        listaEnteros.add(9);
        listaEnteros.add(8);
        listaEnteros.add(7);
        listaEnteros.add(6);
        listaEnteros.add(5);
        listaEnteros.add(4);
        listaEnteros.add(3);
        listaEnteros.add(2);
        listaEnteros.add(1);

        int index=-1;
        for (int i = 0; i < listaEnteros.size(); i++) {
            if(listaEnteros.get(i)==num){
                index=i;
                break;
            }
        }
        if(index==-1){
            System.out.println(num+" no se encuentra en la lista.");
        }else{
            System.out.println(num+" se encuentra en la posición: "+index);
        }

    }

    //TODO ↓
    // Que imprima como mensaje la suma de los primeros N números positivos
    public static void sumFirstNaturalNumbers(int num) {
        int sum=0;
        for (int i = 1; i <= num ; i++) {
            sum += i;
        }
        System.out.println(sum);


    }

    //TODO ↓
    // Que imprima por pantalla los N primeros números positivos
    public static void showFirstNaturalNumbers(int num) {
        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }

    }

}
