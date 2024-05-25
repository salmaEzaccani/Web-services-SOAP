package entities;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;

@XmlRootElement(name = "compte")
public class Compte implements Serializable {
    private int id;
    private Double solde;
    private Date dataCreation;

    public Compte() {
    }

    public Compte(int id, Double solde, Date dataCreation ) {
        this.id = id;
        this.solde = solde;
        this.dataCreation = dataCreation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getSolde() {
        return solde;
    }

    public void setSolde(Double solde) {
        this.solde = solde;
    }

    public Date getDataCreation() {
        return dataCreation;
    }

    public void setDataCreation(Date dataCreation) {
        this.dataCreation = dataCreation;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "id=" + id +
                ", solde=" + solde +
                ", dataCreation=" + dataCreation +
                '}';
    }
}
