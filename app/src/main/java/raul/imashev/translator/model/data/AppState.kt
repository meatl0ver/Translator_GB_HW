package raul.imashev.translator.model.data

sealed class AppState {
    data class Success(val data: List<RetrofitDataModel>?) : AppState()
    data class Error(val error: Throwable) : AppState()
    data class Loading(val progress: Int?) : AppState()
}