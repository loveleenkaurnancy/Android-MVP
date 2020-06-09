package com.kitkat.mvp.presenter

import com.kitkat.mvp.contract.ContractInterface.*
import com.kitkat.mvp.model.MainActivityModel

class MainActivityPresenter(_view: View): Presenter {

    private var view: View = _view
    private var model: Model = MainActivityModel()

    init {
        view.initView()
    }

    override fun incrementValue() {
        model.incrementCounter()
        view.updateViewData()
    }

    override fun getCounter() = model.getCounter().toString()

}
