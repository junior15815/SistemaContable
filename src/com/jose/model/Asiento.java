package com.jose.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by agua on 30/06/15.
 */
public class Asiento {
    private String mFecha;
    private Map<String, Double> mDebitos;
    private Map<String, Double> mCreditos;
    private String mRegistro;

    public Asiento(String fecha, Map<String, Double> debitos, Map<String, Double> creditos, String registro) {
        mFecha = fecha;
        mDebitos = debitos;
        mCreditos = creditos;
        mRegistro = registro;
    }

    public void setFecha(String fecha) {
        mFecha = fecha;
    }

    public String getFecha() {
        return mFecha;
    }

    public void addDebitos(String cuenta, double valor) {
        mDebitos.putIfAbsent(cuenta, valor);
    }

    public Map<String, Double> getDebitos() {
        return mDebitos;
    }

    public void addCreditos(String cuenta, double valor) {
        mCreditos.put(cuenta, valor);
    }

    public Map<String, Double> getCreditos() {
        return mCreditos;
    }

    public void setRegistro(String registro) {
        mRegistro = registro;
    }

    public String getRegistro() {
        return mRegistro;
    }
}