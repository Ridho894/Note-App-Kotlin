package com.ridho894.noteapp

data class NoteModel(
    val notes: List<Data>
) {
    data class Data (val id: String?, val note: String?)
}