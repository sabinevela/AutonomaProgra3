package com.actividadcontacto.clinica.Entidad;

import jakarta.validation.constraints.*;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.Date;
import java.util.List;

public class Paciente {

    @Size(min = 3, max = 50, message = "El nombre debe tener entre 3 y 50 caracteres")
    private String nombre;

    @Size(min = 3, max = 50, message = "El apellido debe tener entre 3 y 50 caracteres")
    private String apellido;

    @NotBlank
    @Email(message = "Ingrese un correo válido")
    private String email;

    @Size(min = 10, max = 10, message = "El teléfono debe tener 10 caracteres")
    private String telefono;

    @Size(min = 10, max = 150, message = "La dirección debe tener entre 10 y 150 caracteres")
    private String direccion;

    @NotNull(message = "La edad no puede ser nula")
    @Min(value = 1, message = "La edad debe ser mayor que 0")
    private int edad;

    @Size(min = 7, max = 10, message = "El código debe tener entre 7 y 10 caracteres")
    private String codigo;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fechaNacimiento;

    @NotBlank(message = "El género es obligatorio")
    private String genero;

    @NotBlank(message = "El estado civil es obligatorio")
    private String estadoCivil;

    // Cambio aquí: ahora idiomas es una lista de String con validación de tamaño
    @Size(min = 1, message = "Debe seleccionar al menos un idioma")
    private List<String> idiomas;

    public Paciente() {
    }

    public Paciente(String nombre, String apellido, String email, String telefono, String direccion, int edad, String codigo, Date fechaNacimiento, String genero, String estadoCivil, List<String> idiomas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
        this.edad = edad;
        this.codigo = codigo;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.estadoCivil = estadoCivil;
        this.idiomas = idiomas;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public List<String> getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(List<String> idiomas) {
        this.idiomas = idiomas;
    }
}

