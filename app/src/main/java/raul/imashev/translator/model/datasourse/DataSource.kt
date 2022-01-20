package raul.imashev.translator.model.datasourse

import io.reactivex.Observable

interface DataSource<T> {
    fun getData(word: String): Observable<T>
}