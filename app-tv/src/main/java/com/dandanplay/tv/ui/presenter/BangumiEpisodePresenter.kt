package com.dandanplay.tv.ui.presenter

import android.view.ViewGroup
import androidx.leanback.widget.Presenter
import com.dandanplay.tv.ui.card.BangumiEpisodeCardView
import com.seiko.domain.model.BangumiEpisode

class BangumiEpisodePresenter : Presenter() {

    override fun onCreateViewHolder(parent: ViewGroup): ViewHolder {
        val view = BangumiEpisodeCardView(parent.context)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, item: Any?) {
        val carView = holder.view as BangumiEpisodeCardView
        val episode = item as BangumiEpisode
        carView.bind(episode)
    }

    override fun onUnbindViewHolder(viewHolder: ViewHolder?) {

    }
}