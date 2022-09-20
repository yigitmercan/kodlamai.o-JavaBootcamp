public class Main {

    public static void main(String[] args) {

        String[] ogrenciler = new String[4];
        ogrenciler[0] = "Engin";
        ogrenciler[1] = "Yiğit";
        ogrenciler[2] = "Zeynep";
        ogrenciler[3] = "Sena";
        //ogrenciler[4] = "Ali";

        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }

        for (String ogrenci : ogrenciler) {
            System.out.println(ogrenci);
        }

    }
}