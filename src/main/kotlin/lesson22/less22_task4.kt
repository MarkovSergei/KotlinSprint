package org.example.lesson22

data class MainScreenState(val data: String, val isLoading: Boolean)

class MainScreenViewModel : ViewModel() {
    private var _mainScreenState = MainScreenState("", false)
    val mainScreenState: LiveData<MainScreenState> = _mainScreenState

    fun loadData() {
        _mainScreenState = _mainScreenState.copy(isLoading = true)
        Thread.sleep(1000)
        _mainScreenState = _mainScreenState.copy(data = "Данные загружены", isLoading = false)
    }
}