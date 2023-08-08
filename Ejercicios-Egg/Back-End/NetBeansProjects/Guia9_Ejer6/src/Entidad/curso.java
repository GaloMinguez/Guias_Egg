package Entidad;

import java.util.Arrays;


public class curso {
    private String nombreCurso;
    private int cantidadHorasPorDia;
    private int cantidadDiasPorSemana;
    private String turno;
    private double precioPorHora;
    private String[] alumnos = new String[5];

    public curso() {
    }

    public curso(String nombreCurso, int cantidadHorasporDia, int cantidadDiasPorSemana, String turno, double precioPorHora, String[] alumnos) {
        this.nombreCurso = nombreCurso;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
        this.alumnos = alumnos;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }
    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }
    public int getCantidadHorasporDia() {
        return cantidadHorasPorDia;
    }
    public void setCantidadHorasporDia(int cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }
    public int getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }
    public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }
    public String getTurno() {
        return turno;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    }
    public double getPrecioPorHora() {
        return precioPorHora;
    }
    public void setPrecioPorHora(double precioPorHora) {
        this.precioPorHora = precioPorHora;
    }
    public String[] getAlumnos() {
        return alumnos;
    }
    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("nombre del curso=").append(nombreCurso);
        sb.append("\ncantidad de horas por dia=").append(cantidadHorasPorDia);
        sb.append("\ncantidad dias por semana=").append(cantidadDiasPorSemana);
        sb.append("\nturno=").append(turno);
        sb.append("\nprecio por hora=").append(precioPorHora);
        sb.append("\nalumnos=").append(Arrays.asList(this.alumnos));
        return sb.toString();
    }
    
    
    
}

