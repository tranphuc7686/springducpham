package controller;

import model.Prescription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.PrescriptionService;
import service.VisitService;

@RestController
@RequestMapping(path = "/")
public class PrescriptionController {
    @Autowired
    private PrescriptionService prescriptionService;
    @CrossOrigin
    @RequestMapping(path = "prescription", method = RequestMethod.POST)
    public void savePrescription(@RequestBody Prescription prescription){
        prescriptionService.savePrescription(prescription);
    }
    @CrossOrigin
    @RequestMapping(path = "prescription/{id}", method = RequestMethod.GET)
    public Prescription getPrescriptionById(@PathVariable int id){
        return prescriptionService.findPrescriptopnById(id);
    }
    @CrossOrigin
    @RequestMapping(path = "prescription/{id}", method = RequestMethod.DELETE)
    public void deletePrescriptionById(@PathVariable int id){
        prescriptionService.deletePrescription(id);
    }
    @CrossOrigin
    @RequestMapping(path = "prescription", method = RequestMethod.PUT)
    public void updatePrescription(@RequestBody Prescription prescription){
        prescriptionService.updatePrescription(prescription);
    }


}