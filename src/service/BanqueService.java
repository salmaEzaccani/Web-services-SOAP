package service;

import entities.Compte;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@WebService
public class BanqueService {
    @WebMethod
    public double conversion(@WebParam(name = "montant") double montant){
        return montant*10.5;
    }
    @WebMethod
    public Compte getCompte(@WebParam(name = "identifiant")int id){
        return new Compte(id,Math.random()*80000,new Date());
    }
    @WebMethod
    public List<Compte> getComptes(){
        List<Compte> comptes = new ArrayList<>();
        comptes.add(new Compte(1,Math.random()*80000,new Date()));
        comptes.add(new Compte(2,Math.random()*80000,new Date()));
        return comptes;
    }

}
