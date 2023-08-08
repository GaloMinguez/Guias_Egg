package Servicios;


public class CadenaServicio {
    
   public void mostrarVocales(){
       
       
       
   }
    
}


//public class ServiciosCadena {
//
//    public Cadena crear(Scanner xd) {
//        Cadena cadena = new Cadena();
//        System.out.println("Ingrese una frase: ");
//        cadena.setFrase(xd.nextLine());
//        cadena.setLongitud(0);
//        return cadena;
//
//    }
//
//    public void mostrarVocales(Scanner xd, Cadena cadena) {
//        int contadorVocal = 0;
//        for (int i = 0; i < cadena.getFrase().length(); i++) {
//            String letra = cadena.getFrase().toUpperCase().trim();
//
//            if (letra.charAt(i) == 'A' || letra.charAt(i) == 'E' || letra.charAt(i) == 'I' || letra.charAt(i) == 'O' || letra.charAt(i) == 'U') {
//                contadorVocal++;
//            }
//
//        }
//        System.out.println("La  cantidad de vocales encontradas en la frase son " + contadorVocal);
//    }
//
//    public void invertirFrase(Scanner xd, Cadena cadena) {
//        System.out.println("       ");
//        for (int i = cadena.getFrase().length() - 1; i >= 0; i--) {
//            System.out.print(cadena.getFrase().charAt(i));
//
//        }
//    }
//
//    public void letraRepetida(Scanner xd, Cadena cadena) {
//        System.out.println("      ");
//        int contadorLetra = 0;
//        boolean bandera = false;
//        String letra;
//        do {
//            System.out.println("Ingrese una letra de la palabra ingresada: ");
//            letra = xd.next();
//            if (letra.length() == 1) {
//                bandera = true;
//            } else {
//                System.out.println("Te la mandaste...");
//            }
//        } while (!bandera);
//
//        for (int i = 0; i < cadena.getFrase().length(); i++) {
//            char palabra = cadena.getFrase().charAt(i);
//
//            if (letra == null ? Character.toString(palabra) == null : letra.equals(Character.toString(palabra))) {
//                contadorLetra++;
//            }
//
//        }
//        System.out.println("La letra " + letra + " se encuentra " + contadorLetra + " veces en la frase.");
//    }
//
//    public void compararLongitud(Cadena cadena) {
//        Scanner xd = new Scanner(System.in).useDelimiter("\n");
//        System.out.println("Ingrese una palabra");
//        String palabra = xd.nextLine();
//        if (cadena.getFrase().equals(palabra)) {
//            System.out.println("La frase " + palabra + " y la frase " + cadena.getFrase() + " son iguales");
//        } else {
//            System.out.println("La frase " + palabra + " y la frase " + cadena.getFrase() + "  NO son iguales");
//        }
//    }
//
//    public void unirFrase(Cadena cadena) {
//        Scanner xd = new Scanner(System.in).useDelimiter("\n");
//        System.out.println("Ingrese una nueva frase: ");
//        String frase = " " + xd.nextLine();
//
//        cadena.setFrase(cadena.getFrase().concat(frase));
//        System.out.println(" La nueva fraase es " + cadena.getFrase());
//    }
//
//    public void reemplazarLetra(Cadena cadena) {
//
//        String letra;
//        Scanner xd = new Scanner(System.in);
//        do {
//            System.out.println("Ingrese una letra de la palabra ingresada: ");
//            letra = xd.next();
//
//        } while (letra.length() != 1);
//
//        for (int i = 0; i < cadena.getFrase().length(); i++) {
//            if (cadena.getFrase().substring(i, i + 1).equalsIgnoreCase("a")) {
//                cadena.setFrase(cadena.getFrase().replace("a", letra));
//            }
//
//        }
//        System.out.println(cadena.getFrase());
//
//    }
//
//    public boolean contieneLetra(Cadena cadena) {
//        Scanner xd = new Scanner(System.in);
//        boolean red = false;
//
//        System.out.println("Ingrese la letra a buscar: ");
//
//        char letra = xd.next().charAt(0);
//        for (int i = 0; i < cadena.getFrase().length(); i++) {
//            if (cadena.getFrase().substring(i, i + 1).equalsIgnoreCase(Character.toString(letra))) {
//                red = true;
//            }
//
//        }
//        System.out.println(red);
//        return red;
//    }
//}