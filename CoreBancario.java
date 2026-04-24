import java.util.*; 
 
/** 
 * Sistema de Gestión de Transacciones TechPay 
 * Versión 1.0 - Módulo de Pruebas 
 */ 
public class CoreBancario { 
    private double balance; 
    private List<String> historial; // DEFECTO DATOS: Lista no inicializada 
 
    // MÓDULO DE TRANSACCIONES 
    public void ejecutarTransferencia(double monto, String destino) { 
        // DEFECTO LÓGICO: No verifica si el balance es suficiente para el monto 
        // DEFECTO INTERFAZ: No valida si el destino es nulo o vacío 
        balance -= monto; 
        historial.add("Transferencia a " + destino + ": " + monto); 
    } 
 
    // MÓDULO DE SEGURIDAD 
    public boolean validarAcceso(String pin) { 
        // DEFECTO LÓGICO: Validación débil (solo verifica longitud de 4 dígitos) 
        if (pin.length() == 4) { 
            return true; 
        } 
        return false; 
    } 
 
    /** 
 
4. Actividad A: Diseño del Tablero de Métricas (Modelo GQM) 
Utilizando la metodología vista en clase, proponga 4 métricas de calidad. A continuación, se 
presenta un ejemplo guía que debe incluir en su tabla. Usted debe completar las 3 métricas 
adicionales restantes. 
Nivel GQM Ejemplo Guía (Resuelto) Propuesta 
2 
Propuesta 
3 
Propuesta 
4 
Meta (Goal) G1: Mejorar la fiabilidad de las 
transacciones. 
   
Pregunta 
(Question) 
¿Qué tan propenso a errores de 
ejecución es el código? 
   
Métrica 
(Metric) 
Densidad de Defectos: 
(Errores / KLOC). 
   
 
  
     * Aplica un interés del 1% anual sobre el saldo actual. 
     * DEFECTO DOCUMENTACIÓN: El comentario indica 1%, pero el código aplica 10% 
     */ 
    public void aplicarInteresAnual() { 
        balance = balance + (balance * 0.1);  
    } 
 
    public void imprimirEstado() { 
        // DEFECTO SALIDA: Mensaje de depuración poco profesional 
        System.out.println("Saldo: " + balance); 
    } 
}