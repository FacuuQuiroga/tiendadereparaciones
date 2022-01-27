/**
* @author Facu
*/
package entidades;

import java.util.Scanner;

import Utils.Utilidades;

import java.util.ArrayList;

public class Mantenimiento extends Servicio {
	/*
	 * no podran ser mas de 24 horas, se contaran unicamente las horas de trabajo
	 * real, no las de espera de un repuesto por ejemplo, ni del tiempo en el que se
	 * tiene el dispositivo a reparar
	 */
	private double horasTrabajadas;
	/* para relacion de Mantenimiento y Reparacion */
	private ArrayList<Reparacion> reparacion = new ArrayList<Reparacion>();

	/* constructores */
	public Mantenimiento() {
		super();
	}

	public Mantenimiento(double horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public Mantenimiento(double ht, ArrayList reparaciones) {
		this.horasTrabajadas = ht;
		this.reparacion = reparaciones;
	}

	public static Mantenimiento nuevoMantenimiento() {
		/* instancia del teclado */
		Scanner teclado = new Scanner(System.in);
		/* nueva instancia de Mantenimiento */
		Mantenimiento ret = new Mantenimiento();

		System.out.println("Cuantas horas duro el mantenimiento?");
		double horasServ = 0.0;
		horasServ = teclado.nextDouble();

		System.out.println("El mantenimieto tiene reparaciones?");
		boolean tieneRep = false;
		tieneRep = Utilidades.leerBoolean();
		if (tieneRep) {
			// ArrayList<Reparacion> rep = Reparacion.nuevaReparacion(); NO SE COMO TRABAJAR
			// CON LOS ARRAYLIST TODAVIA
			ret.setHorasTrabajadas(horasServ);
			// ret.setReparacion(rep);
		} else {
			ret.setHorasTrabajadas(horasServ);
		}

		return ret;
	}

	/* Getters and setters */
	public double getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(double horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public ArrayList<Reparacion> getReparacion() {
		return reparacion;
	}

	public void setReparacion(ArrayList<Reparacion> reparacion) {
		this.reparacion = reparacion;
	}

	@Override
	public String toString() {
		return "Mantenimiento [horasTrabajadas=" + horasTrabajadas + ", idServicio=" + idServicio + ", precioTotal="
				+ precioTotal + "]";
	}

}