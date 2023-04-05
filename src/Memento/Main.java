package Memento;

public class Main {
    public static void main(String[] args) {
        EditorTexto editor = new EditorTexto("Hola mundo");

        editor.agregarTexto(", esto es un ejemplo.");
        System.out.println(editor.getTexto());
        editor.agregarTexto(" Agregando más texto.");
        System.out.println(editor.getTexto()); // Hola mundo, esto es un ejemplo. Agregando más texto.

        editor.borrarTexto(7);
        System.out.println(editor.getTexto()); // Hola mundo, esto es un ejemplo.

        editor.deshacer();
        System.out.println(editor.getTexto()); // Hola mundo, esto es un ejemplo. Agregando más texto.

        editor.deshacer();
        System.out.println(editor.getTexto()); // Hola mundo, esto es un ejemplo.

        editor.rehacer();
        System.out.println(editor.getTexto()); // Hola mundo, esto es un ejemplo. Agregando más texto.

        editor.agregarTexto(" Y agregando aún más texto.");
        System.out.println(editor.getTexto()); // Hola mundo, esto es un ejemplo. Agregando más texto. Y agregando aún más texto.

        editor.rehacer();
        System.out.println(editor.getTexto()); // Hola mundo, esto es un ejemplo. Agregando más texto. Y agregando aún más texto.
    }
}
