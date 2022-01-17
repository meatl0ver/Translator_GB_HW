package raul.imashev.translator.model.repository

import io.reactivex.Observable
import raul.imashev.translator.model.data.DataModel
import raul.imashev.translator.model.datasourse.DataSource

class RepositoryImplementation(private val dataSource: DataSource<List<DataModel>>) :
    Repository<List<DataModel>> {

    override fun getData(word: String): Observable<List<DataModel>> {
        return dataSource.getData(word)
    }
}