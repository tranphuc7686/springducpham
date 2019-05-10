package service;

import model.Patient;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class PatientService {

    @Autowired
    private SessionFactory sessionFactory;


    public void addPatient(Patient patient) {
        sessionFactory.getCurrentSession().save(patient);
    }
    public List<Patient> getAllPatients(){
        Query query = sessionFactory.getCurrentSession().createQuery("from Patient");
        return query.list();
    }
    public Patient getPatientById(int id){
        return(Patient) sessionFactory.getCurrentSession().get(Patient.class, id);
    }
    public void updatePatient (Patient patient){
        sessionFactory.getCurrentSession().update(patient);
    }

    public void deletePatient(int id){
        Patient patient = getPatientById(id);
        sessionFactory.getCurrentSession().delete(patient);
    }

}
