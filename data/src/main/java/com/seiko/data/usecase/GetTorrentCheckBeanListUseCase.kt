package com.seiko.data.usecase

import com.frostwire.jlibtorrent.TorrentInfo
import com.seiko.data.utils.getFileType
import com.seiko.domain.entity.TorrentCheckBean
import com.seiko.domain.utils.Result
import java.io.File

class GetTorrentCheckBeanListUseCase {

    operator fun invoke(torrentPath: String): Result<List<TorrentCheckBean>> {
        val info: TorrentInfo
        try {
            info = TorrentInfo(File(torrentPath))
        } catch (e: Exception) {
            return Result.Error(e)
        }

        val size = info.numFiles()
        val list = ArrayList<TorrentCheckBean>(size)
        for (i in 0 until size) {
            val name = info.files().fileName(i)
            list.add(TorrentCheckBean(
                    index = i,
                    name = name,
                    size = info.files().fileSize(i),
                    type = name.getFileType()))
        }
        return Result.Success(list)
    }
}