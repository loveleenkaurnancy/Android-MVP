package com.kitkat.mvp.model

import com.kitkat.mvp.contract.ContractInterface.*

class MainActivityModel: Model {

    private var mCounter = 0

    override fun getCounter() = mCounter

    override fun incrementCounter() {
        mCounter++
    }
}