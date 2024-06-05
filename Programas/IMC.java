package Programas;

public class IMC {
    public static void main(String[] args) {
        double IMC = 27;
        System.out.println("IMC: " + IMC);
        System.out.println("............");

        if (IMC < 18.5) {
            System.out.println("IMC Bajo");
        } else if (IMC >= 18.5 && IMC <= 24.9) {
            System.out.println("--> IMC Normal");
        } else if (IMC >= 25 && IMC <= 29.9) {
            System.out.println("--> IMC Sobrepeso");
        } else if (IMC >= 30 && IMC <= 34.9) {
            System.out.println("--> IMC Obesidad I");
        } else if (IMC >= 35 && IMC <= 39.9) {
            System.out.println("--> IMC Obesidad II");
        } else if (IMC >= 40 && IMC <= 49.9) {
            System.out.println("--> IMC Obesidad III");
        } else if (IMC >= 50) {
            System.out.println("--> IMC Obesidad IV");
        }
    }
}