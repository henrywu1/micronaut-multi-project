package com.henry.domains

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Customer {
    @Id
    @GeneratedValue
    Long id

    String firstName
    String lastName
    String email

    static constraints = {
        firstName nullable: true, maxSize: 255
        lastName nullable: false, maxSize: 50
        email nullable: false, unique: true
    }
}
