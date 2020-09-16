package com.example.activida3;

public class Datos {
    private int id;
    private int Imagen;

    public Datos(int id, int imagen) {
        this.id = id;
        Imagen = imagen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImagen() {
        return Imagen;
    }

    public void setImagen(int imagen) {
        Imagen = imagen;
    }
}
