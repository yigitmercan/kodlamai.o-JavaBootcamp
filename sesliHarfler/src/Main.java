public class Main {

    public static void main(String[] args) {

        char harf = 'B';

        switch (harf) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Seçtiğiniz harf sesli kalın seslidir");
                break;

            case 'E':
            case 'İ':
            case 'Ö':
            case 'Ü':
                System.out.println("Seçtiğiniz harf sesli ince seslidir.");
                break;

            default:
                System.out.println("Seçtiğiniz harf sesli harf değildir");

        }

    }
}