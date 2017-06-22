package com.dh.project.finalExam.service;


import com.dh.project.finalExam.domain.Buyer;
import com.dh.project.finalExam.repository.BuyerRepository;
import com.dh.project.finalExam.web.BuyerController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Linet on 22/6/2017.
 */
@Service
public class BuyerService {
    @Autowired
    private BuyerRepository buyerRepository;

    public List<Buyer> getBuyers() {
        return buyerRepository.findAll();
    }

    public Buyer addNewBuyer(BuyerController.BuyerRequestDTO buyerRequestDTO) {
        Buyer buyer = new Buyer();
        buyer.setName(buyerRequestDTO.getName());
        buyer.setCellphone(buyerRequestDTO.getCellphone());
        buyer.setCi(buyerRequestDTO.getCi());
        buyer.setProfession(buyerRequestDTO.getProfession());

        buyerRepository.save(buyer);

        return buyer;
    }

    public Buyer deleteBuyer(String id) {
        Buyer buyer = buyerRepository.findOne(id);

        buyerRepository.delete(buyer);

        return buyer;
    }

    public Buyer updateBuyer(String id, BuyerController.BuyerRequestDTO buyerRequestDTO) {
        Buyer buyer = new Buyer();
        buyer.setName(buyerRequestDTO.getName());
        buyer.setCellphone(buyerRequestDTO.getCellphone());
        buyer.setCi(buyerRequestDTO.getCi());
        buyer.setProfession(buyerRequestDTO.getProfession());
        buyer.setId(id);

        buyerRepository.save(buyer);

        return buyer;
    }
}
