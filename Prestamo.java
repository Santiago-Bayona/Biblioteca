public class prestamo {
    private string codigo;
    public localdate fechaprestamo;
    public localdate fechaentrega;
    public double costoprestamo;

    public prestamo(string codigo, localdate fechaprestamo, localdate fechaentrega, double costoprestamo) {
        this.codigo = codigo;
        this.fechaprestamo = fechaprestamo;
        this.fechaentrega = fechaentrega;
        this.costoprestamo = costoprestamo;
    }

    public string getCodigo() {
        return codigo;
    }

    public void setCodigo(string codigo) {
        this.codigo = codigo;
    }

    public localdate getFechaprestamo() {
        return fechaprestamo;
    }

    public void setFechaprestamo(localdate fechaprestamo) {
        this.fechaprestamo = fechaprestamo;
    }

    public localdate getFechaentrega() {
        return fechaentrega;
    }

    public void setFechaentrega(localdate fechaentrega) {
        this.fechaentrega = fechaentrega;
    }

    public double getCostoprestamo() {  
        return costoprestamo;
    }

    public void setCostoprestamo(double costoprestamo) {
        this.costoprestamo = costoprestamo;
    }

}    

