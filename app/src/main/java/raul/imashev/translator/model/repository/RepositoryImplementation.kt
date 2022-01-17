package raul.imashev.translator.model.repository

import io.reactivex.Observable
import raul.imashev.translator.model.data.RetrofitDataModel
import raul.imashev.translator.model.datasourse.DataSource

class RepositoryImplementation(private val dataSource: DataSource<List<RetrofitDataModel>>) :
    Repository<List<RetrofitDataModel>> {

    override fun getData(word: String): Observable<List<RetrofitDataModel>> {
        return dataSource.getData(word)
    }
}