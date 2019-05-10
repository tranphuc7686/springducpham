package controller;

import model.Visit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.VisitService;

import java.util.List;

@RestController
@RequestMapping(path = "/")
public class VisitController {
    @Autowired
    private VisitService visitService;
    @CrossOrigin
    @RequestMapping(path = "visit", method = RequestMethod.POST)
    public void saveVisit(@RequestBody Visit visit){
        visitService.addVisit(visit);
    };
    @CrossOrigin
    @RequestMapping(path = "visit", method = RequestMethod.GET)
    public List<Visit> getAllVisits(){
        return visitService.getAllVisits();
    }
    @RequestMapping(path = "visit", method = RequestMethod.PUT)
    public void updateVisit(@RequestBody Visit visit) {
        visitService.updateVisit(visit);
    }
    @CrossOrigin
    @RequestMapping(path = "visit/id/{id}", method = RequestMethod.DELETE)
    public void deleteVisit(@PathVariable int id) {
        visitService.deleteVisit(id);
    }

    @CrossOrigin
    @RequestMapping(path = "visit/{id}", method = RequestMethod.GET)
    public List<Visit> getVisitByIdPatient(@PathVariable int id) {
        return visitService.getVisitByIdPatient(id);
    }



}
