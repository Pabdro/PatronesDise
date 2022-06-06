package chainResponsability.practice;

public class Persona {
    private Boolean certificadoNacimiento;
    private Boolean pagoBanco;
    private Boolean fichaAtencion;

    public Boolean getCertificadoNacimiento() {
        return certificadoNacimiento;
    }

    public void setCertificadoNacimiento(Boolean certificadoNacimiento) {
        this.certificadoNacimiento = certificadoNacimiento;
    }

    public Boolean getPagoBanco() {
        return pagoBanco;
    }

    public void setPagoBanco(Boolean pagoBanco) {
        this.pagoBanco = pagoBanco;
    }

    public Boolean getFichaAtencion() {
        return fichaAtencion;
    }

    public void setFichaAtencion(Boolean fichaAtencion) {
        this.fichaAtencion = fichaAtencion;
    }

    public Persona(Boolean certificadoNacimiento, Boolean pagoBanco, Boolean fichaAtencion) {
        this.certificadoNacimiento = certificadoNacimiento;
        this.pagoBanco = pagoBanco;
        this.fichaAtencion = fichaAtencion;
    }
}
