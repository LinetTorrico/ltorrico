package com.dh.project.finalExam.web;

import com.dh.project.finalExam.domain.RegistryCarSold;
import com.dh.project.finalExam.domain.Seller;
import com.dh.project.finalExam.service.RegistryCarSoldService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Linet on 22/6/2017.
 */
@RestController
@RequestMapping("/register")

public class RegistryCarSoldController {

    @Autowired
    private RegistryCarSoldService registryCarSoldService;

    @RequestMapping(method = RequestMethod.GET)
    public List<RegistryCarSold> getRegistries() {
        return registryCarSoldService.getRegistries();
    }

    @RequestMapping(value = "/carsSoldBySeller/{sellerId}", method = RequestMethod.GET)
    public HashMap<String, Object> getRegistriesBySeller(@PathVariable String sellerId) {
        return registryCarSoldService.getRegistriesBySeller(sellerId);
    }

    @RequestMapping(method = RequestMethod.POST)
    public RegistryCarSold addCar(@RequestBody RegistryCarSoldRequestDTO registryDTO) {
        return registryCarSoldService.addNewRegistry(registryDTO);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public RegistryCarSold deleteRegistry(@PathVariable String id) {
        return registryCarSoldService.deleteRegistry(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public RegistryCarSold updateRegistry(@PathVariable String id, @RequestBody RegistryCarSoldRequestDTO registryDTO) {
        return registryCarSoldService.updateRegistry(id, registryDTO);
    }

    public static class RegistryCarSoldRequestDTO {
        private Date sellDate;
        private String sellerId;
        private String buyerId;
        private String carId;

        public Date getSellDate() {
            return sellDate;
        }

        public void setSellDate(Date sellDate) {
            this.sellDate = sellDate;
        }

        public String getSellerId() {
            return sellerId;
        }

        public void setSellerId(String sellerId) {
            this.sellerId = sellerId;
        }

        public String getBuyerId() {
            return buyerId;
        }

        public void setBuyerId(String buyerId) {
            this.buyerId = buyerId;
        }

        public String getCarId() {
            return carId;
        }

        public void setCarId(String carId) {
            this.carId = carId;
        }
    }
}
