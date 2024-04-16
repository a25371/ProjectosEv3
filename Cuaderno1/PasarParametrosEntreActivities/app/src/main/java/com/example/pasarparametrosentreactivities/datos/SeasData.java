package com.example.pasarparametrosentreactivities.datos;

import com.example.pasarparametrosentreactivities.beans.Usuario;

public class SeasData {

    private static Usuario usuario;

    public static Usuario getUsuario() {
        return usuario;
    }

    public static void setUsuario(Usuario usuario) {
        SeasData.usuario = usuario;
    }
}
