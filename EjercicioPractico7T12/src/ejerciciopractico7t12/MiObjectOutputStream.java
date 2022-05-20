/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciopractico7t12;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

//Esta clase hereda sus propiedades de ObjectOutputStream
public class MiObjectOutputStream extends ObjectOutputStream {

    //Sobreescribimos el método que crea la cabecera
    @Override
    protected void writeStreamHeader() throws IOException {
        //No hacer nada
    }

    //Constructores
    public MiObjectOutputStream() throws IOException {
        super();
    }

    public MiObjectOutputStream(OutputStream out) throws IOException {
        super(out);
    }
}
