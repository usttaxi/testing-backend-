package com.example.spring.offerride.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.spring.offeride.vo.ResponseTemplateVO;
import com.example.spring.offerride.ResourceNotFoundException;
import com.example.spring.offerride.model.OfferRide;
import com.example.spring.offerride.repository.OfferRideRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/offerride")
public class OfferRideController {

	@Autowired
    private OfferRideRepository offerrideRepository;



   @PostMapping("/offer")
    public OfferRide addOffer(@RequestBody OfferRide offerride) {
        return offerrideRepository.save(offerride);
    }




    @GetMapping("/offer")
    public ResponseEntity<List<OfferRide>> getAllofferride() {



       return ResponseEntity.ok(offerrideRepository.findAll());
    }



   @GetMapping("/offer/{tripid}")
    public ResponseEntity<OfferRide> getOfferById(@PathVariable(value = "tripid") Integer tripid)
            throws ResourceNotFoundException {
        
        OfferRide offerrideRespository = offerrideRepository.findById(tripid)
                .orElseThrow(() -> new ResourceNotFoundException("OfferRide not found for this id :: " + tripid));
        ResponseTemplateVO vo = new ResponseTemplateVO();
        return ResponseEntity.ok().body(offerrideRespository);
        
    }
    
   
    @PutMapping("/offer/{uid}")
    public ResponseEntity<OfferRide> updateOffer(@PathVariable(value = "uid") Integer uid,
   
                                                   @RequestBody OfferRide Details) throws ResourceNotFoundException {
        OfferRide offerride = offerrideRepository.findById(uid)
                .orElseThrow(() -> new ResourceNotFoundException("OfferRide not found for this id :: " + uid));
        offerride.setUid(Details.getUid());
        offerride.setName(Details.getName());
        offerride.setV_no(Details.getV_no());
        offerride.setPhone(Details.getPhone());
        offerride.setStart(Details.getStart());
        offerride.setDest_point(Details.getDest_point());
        offerride.setStart_time(Details.getStart_time());
        offerride.setDest_time(Details.getDest_time());
        offerride.setEmail(Details.getEmail());
        offerride.setPrice(Details.getPrice());
        offerride.setKms(Details.getKms());
        



       final OfferRide updated = offerrideRepository.save(offerride);
        return ResponseEntity.ok(updated);
    }



   @DeleteMapping("/offer/{tripid}")
    public OfferRide deleteOffer(@PathVariable(value = "tripid") Integer tripid)
            throws ResourceNotFoundException {
        OfferRide offerride = offerrideRepository.findById(tripid)
                .orElseThrow(() -> new ResourceNotFoundException("OfferRide not found for this id :: " + tripid));



       offerrideRepository.delete(offerride);
       
        return offerride;
    }
   
   
   
   
   @GetMapping("/offers/{start}")
   public List<OfferRide> getstartdetails(@PathVariable(value = "start") String start)
   {
	   
	   
	return offerrideRepository.findAllByStart(start);
	   
   }
}

