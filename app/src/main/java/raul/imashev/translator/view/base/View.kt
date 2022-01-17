package raul.imashev.translator.view.base

import raul.imashev.translator.model.data.AppState

interface View {
    fun renderData(appState: AppState)
}