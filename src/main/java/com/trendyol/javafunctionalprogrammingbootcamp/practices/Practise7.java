package com.trendyol.javafunctionalprogrammingbootcamp.practices;

import com.trendyol.javafunctionalprogrammingbootcamp.model.Payment;

import java.util.List;

public class Practise7 {

    public boolean isReconciliationCompletedForGivenDateRange(
            List<Payment> payments,
            Long startDate,
            Long endDate
    ) {
        // TODO: implement method that accepts list of Payment, start and end date.
        // TODO: check whether reconciliation is completed for all payments which are created in that range.
        // TODO: start and end date is inclusive.
        // TODO: return true if there is no such payment in that range.
        // TODO: return true if reconciliation completed for all of them, else false.

        return payments.stream()
                .filter(payment -> payment.getCreatedDate() >= startDate)
                .filter(payment -> payment.getCreatedDate() <= endDate)
                .allMatch(Payment::isReconciliationCompleted);
    }
}
