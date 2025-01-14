/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tecnologias;

/**
 *
 * @author Estudiante_MCA
 */
class PersonaCargo implements toStringInterface{
    
    public Cargo cargo;
    public Persona persona;
    public Empresa empresa;

    public PersonaCargo(Persona persona, Cargo cargo, Empresa empresa)
    {
        this.persona = persona;
        this.cargo = cargo;
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return "PersonaCargo{" + "cargo=" + cargo + ", persona=" + persona + ", empresa=" + empresa + '}';
    }
}
