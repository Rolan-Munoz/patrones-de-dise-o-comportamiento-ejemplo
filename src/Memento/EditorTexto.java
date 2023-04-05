package Memento;

import java.util.ArrayList;
import java.util.List;

public class EditorTexto {
    private String texto;
    private Memento estadoActual;
    private List<Memento> estadosAnteriores = new ArrayList<>();
    private List<Memento> estadosPosteriores = new ArrayList<>();

    public EditorTexto(String texto) {
        this.texto = texto;
        this.estadoActual = new Memento(texto);
    }

    public void agregarTexto(String textoNuevo) {
        estadosAnteriores.add(estadoActual);
        estadoActual = new Memento(texto);
        texto += textoNuevo;
    }

    public void borrarTexto(int longitud) {
        estadosAnteriores.add(estadoActual);
        estadoActual = new Memento(texto);
        texto = texto.substring(0, texto.length() - longitud);
    }

    public void deshacer() {
        if (!estadosAnteriores.isEmpty()) {
            estadosPosteriores.add(estadoActual);
            estadoActual = estadosAnteriores.remove(estadosAnteriores.size() - 1);
            texto = estadoActual.getTexto();
        }
    }

    public void rehacer() {
        if (!estadosPosteriores.isEmpty()) {
            estadosAnteriores.add(estadoActual);
            estadoActual = estadosPosteriores.remove(estadosPosteriores.size() - 1);
            texto = estadoActual.getTexto();
        }
    }

    public String getTexto() {
        return texto;
    }
}

