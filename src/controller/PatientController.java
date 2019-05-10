package controller;

import model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.PatientService;

import java.util.List;


@RestController
@RequestMapping(path = "/")
public class PatientController {

    @Autowired
    private PatientService patientService;
    @CrossOrigin
    @RequestMapping(path = "patient", method = RequestMethod.POST)
    public void savePatient(@RequestBody Patient patient){
        patientService.addPatient(patient);
    }
    @CrossOrigin
    @RequestMapping(path = "patients", method = RequestMethod.GET)
    public List<Patient> getAllPatients(){
        return patientService.getAllPatients();
    }
    @CrossOrigin
    @RequestMapping(path = "patient/{id}", method = RequestMethod.GET)
    public Patient getAllPatients(@PathVariable int id){
        return patientService.getPatientById(id);
    }

    @CrossOrigin
    @RequestMapping(path = "patient", method = RequestMethod.PUT)
    public void updatePatient(@RequestBody Patient patient) {
        patientService.updatePatient(patient);
    }
    @CrossOrigin
    @RequestMapping(path = "patient/id/{id}", method = RequestMethod.DELETE)
    public void deletePatient(@PathVariable int id) {
        patientService.deletePatient(id);
    }

}
