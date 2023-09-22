/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Julia
 */
public class Funcionario extends Pessoas {
    private int ID_funcionario;
    private float salario;
    private String data_admisao;
    private String tipo_contrato;

    public int getID_funcionario() {
        return ID_funcionario;
    }

    public void setID_funcionario(int ID_funcionario) {
        this.ID_funcionario = ID_funcionario;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getData_admisao() {
        return data_admisao;
    }

    public void setData_admisao(String data_admisao) {
        this.data_admisao = data_admisao;
    }

    public String getTipo_contrato() {
        return tipo_contrato;
    }

    public void setTipo_contrato(String tipo_contrato) {
        this.tipo_contrato = tipo_contrato;
    }
    
    
}
