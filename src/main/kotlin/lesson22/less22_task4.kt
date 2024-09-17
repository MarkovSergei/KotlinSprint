package org.example.lesson22
class MainScreenViewModel {
    data class MainScreenState(val data: String, val isLoading: Boolean)

    private var _mainScreenState = MainScreenState("", false)
    val mainScreenState: MainScreenState
        get() = _mainScreenState

    fun loadData() {
        _mainScreenState = _mainScreenState.copy(isLoading = true)
        Thread.sleep(1000)
        _mainScreenState = _mainScreenState.copy(data = "Данные загружены", isLoading = false)
    }
}
