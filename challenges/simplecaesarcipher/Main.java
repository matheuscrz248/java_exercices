package challenges.simplecaesarcipher;

public class Main {

    /*
    Dada uma String e um número inteiro 'n', retorne uma nova String com as letras deslocadas 'n' posições.
    Entrada	/ Saída
    texto = "abc", deslocamento = 3	/ "def"
    */

    public static void main(String[] args) {

        String text = "abc";
        int shift = 3;

        char[] vect = text.toCharArray();

        for (char c : vect) {

            char letter;

            if ((c + shift) <= 122) {
                letter = ((char) (c + shift));
            } else {
                letter = 'z';
            }

            System.out.print(letter);

        }

    }
}
