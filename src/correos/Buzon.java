package correos;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author acabezaslopez
 */
public class Buzon {

    private ArrayList<Correo> mails = new ArrayList<>();

    public Buzon() {
    }

    // int numeroDeCorreos(), que calcula cantos correos hai no buzon de correo
    public int numeroDeCorreos() {
        mails.add(0, new Correo("qwerty", true));
        mails.add(1, new Correo("asdfg", false));
        return mails.size();
    }

    // void engade (Correo c), que engade c ao buzon
    public void engade(Correo c) {

        mails.add(c);
    }

// boolean porLer(), que determina se quedan correos por ler
    public boolean porLer() {
        boolean si = false;
        for (int i = 0; i < mails.size(); i++) {
            if (mails.get(i).confirmacion != true) {
                si = true;
            }
        }
        return si;
    }

// String amosaPrimerNoLeido(), que amostra o primeiro correo non lido
    public String amosaPrimerNoLeido() {
        String var = null;
        for (int i = 0; i < mails.size(); i++) {
            if (mails.get(i).confirmacion != true) {
                var = mails.get(i).getCorreo();
                // mails.get(i).confirmacion = true;
            }
            mails.get(i).confirmacion = true;
            break;
        }
        if (var == null) {
            return "Todos los correos leidos";
        } else {
            return var;
        }
    }

// String amosa(int k), que amostra o correo k-ésimo, fora lido ou non
    public String amosa(int k) {
        if (k > mails.size()) {
            System.out.println("Correo Inexistente");
        } else {
            mails.get(k).confirmacion = true;
        }
        return mails.get(k).getCorreo();
    }

// void elimina(int k), que elimina o correo k-ésimo.
    public void elimina(int k) {
        if (k > mails.size()) {
            System.out.println("Correo Inexistente");
        } else {
            mails.remove(k - 1);
        }
    }

}
/*

public class Buzon {

    private boolean leido = false;
    private boolean todosLeidos = true;
    private String contenido;
    private String primerNoLeido;
    Correo objCorreo = new Correo();

    public int numeroDeCorreos(ArrayList buz) {

        return buz.size();
    }

    public void añade(Correo c, ArrayList<Correo> buzo) {

        String cuerpo = JOptionPane.showInputDialog("Cuerpo del correo");
        if (JOptionPane.showConfirmDialog(null, "Quieres marcar como leido el correo?", "WARNING",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            leido = true;
        } else {
            leido = false;
        }

        c = new Correo(cuerpo, leido);

        buzo.add(c);
    }

    public boolean porLeer(ArrayList<Correo> correos) {

        for (int i = 0; i < correos.size(); i++) {

            todosLeidos = true;
            if (correos.get(i).isLeido() == false) {

                todosLeidos = false;
            }
        }
        return todosLeidos;

    }

    public String muestraPrimerNoLeido(ArrayList<Correo> buzon) {
        
        for (int i = 0; i < buzon.size(); i++) {
            
            if (buzon.get(i).isLeido() == false){  
                primerNoLeido = buzon.get(i).getContenido();     
            }    
        }
        return primerNoLeido;
    }

    public String muestra(int k, ArrayList<Correo> buz) {

        k = k - 1;

        for (int i = 0; i < buz.size(); i++) {       
            if (k == i){      
                contenido = buz.get(i).getContenido();
            }
        } 
        return contenido;
    }

    public void elimina(ArrayList borrar) {
        int corr = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el correo que quiere borrar"));

        corr = corr - 1;
        for (int i = 0; i < borrar.size(); i++) {
            if (corr == i) {
                borrar.remove(i);
            }
        }


 */
