package com.actividadcontacto.clinica.Entidad;

import jakarta.validation.constraints.*;
import java.util.List;

public class Paciente {

    @NotEmpty(message = "El nombre no puede estar vacío")
    private String nombre;

    @NotEmpty(message = "El apellido no puede estar vacío")
    private String apellido;

    @Email(message = "El email debe ser válido")
    private String email;

    @Pattern(regexp = "\\d{10}", message = "El teléfono debe contener 10 dígitos")
    private String telefono;

    @NotEmpty(message = "La dirección no puede estar vacía")
    private String direccion;

    @Min(value = 0, message = "La edad debe ser mayor a 0")
    @Max(value = 120, message = "La edad no puede ser mayor a 120")
    private Integer edad;

    @Pattern(regexp = "\\d{5}", message = "El código postal debe contener 5 dígitos")
    private String codigo;

    private String fechaNacimiento;

    private String genero;

    private String estadoCivil;

    private List<String> idiomas;

    @Size(max = 500, message = "Los comentarios no pueden exceder los 500 caracteres")
    private String comentarios;

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public Integer getEdad() { return edad; }
    public void setEdad(Integer edad) { this.edad = edad; }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getFechaNacimiento() { return fechaNacimiento; }
    public void setFechaNacimiento(String fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }

    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }

    public String getEstadoCivil() { return estadoCivil; }
    public void setEstadoCivil(String estadoCivil) { this.estadoCivil = estadoCivil; }

    public List<String> getIdiomas() { return idiomas; }
    public void setIdiomas(List<String> idiomas) { this.idiomas = idiomas; }

    public String getComentarios() { return comentarios; }
    public void setComentarios(String comentarios) { this.comentarios = comentarios; }
}
