package Problema_1;

public class MainPeluqueria {
    public static void main(String[] args) {
        // Se crearon instancias de cada elemento de la enumeración
        ServicioPeluquería corte = ServicioPeluquería.CORTE;
        ServicioPeluquería uñas = ServicioPeluquería.UÑAS;
        ServicioPeluquería tinte = ServicioPeluquería.TINTE;

        // Se muestra la descripción de cada servicio
        System.out.println("\n Descripción del servicio de corte:");
        corte.mostrarDescripcionServicio();
        System.out.println("\nDescripción del servicio de uñas:");
        uñas.mostrarDescripcionServicio();
        System.out.println("\nDescripción del servicio de tinte:");
        tinte.mostrarDescripcionServicio();
    }
}
