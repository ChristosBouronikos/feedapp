/*
 * Copyright (c) 2020 Ruslan Potekhin
 */

package com.feedapp.app.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "recentProducts")
data class RecentProduct(
    @PrimaryKey(autoGenerate = true)
    val recentId: Int = 0,
    val name: String,
    val foodProductId: Int
)