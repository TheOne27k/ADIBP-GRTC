package com.grtc.adibp.controllers;

import com.grtc.adibp.entities.AreaEntity;
import com.grtc.adibp.services.AreaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/adibp/areas")
public class AreaController extends BaseControllerImpl<AreaEntity, AreaServiceImpl>{
}
