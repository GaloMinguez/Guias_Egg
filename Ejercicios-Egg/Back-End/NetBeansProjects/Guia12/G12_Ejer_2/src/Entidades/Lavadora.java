package Entidades;

public class Lavadora extends Electrodomestico {

    private Double carga;

    public Lavadora() {
    }

    public Lavadora(Double carga) {
        this.carga = carga;
    }

    public Lavadora(Electrodomestico electro, Double carga) {
        this.peso = electro.peso;
        this.precio = electro.precio;
        this.color = electro.color;
        this.consumoEnergetico = electro.consumoEnergetico;
        this.carga = carga;
    }

    public Lavadora(Double carga, Integer precio, String color, Character consumoEnergetico, Double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public void precioFinal() {
        if(carga >= 30){
            super.setPrecio(super.getPrecio()+500);
        }
    }

    @Override
    public String toString() {
        return "Lavadora{" + "carga=" + carga + super.toString() + '}';
    }

}
