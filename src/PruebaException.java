import javax.swing.*;

public class PruebaException {
    public static void main(String[] args) {
        int arreglo[] = new int[3];
        int contador =0;

        try{
            while(true){
                arreglo[contador++] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero :"));
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Todo listo");
        }catch (NumberFormatException e){
            System.out.println("Ingresaste una letra en vez de un numero, error 404");
        }finally{
            System.out.println("Fin del programa");
        }


    }
}
