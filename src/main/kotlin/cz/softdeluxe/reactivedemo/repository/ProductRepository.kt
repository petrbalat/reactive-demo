package cz.softdeluxe.reactivedemo.repository

import cz.softdeluxe.reactivedemo.entity.Product
import org.springframework.data.r2dbc.repository.Query
import org.springframework.data.repository.kotlin.CoroutineCrudRepository
import org.springframework.stereotype.Repository

@Repository
interface ProductRepository : CoroutineCrudRepository<Product, Int> {

    @Query("select * from product order by name")
    suspend fun all(): List<Product>

}
