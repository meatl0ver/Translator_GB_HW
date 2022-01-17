package raul.imashev.translator.model.entity

import raul.imashev.translator.model.data.Meanings

data class DataModel(
    val text: String?,
    val meanings: List<Meanings>?
)
