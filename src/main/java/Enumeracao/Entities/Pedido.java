package Enumeracao.Entities;

import Enumeracao.enums.StatusDoPedido;

import java.util.Date;

public class Pedido {
    private  Integer ID;
    private Date moment;
    private StatusDoPedido status;

    public Pedido(){

    }

    public Pedido(Integer ID, Date moment, StatusDoPedido status) {
        this.ID = ID;
        this.moment = moment;
        this.status = status;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public StatusDoPedido getStatus() {
        return status;
    }

    public void setStatus(StatusDoPedido status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return "Pedido{" +
                "ID=" + ID +
                ", moment=" + moment +
                ", status=" + status +
                '}';
    }
}
