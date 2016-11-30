
public class Caesar {
    static String cypher(String s, int delta) {
        borralosiguiente
        StringBuilder cifrado = new StringBuilder(s.length());
        int caracter;
        for (int i=0; i<s.length(); i++){
            caracter = (int) s.charAt(i); //Devuelve el carácter primera posición 0.
            if((caracter>=65) && (caracter<=122)){
                caracter -= 32; //vuelve al caracter 90 (z)
            }
            if((caracter>=65) && (caracter<=90)){
                caracter += delta;
                while (caracter>90){
                    caracter -= 90;
                    caracter += 64;
                }
            }
            cifrado.append((char) caracter); //caracter de Caesar
        }
        s = cifrado.toString(); //Devuelve una cadena de texto (String)
        return s.toUpperCase(); //Pasamos a mayúsculas
    }

    static String decypher(String s, int delta) {
        return null;
    }

    static String magic(String s) {
        return null;
    }
}
