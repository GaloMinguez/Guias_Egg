package Entidades;

import java.util.Scanner;

public class Electrodomestico {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    protected Integer precio = 1000;
    protected String color;
    protected Character consumoEnergetico;
    protected Double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(Integer precio, String color, Character consumoEnergetico, Double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Character getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(Character consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public char comprobarConsumoEnergetico(char letra) {
        letra = Character.toUpperCase(letra);
        if (letra >= 'A' && letra <= 'F') {
            return letra;
        } else {
            System.out.println("NO ingreso un consumo VALIDO se seteara el consumo en F por defecto");
            return 'F';
        }
    }

    public String comprobarColor(String color) {
        color = color.toLowerCase();
        if (color.equals("blanco") || color.equals("negro") || color.equals("rojo") || color.equals("azul") || color.equals("gris")) {
            return color;
        } else {
            System.out.println("NO ingreso un color VALIDO se setearael color en BLANCO por defecto");
            return "blanco";
        }
    }

    public Electrodomestico crearElectrodomestico(Electrodomestico electro) {
        System.out.println("ingrese las caracteristicas del electrodomestico: ");
        String colo;
        System.out.print("COLOR: ");
        colo = leer.next();
        electro.setColor(comprobarColor(colo));
        char letra;
        System.out.print("CONSUMO (A/F): ");
        letra = (char) leer.next().charAt(0);
        electro.setConsumoEnergetico(comprobarConsumoEnergetico(letra));
        double pesor;
        System.out.print("PESO (Kg): ");
        peso = leer.nextDouble();
        electro.setPeso(peso);

        return electro;
    }

    public void precioFinal() {
        switch (this.consumoEnergetico) {
            case 'A' ->
                this.precio += 1000;
            case 'B' ->
                this.precio += 800;
            case 'C' ->
                this.precio += 600;
            case 'D' ->
                this.precio += 500;
            case 'E' ->
                this.precio += 300;
            default ->
                this.precio += 100;
        }

        if (this.peso >= 1 && this.peso <= 19) {
            this.precio += 100;
        } else if (this.peso >= 20 && this.peso <= 49) {
            this.precio += 500;
        } else if (this.peso >= 50 && this.peso <= 79) {
            this.precio += 800;
        } else {
            this.precio += 1000;
        }
    }

    @Override
    public String toString() {
        return  "-- precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso;
    }

}
