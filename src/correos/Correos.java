package correos;

import javax.swing.JOptionPane;

/**
 *
 * @author acabezaslopez
 */
public class Correos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Buzon carta = new Buzon();
        Correo mail = new Correo();
        int op;
        do {
            System.out.println("***********-MENÚ-***********\n1)Número de correos recibidos\n2)Engade\n3)Elemento no leídos"
                    + "\n4)Primer elemento sin leer\n5)Muestra el elemento con la posición[]?\n6)Borrar elemento_posicion[]?"
                    + "\n7)Salir");
            op = Integer.parseInt(JOptionPane.showInputDialog("Elige una opción :"));
            switch (op) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Total de Correos:  " + carta.numeroDeCorreos());
                    break;
                case 2:
                    carta.engade(new Correo(JOptionPane.showInputDialog("Inserte Mensaje"), false));
                    break;
                case 3:
                    String men = null;
                    if (carta.porLer() == true) {
                        men = "Sí, hay mensajes pendientes";
                    } else {
                        men = "No hay mensajes pendientes";
                    }
                    JOptionPane.showMessageDialog(null, "Correos por ler:  " + men);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Primeiro Correo non Lido:  " + carta.amosaPrimerNoLeido());
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, carta.amosa(Integer.parseInt(JOptionPane.showInputDialog("Inserte la posición del Correo a mostrar :")) - 1));
                    break;
                case 6:
                    carta.elimina(Integer.parseInt(JOptionPane.showInputDialog("Inserte la posición del Correo a Eliminar")));
                    break;

                case 7:
                    System.exit(0);
                    break;

            }
        } while (op <= 7);

    }

}
