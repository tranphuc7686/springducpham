package service;

import model.Prescription;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@Transactional
@Service
public class PrescriptionService {
    @Autowired
    private SessionFactory sessionFactory;

    public void savePrescription(Prescription prescription){
        sessionFactory.getCurrentSession().save(prescription);}

    public Prescription findPrescriptopnById(int id){
        return(Prescription) sessionFactory.getCurrentSession().get(Prescription.class,id);
    }

    public void deletePrescription(int id){
        Prescription prescription = findPrescriptopnById(id);
        sessionFactory.getCurrentSession().delete(prescription);
    }

    public void updatePrescription(Prescription prescription){
        sessionFactory.getCurrentSession().update(prescription);
    }
}