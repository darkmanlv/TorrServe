package ru.yourok.torrserve.ui.activities.play

data class ReturnError(val errCode: Int, val errMessage: String)

val ErrIntentNull = ReturnError(-1, "intent is null")
val ErrUnknownCmd = ReturnError(-2, "unknown command")
val ErrProcessCmd = ReturnError(-3, "error when processing cmd, see logcat")
val ErrEmptyTorrent = ReturnError(-4, "torrent link empty")