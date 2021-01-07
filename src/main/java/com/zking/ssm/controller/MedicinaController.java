package com.zking.ssm.controller;

import com.zking.ssm.model.Medicina;
import com.zking.ssm.service.IMedicinaSeivice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("medina")
public class MedicinaController {

    @Autowired
    private IMedicinaSeivice medicinaSeivice;

public Map<String ,Object> list(Medicina medicina){
    List<Medicina> list = medicinaSeivice.list(medicina);

    return null;
}

}
