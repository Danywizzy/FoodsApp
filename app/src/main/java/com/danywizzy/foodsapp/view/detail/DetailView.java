package com.danywizzy.foodsapp.view.detail;

import com.danywizzy.foodsapp.model.Meals;

public interface DetailView {
    void showLoading();
    void hideLoading();
    void setMeal(Meals.Meal meal);
    void onErrorLoading(String message);
}
