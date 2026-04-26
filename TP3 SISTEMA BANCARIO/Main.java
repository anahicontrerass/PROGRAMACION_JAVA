import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Cuenta> cuentas = new ArrayList<>();
        cuentas.add(new CajaAhorro("Contreras Anahi", 200000));
        cuentas.add(new CuentaCorriente("Vera Celeste", 450000));
        cuentas.add(new CuentaInversion("Morales Natalia", 300000, 0.05));

        System.out.println("===== SALDOS ANTES =====");
        for (Cuenta c : cuentas){
            System.out.println(c);
        }
        for (Cuenta c: cuentas){
            c.aplicarComisionInteres();
        }
        System.out.println("\n===== SALDOS DESPUES =====");
        for (Cuenta c: cuentas){
            System.out.println(c);
        }
    }
}
