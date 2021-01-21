package com.fahreddinsevindir.currencyconverter.main

import com.fahreddinsevindir.currencyconverter.data.models.CurrencyResponse
import com.fahreddinsevindir.currencyconverter.util.Resource

interface MainRepository {

    suspend fun getRates(base: String): Resource<CurrencyResponse>

}