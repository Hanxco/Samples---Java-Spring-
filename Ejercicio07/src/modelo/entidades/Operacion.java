package modelo.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="operacion")
public class Operacion {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private double num1;
	private double num2; 
	private String operador;
	private double resultado;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public double getResultado() {
		return resultado;
	}
	public void setResultado(double resultado) {
		this.resultado = resultado;
	}
	public double getNum1() {
		return num1;
	}
	public void setNum1(double num1) {
		this.num1 = num1;
	}
	public double getNum2() {
		return num2;
	}
	public void setNum2(double num2) {
		this.num2 = num2;
	}
	
	public void operar() {
		System.out.println(this.operador);
		switch( this.operador ) {
			case "sum":
				this.resultado = this.num1 + this.num2;
				break;
			case "minus":
				this.resultado = this.num1 - this.num2;
				break;
			case "div":
				if(this.num2 != 0.0) 
					this.resultado = this.num1 / this.num2;					
				break;
			case "mul":
				this.resultado = this.num1 * this.num2;
				break;
		}
	}
	public String getOperador() {
		return operador;
	}
	public void setOperador(String operador) {
		this.operador = operador;
	}
	@Override
	public String toString() {
		return "Operacion [id=" + id + ", num1=" + num1 + ", num2=" + num2 + ", operador=" + operador + ", resultado="
				+ resultado + "]";
	}
	
}
