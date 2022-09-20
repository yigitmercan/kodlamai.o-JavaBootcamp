public class Main {

    public static void main(String[] args) {

        char grade = 'F';

        switch (grade) {

            case 'a':
            case 'A':
                System.out.println("Mükemmel : Geçtiniz");
                break;

            case 'B':
                System.out.println("Mükemmel : Geçtiniz");
                break;

            case 'C':
                System.out.println("iyi geçtiniz");
                break;

            case 'D':
                System.out.println("fena değil, geçtiniz");
                break;

            case 'F':
                System.out.println("maalesef kaldınız");
                break;


            default:
                System.out.println("Geçersiz bir not girdiniz");


        }

    }
}