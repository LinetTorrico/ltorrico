package com.dh.project.finalExam.service;

import com.dh.project.finalExam.domain.Buyer;
import com.dh.project.finalExam.domain.Car;
import com.dh.project.finalExam.domain.RegistryCarSold;
import com.dh.project.finalExam.domain.Seller;
import com.dh.project.finalExam.repository.BuyerRepository;
import com.dh.project.finalExam.repository.CarRepository;
import com.dh.project.finalExam.repository.RegistryCarSoldRepository;
import com.dh.project.finalExam.repository.SellerRepository;
import com.dh.project.finalExam.web.RegistryCarSoldController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Linet on 22/6/2017.
 */
@Service
public class RegistryCarSoldService {

    @Autowired
    private RegistryCarSoldRepository registryCarSoldRepository;

    @Autowired
    private SellerRepository sellerRepository;

    @Autowired
    private BuyerRepository buyerRepository;

    @Autowired
    private CarRepository carRepository;

    public List<RegistryCarSold> getRegistries() {
        return registryCarSoldRepository.findAll();
    }

    public HashMap<String, Object> getRegistriesBySeller(String sellerId) {
        HashMap<String, Object> response = new HashMap<String, Object>();
        RegistryCarSold registry = registryCarSoldRepository.findRegistriesBySeller(sellerId);

        if (null != registry) {
            response.put("name", registry.getSeller().getName());
            response.put("ci", registry.getSeller().getCi());
            response.put("CarsSoldNumber", registry.getSeller().getNumCarsSold());
        }
        return response;
    }

    public RegistryCarSold addNewRegistry(RegistryCarSoldController.RegistryCarSoldRequestDTO registryDTO) {

        Seller seller = sellerRepository.findOne(registryDTO.getSellerId());
        Buyer buyer = buyerRepository.findOne(registryDTO.getBuyerId());
        Car car = carRepository.findOne(registryDTO.getCarId());

        RegistryCarSold registryCarSold = new RegistryCarSold();
        registryCarSold.setSellDate(registryDTO.getSellDate());
        registryCarSold.setBuyer(buyer);
        registryCarSold.setSeller(seller);
        registryCarSold.setCar(car);

        registryCarSoldRepository.save(registryCarSold);

        updateSellerCounter(seller);

        return registryCarSold;
    }

    public RegistryCarSold deleteRegistry(String id) {
        RegistryCarSold registryCarSold = registryCarSoldRepository.findOne(id);

        registryCarSoldRepository.delete(registryCarSold);

        return registryCarSold;
    }

    public RegistryCarSold updateRegistry(String id, RegistryCarSoldController.RegistryCarSoldRequestDTO registryDTO) {
        Seller seller = sellerRepository.findOne(registryDTO.getSellerId());
        Buyer buyer = buyerRepository.findOne(registryDTO.getBuyerId());
        Car car = carRepository.findOne(registryDTO.getCarId());

        RegistryCarSold registryCarSold = new RegistryCarSold();
        registryCarSold.setSellDate(registryDTO.getSellDate());
        registryCarSold.setBuyer(buyer);
        registryCarSold.setSeller(seller);
        registryCarSold.setCar(car);
        registryCarSold.setId(id);

        registryCarSoldRepository.save(registryCarSold);

        return registryCarSold;
    }

    private void updateSellerCounter(Seller seller) {
        long soldNumber = seller.getNumCarsSold() + 1;
        seller.setNumCarsSold(soldNumber);
        sellerRepository.save(seller);
    }
}
