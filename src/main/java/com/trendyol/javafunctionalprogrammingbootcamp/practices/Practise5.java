package com.trendyol.javafunctionalprogrammingbootcamp.practices;

import com.trendyol.javafunctionalprogrammingbootcamp.model.Refund;
import com.trendyol.javafunctionalprogrammingbootcamp.model.RefundDto;

import java.util.List;

public class Practise5 {

    public List<RefundDto> assembleSuccessfulRefunds(List<Refund> refunds) {
        // TODO: implement method that accepts list of Refunds and assembles the successful refunds into RefundDto
        return refunds.stream()
                .filter(Refund::isSuccess)
                .map(refund -> RefundDto.builder().id(refund.getId()).build())
                .toList();
    }
}
