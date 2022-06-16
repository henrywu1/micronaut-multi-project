package com.henry.customer

import com.henry.domains.Customer
import io.micronaut.data.annotation.Repository
import io.micronaut.data.repository.CrudRepository

@Repository
interface CustomerRepository extends CrudRepository<Customer, Long> {
}