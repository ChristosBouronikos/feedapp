/* * Copyright (c) 2020 Ruslan Potekhin */package com.feedapp.app.utilimport android.content.Contextimport com.feedapp.app.Rimport com.feedapp.app.data.models.day.MealTypeobject TranslationResolver {    @JvmStatic    fun getTranslationMealType(mealType: MealType, context: Context): String {        return when (mealType) {            MealType.BREAKFAST -> context.getString(R.string.breakfast)            MealType.LUNCH -> context.getString(R.string.lunch)            MealType.SNACK -> context.getString(R.string.snack)            MealType.DINNER -> context.getString(R.string.dinner)        }    }}