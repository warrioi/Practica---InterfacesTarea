import interfaces.IReseteable;

import java.util.Date;

public class CPU extends Tecnologico implements IReseteable {
    private int memoriaPrincipal;


    public CPU(String codigo ,String PaisOrigen, Date FechaFabricacion, Empresa fabricante, String modelo , int memoriaPrincipal){

        super(codigo, modelo,PaisOrigen,FechaFabricacion,fabricante);

        this.setMemoriaPrincipal(memoriaPrincipal);

    }


    public int getMemoriaPrincipal() {
        return memoriaPrincipal;
    }

    public void setMemoriaPrincipal(int memoriaPrincipal) {
        this.memoriaPrincipal = memoriaPrincipal;
    }

    @Override
    public String toString() {
        return "CPU{" +
                "memoriaPrincipal=" + memoriaPrincipal +
                ", PaisOrigen='" + PaisOrigen + '\'' +
                ", FechaFabricacion=" + FechaFabricacion +
                ", fabricante=" + fabricante +
                ", codigo='" + codigo + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    @Override
    public void reset() {
        System.out.println("Formateando Cpu.....");
    }
}
