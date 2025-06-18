public class Garaje {

    private Vehiculo[] espacios;

    Garaje(int numEspacios) {
        espacios = new Vehiculo[numEspacios];
    }

    public boolean estacionar(Vehiculo vehiculo) {
        for (int i = 0; i < espacios.length; i++) {
            if (espacios[i] == null) {
                espacios[i] = vehiculo;
                return true;
            }
        }
        return false;
    }

    public boolean retirar(String placa) {
        for (int i = 0; i < espacios.length; i++) {
            if (espacios[i] != null && espacios[i].getPlaca().equals(placa)) {
                espacios[i] = null;
                return true;
            }
        }
        return false;
    }

    public int contarVehiculos() {
        int contar = 0;
        for (int i = 0; i < espacios.length; i++) {
            if (espacios[i] != null) {
                contar++;
            }
        }
        return contar;
    }
}