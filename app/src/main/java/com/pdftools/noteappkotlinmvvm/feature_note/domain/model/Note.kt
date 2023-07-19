package com.pdftools.noteappkotlinmvvm.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.pdftools.noteappkotlinmvvm.ui.theme.BabyBlue
import com.pdftools.noteappkotlinmvvm.ui.theme.LightGreen
import com.pdftools.noteappkotlinmvvm.ui.theme.RedOrange
import com.pdftools.noteappkotlinmvvm.ui.theme.RedPink
import com.pdftools.noteappkotlinmvvm.ui.theme.Violet

@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,

    @PrimaryKey val id: Int? = null
) {
    companion object {
        val noteColor = listOf(
            RedOrange,
            LightGreen,
            Violet,
            BabyBlue,
            RedPink
        )
    }
}

class InvalidNoteException(message: String): Exception(message)
