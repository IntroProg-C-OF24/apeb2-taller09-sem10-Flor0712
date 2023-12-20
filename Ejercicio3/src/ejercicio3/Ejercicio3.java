package ejercicio3;
public class Ejercicio3 {
    public static void main(String[] args) {
        double[] nota = {10, 10, 9.1, 7, 6.1, 4, 8};
        String[] estudiantes = {"Kimberly Gonzalez", "Mark Hogan", "Teresa Martinez", "Julia Johnson", "Mark Cook", "Jennifer Manning", "Juan Vasquez"};
        String[] promediosCual = new String[7];
        promediosCual[0] = "Promedio Regular";
        promediosCual [1] = "Promedio Bueno";
        promediosCual [2] = "Promedio Sobresaliente";
        for (int i = 0; i < nota.length; i++) {
            if (nota[i]>=9 && nota[i] <= 10){
                System.out.println(estudiantes[i] + " : "  + nota[i] + " " + promediosCual[2]);
            }
            if (nota[i]>=6 && nota[i]<= 8.9){
                System.out.println(estudiantes[i] + " : "  + nota[i] + " " + promediosCual[1]);
            }
                if (nota[i]<5.9){
                System.out.println(estudiantes[i] + " : "  + nota[i] + " " + promediosCual[0]);
            }
        }
    }  
}
