package cuentas;

/**
 *Clase CCuenta que incorpora los metodos necesarios para la ejecucion del programa Main
 * @author Francisco linares
 */
public class CCuenta {

    

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
/**
 * Constructor vacío
 */
    public CCuenta()
    {
    }
/**
 * Constructor con los atributos nombre, cuenta, saldo y tipo de interes
     * @param nom   Nombre
     * @param cue   Cuenta
     * @param sal   Saldo
     * @param tipo  Tipo de interes
 */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
/**
 * Metodo estado, devuelve el saldo. 
     * @return Devuelve el saldo
 */
    public double estado()
    {
        return getSaldo();
    }
/**
 * Metodo ingresar, recibe como parámetro la cantidad y actualiza el saldo.Arroja una excepción si la cantidad es negativa.
 *
     * @param cantidad                  Cantidad a ingressar
     * @throws java.lang.Exception      Si cantidad es menor que cero
 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
/**
 * Método retirar, recibo como parametro la cantidad y actualiza el saldo.
 * Arroja una excepcion si la cantidad es negativa o no hay suficiente saldo.
 *
     * @param cantidad                  Cantidad a retirar
     * @throws java.lang.Exception      Si cantidad es menor que cero o el saldo es bajo
 */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * Getter para el atributo Nombre
     * @return      Nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter para el atributo Nombre
     * @param nombre    Nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Getter para el atributo Cuenta
     * @return      Cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Setter para el atributo Cuenta
     * @param cuenta    Cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Getter para el atributo Saldo
     * @return      Saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Setter para el atributo Saldo
     * @param saldo     Saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Getter para el atributo TipoInteres
     * @return      Tipo de Interes
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Setter para el atributo TipoInteres
     * @param tipoInterés       Tipo de interés
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
