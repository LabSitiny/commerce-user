package dev.labsitiny.commerce.user.customer

import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Service

@Service
class CustomerService (val db:JdbcTemplate){

    fun find () : List<Customer> = db.query("select * from customer") {
        response, _ -> Customer(response.getInt("id"), response.getString("name"))
    }
}