//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Date;

class Empleado {
    String nombre;
    Date birthDate;

    Empleado(String name, Date birthDate) {
        this.nombre = name;
        this.birthDate = birthDate;
    }

    public String toString() {
        String var10000 = this.nombre;
        return "Empleado: " + var10000 + " (nacido en 19" + this.birthDate.getYear() + ")";
    }
}
