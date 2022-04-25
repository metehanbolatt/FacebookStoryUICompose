package com.metehanbolat.facebookstoryuicompose

import androidx.annotation.DrawableRes

data class Story(
    val userName: String,
    @DrawableRes val profile: Int,
    @DrawableRes val image: Int
)

fun getStories(): List<Story> = listOf(
    Story("User One", R.drawable.image_1, R.drawable.image_2),
    Story("User Two", R.drawable.image_5, R.drawable.image_4),
    Story("User Three", R.drawable.image_4, R.drawable.image_1),
    Story("User Four", R.drawable.image_3, R.drawable.image_5),
    Story("User Five", R.drawable.image_2, R.drawable.image_3)
)
