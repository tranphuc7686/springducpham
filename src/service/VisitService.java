package service;

import model.Visit;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import model.Patient;
import model.Icd;

@Transactional
@Service
public class VisitService {
    @Autowired
    private SessionFactory sessionFactory;
    
    public void addVisit(Visit visit) {
        sessionFactory.getCurrentSession().save(visit);
    }

    public List<Visit> getAllVisits() {
        Query query = sessionFactory.getCurrentSession().createQuery("from Visit");
        return query.list();
    }

    public List<Visit> getVisitByIdPatient(int id) {
        Query query  = sessionFactory.getCurrentSession().createQuery("from Visit v,Icd i where v.patient.id="+id+" and i.id = v.diagnosis.id ");
        return query.list();
    }
    public Visit getVisitById(int id) {
        return (Visit) sessionFactory.getCurrentSession().get(Visit.class, id);
    }
    public void updateVisit(Visit visit) {
        sessionFactory.getCurrentSession().update(visit);
    }

    public void deleteVisit(int id) {
        Visit visit = getVisitById(id);
        sessionFactory.getCurrentSession().delete(visit);
    }


}
