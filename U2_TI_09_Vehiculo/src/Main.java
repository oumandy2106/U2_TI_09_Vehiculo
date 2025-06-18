public class Main {
    public static void main(String[] args) {
        Garaje garage = new Garaje (4);
        Coche jetta = new Coche ("m0T0", "Volkswagen", 4);
        Motocicleta italika = new Motocicleta ("carr0", "Mortalica", true);
        Coche ruta = new Coche ("ruta13", "Mercedes", 2);
        Coche rutaSalud = new Coche ("rut4S4luD", "Pullman", 3);

        garage.estacionar(jetta);
        garage.estacionar(italika);
        garage.estacionar(ruta);
        garage.estacionar(rutaSalud);
        garage.retirar("carr0");

        System.out.println("Los carros estacionados son: " + garage.contarVehiculos());
        }

    }