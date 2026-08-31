

package michalnithesh.michal.music.models

import com.music.innertube.models.YTItem
import michalnithesh.michal.music.db.entities.LocalItem

data class SimilarRecommendation(
    val title: LocalItem,
    val items: List<YTItem>,
)
