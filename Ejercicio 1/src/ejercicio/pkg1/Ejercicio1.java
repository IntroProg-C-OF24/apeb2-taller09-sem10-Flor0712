package ejercicio.pkg1;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);     
        System.out.println("Ingrese el numero de marcas que desee");
        int limMarcas = teclado.nextInt();
        String[] nomMarca = new String[limMarcas];
        for (int i = 0; i < limMarcas; i++) {
            System.out.println("Ingrese la marca ");
            nomMarca[i] = teclado.next();         
            if(nomMarca[i].startsWith("A")){
                i--;
            }else if (nomMarca[i].startsWith("C")){
                i--;
            }else if (nomMarca[i].startsWith("T")){
                i--;    
            }    
        }
        for(int i = 0; i < limMarcas; i++){
            System.out.println("Marca " + (i+1) + nomMarca[i]);
        }
    }       
}