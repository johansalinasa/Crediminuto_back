/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.crediminuto.Services_Crediminuto;

import java.util.List;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author RFU-PREST-LP-11
 */
@RestController

public class Service_Control {
    @GetMapping ("/Services")
    List <Services> getServices(){
        return null;
    }
    @GetMapping ("/Services")
    String getHello(){
        return "hello world";
                
    }
}
