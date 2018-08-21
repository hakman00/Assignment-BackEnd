/*
package com.kleinpix.assignment7_back_end.Controller;

import com.kleinpix.assignment7_back_end.factories.AdditionalFactory;
import com.kleinpix.assignment7_back_end.model.Additional;
import com.kleinpix.assignment7_back_end.services.ServiceImpl.AdditionalServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/additional")
public class AdditionalController {

    private Additional additional;

        @Autowired
        private AdditionalServiceImpl additionalService;

       /* @Autowired
        private ColoursServiceImpl coloursService;

        @Autowired
        private ContributorServiceImpl contributorService;

        @Autowired
        private ProgramSlotServiceImpl programSlotService;*/
/*
    @CrossOrigin
    @GetMapping(path = "/addUser")
    public @ResponseBody
    Additional create(@RequestParam String id, @RequestParam String numberOfPrints, @RequestParam String photobookSize, @RequestParam String photoboothPackage)
    {
        additional = AdditionalFactory.getAdditional(Object); //id,numberOfPrints, photobookSize, photoboothPackage);
        return additionalService.create(additional);
    }

    @CrossOrigin
    @GetMapping(path = "/findAll")
    public @ResponseBody Iterable<Additional> findAll(){
        return additionalService.findAll();
    }

    @CrossOrigin
    @GetMapping(path="/login")
    public @ResponseBody Additional findByNumberOfPrints(String numberOfPrints){
        return additionalService.findByNumberOfPrints(String numberOfPrints);
    }
    @CrossOrigin
    @GetMapping(path="/findByEmail")
    public @ResponseBody Additional findByNumberOfPrints(@RequestParam String numberOfPrints)
    {
        return additionalService.findByNumberOfPrints(numberOfPrints);
    }
    @CrossOrigin
    @GetMapping(path="/findByPassword")
    public @ResponseBody Additional findByPassword(@RequestParam String password)
    {
        return additionalService.photobookSize(photobookSize);
    }
}
*/