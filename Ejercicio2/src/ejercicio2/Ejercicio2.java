package ejercicio2;
public class Ejercicio2 {
    public static void main(String[] args) {
         int[] arrnum = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        int mediaArit, suma = 0, num = 13;
        for (int i = 0; i < num; i++) {
            suma = suma + arrnum[i];
        }
        mediaArit = (suma/num);
        System.out.println("Media Aritmetica: " + mediaArit);
        for (int i = 0; i < num; i++) {
            if (arrnum[i] > mediaArit) {
                System.out.println("El numero que esta encima de la media artimetica es: ");
                System.out.println(arrnum[i]);
            }else
              if (arrnum[i] < mediaArit) {
                System.out.println("El numero que esta debajo de la media artimetica es: ");
                System.out.println(arrnum[i]);
            }
        }
    }
    
}
