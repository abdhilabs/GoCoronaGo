package com.example.gocoronago.ui.main

import com.example.gocoronago.homepage.Summary
import com.example.gocoronago.base.BaseRepo

class MainRepo : BaseRepo() {

    private val service = retrofit.create(MainInterface::class.java)
    suspend fun getCovidSummary(): Summary {
        return service.getSummary()
    }
}