package Texto;

import java.util.HashMap;

public class ListaTexto {

    HashMap<String, Integer> leLista = new HashMap<>();
    HashMap<String, Integer> aux = new HashMap<>();
    int texto01,texto02,texto03,texto04,texto05,texto06,texto07,texto08,texto09,texto10;

    public void addLista(String a, int b){

        if (b == 1){
            leLista.put(a,texto01);
        }
        if (b == 2){
            leLista.put(a,texto02);
        }
        if (b == 3){
            leLista.put(a,texto03);
        }
        if (b == 4){
            leLista.put(a,texto04);
        }
        if (b == 5){
            leLista.put(a,texto05);
        }
        if (b == 6){
            leLista.put(a,texto06);
        }
        if (b == 7){
            leLista.put(a,texto07);
        }
        if (b == 8){
            leLista.put(a,texto08);
        }
        if (b == 9){
            leLista.put(a,texto09);
        }
        if (b == 10){
            leLista.put(a,texto10);
        }
    }

    public void remove(String a, int b){
        if (b == 1){
            leLista.remove(a,texto01);
        }
        if (b == 2){
            leLista.remove(a,texto02);
        }
        if (b == 3){
            leLista.remove(a,texto03);
        }
        if (b == 4){
            leLista.remove(a,texto04);
        }
        if (b == 5){
            leLista.remove(a,texto05);
        }
        if (b == 6){
            leLista.remove(a,texto06);
        }
        if (b == 7){
            leLista.remove(a,texto07);
        }
        if (b == 8){
            leLista.remove(a,texto08);
        }
        if (b == 9){
            leLista.remove(a,texto09);
        }
        if (b == 10){
            leLista.remove(a,texto10);
        }
    }
    public void listarTodas(String b){
        for (int a:leLista.values()) {
            System.out.println(b);
        }
    }



}
