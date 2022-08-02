package guru.springframework.mssbrewery.services;

import guru.springframework.mssbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);

    CustomerDto saveCustomer(CustomerDto customerDto);

    void deleteCustomer(UUID customerID);

    void updateCustomer(UUID customerId, CustomerDto customerDto);
}
