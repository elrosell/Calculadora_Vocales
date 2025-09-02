package com.example.vocales;

public class Clasesita {
    private String texto;

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int vocalA(){
        int cuantas = texto.length();
        int as =0;
        for (int i =0; i< cuantas; i++)
            if (texto.charAt(i) == 'a' || texto.charAt(i) == 'A'
                    || texto.charAt(i) == 'á' || texto.charAt(i) == 'Á')
                ++as;
        return as;
    }
    public int vocalE(){
        int cuantas = texto.length();
        int es =0;
        for (int i =0; i< cuantas; i++)
            if (texto.charAt(i) == 'e' || texto.charAt(i) == 'E'
                    || texto.charAt(i) == 'é' || texto.charAt(i) == 'É')
                ++es;
        return es;
    }
    public int vocalI(){
        int cuantas = texto.length();
        int is =0;
        for (int i =0; i< cuantas; i++)
            if (texto.charAt(i) == 'i' || texto.charAt(i) == 'I'
                    || texto.charAt(i) == 'í' || texto.charAt(i) == 'Í')
                ++is;
        return is;
    }
    public int vocalO(){
        int cuantas = texto.length();
        int os =0;
        for (int i =0; i< cuantas; i++)
            if (texto.charAt(i) == 'o' || texto.charAt(i) == 'O'
                    || texto.charAt(i) == 'ó' || texto.charAt(i) == 'Ó')
                ++os;
        return os;
    }
    public int vocalU(){
        int cuantas = texto.length();
        int us =0;
        for (int i =0; i< cuantas; i++)
            if (texto.charAt(i) == 'u' || texto.charAt(i) == 'U'
                    || texto.charAt(i) == 'ú' || texto.charAt(i) == 'Ú')
                ++us;
        return us;
    }
}
