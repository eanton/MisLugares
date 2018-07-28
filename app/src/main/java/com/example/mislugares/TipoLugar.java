package com.example.mislugares;

public enum TipoLugar {
    OTROS("Otros", R.mipmap.otros),
    RESTAURANTE("Restaurante", R.mipmap.restaurante),
    BAR("Bar", R.mipmap.bar),
    COPAS("Copas", R.mipmap.copas),
    ESPECTACULO("Espectáculo", R.mipmap.espectaculos),
    HOTEL("Hotel", R.mipmap.hotel),
    COMPRAS("Compras", R.mipmap.compras),
    EDUCACION("Educación", R.mipmap.educacion),
    DEPORTE("Deporte", R.mipmap.deporte),
    NATURALEZA("Naturaleza", R.mipmap.naturaleza),
    GASOLINERA("Gasolinera", R.mipmap.gasolinera);

    private final String texto;
    private final int recurso;

    TipoLugar(String texto, int recurso) {
        this.texto = texto;
        this.recurso = recurso;
    }

    public String getTexto() { return texto; }
    public int getRecurso() { return recurso; }

    public static String[] getNombres() {
        String[] resultado = new String[TipoLugar.values().length];
        for (TipoLugar tipo : TipoLugar.values()) {
            resultado[tipo.ordinal()] = tipo.texto;
        }
        return resultado;
    }


}