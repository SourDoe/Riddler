package com.example.riddler.data.model
import androidx.room.*
import java.io.Serializable

@Entity
data class Quiz(
    val owner: String, //user token from authentication
    val name: String,
    val description: String,
    val type: String,
    val difficulty: String,
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0
)

@Entity(tableName = "quiz_fts")
@Fts4(contentEntity = Quiz::class)
data class QuizFTS(
    val owner: String, //user token from authentication
    val name: String,
    val description: String,
    val type: String,
    val difficulty: String,
    val id: Int = 0
)
//@Entity(
//    foreignKeys = [ForeignKey(
//        entity = Quiz::class,
//        parentColumns = arrayOf("id"),
//        childColumns = arrayOf("quizId"),
//        onDelete = ForeignKey.CASCADE
//    )],
//    indices = [
//        Index("quizId")
//    ]
//)
//data class FavoriteQuiz(
//    @PrimaryKey(autoGenerate = true) val id: Int,
//    val quizId: Int,
//    val userId: Int //user token from authentication
//)

