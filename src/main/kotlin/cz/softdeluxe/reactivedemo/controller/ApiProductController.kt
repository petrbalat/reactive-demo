package cz.softdeluxe.reactivedemo.controller

import cz.softdeluxe.reactivedemo.entity.Product
import cz.softdeluxe.reactivedemo.repository.ProductRepository
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.toList
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/api/product")
@RestController
class ApiProductController(private val repository: ProductRepository) {

    @GetMapping
    suspend fun findAll(): List<Product> {
        val products: List<Product> = repository.findAll().toList()

        return products
    }

}
