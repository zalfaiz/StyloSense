package com.example.stylosense.datas.repos

import com.example.stylosense.datas.dummy_db.DemoDB
import com.example.stylosense.domains.models.ProductModel
import com.example.stylosense.domains.repos.ProductRepository
import javax.inject.Inject

class ProductRepositoryImp @Inject constructor(
    private val demoDB: DemoDB
) : ProductRepository {
    override suspend fun getProduct(): List<ProductModel> {
        return demoDB.getProduct()
    }

    override suspend fun getProductDetail(id: Int): ProductModel {
        return demoDB.getProduct()[id-1]
    }
}