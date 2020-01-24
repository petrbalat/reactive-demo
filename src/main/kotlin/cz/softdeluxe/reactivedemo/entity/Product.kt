package cz.softdeluxe.reactivedemo.entity

import org.springframework.data.annotation.Id
import org.springframework.data.annotation.TypeAlias
import java.time.LocalDateTime


class Product {

    @Id
    var id: Int = 0

    lateinit var name: String

    var created:LocalDateTime = LocalDateTime.now()

}
