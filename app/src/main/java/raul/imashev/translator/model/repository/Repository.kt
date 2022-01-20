package raul.imashev.translator.model.repository

import io.reactivex.Observable
import raul.imashev.translator.model.data.RetrofitDataModel

interface Repository<T> : Repository<List<RetrofitDataModel>>, Repository<List<RetrofitDataModel>> {
    fun getData(word: String): Observable<T>
}