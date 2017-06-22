package com.dh.project.finalExam.service;

import com.dh.project.finalExam.domain.Seller;
import com.dh.project.finalExam.repository.SellerRepository;
import com.dh.project.finalExam.web.SellerController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Linet on 22/6/2017.
 */
@Service
public class SellerService {
    @Autowired
    private SellerRepository sellerRepository;

    public List<Seller> getSellers() {
        return sellerRepository.findAll();
    }

    public Seller addNewSeller(SellerController.SellerRequestDTO sellerRequestDTO) {
        Seller seller = new Seller();
        seller.setName(sellerRequestDTO.getName());
        seller.setAge(sellerRequestDTO.getAge());
        seller.setCi(sellerRequestDTO.getCi());
        seller.setNumCarsSold(sellerRequestDTO.getNumCarsSold());

        sellerRepository.save(seller);

        return seller;
    }

    public Seller deleteSeller(String id) {
        Seller seller = sellerRepository.findOne(id);

        sellerRepository.delete(seller);

        return seller;
    }

    public Seller updateSeller(String id, SellerController.SellerRequestDTO sellerRequestDTO) {
        Seller seller = new Seller();
        seller.setName(sellerRequestDTO.getName());
        seller.setAge(sellerRequestDTO.getAge());
        seller.setCi(sellerRequestDTO.getCi());
        seller.setNumCarsSold(sellerRequestDTO.getNumCarsSold());
        seller.setId(id);

        sellerRepository.save(seller);

        return seller;
    }
}
