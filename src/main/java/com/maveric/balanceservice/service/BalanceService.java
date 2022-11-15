package com.maveric.balanceservice.service;

import com.maveric.balanceservice.dto.BalanceDto;
import com.maveric.balanceservice.entity.Balance;


public interface BalanceService {

    public Balance updateBalance(String balanceId,String accountId, BalanceDto balanceDto);

    public Balance createBalance(String accountId, Balance balance);
    public String deleteBalance(String accountId,String balanceId);

}
