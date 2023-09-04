package com.picpaydesafiobackend.services;

import com.picpaydesafiobackend.domain.user.User;
import com.picpaydesafiobackend.dtos.TransactionDTO;
import com.picpaydesafiobackend.repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {
    @Autowired
    private UserService userService;

    @Autowired
    private TransactionRepository repository;

    public void createTransaction(TransactionDTO transaction) throws Exception {
        User sender = this.userService.findUserById(transaction.senderId());
        User receiver = this.userService.findUserById(transaction.receiverId());
    }
}
