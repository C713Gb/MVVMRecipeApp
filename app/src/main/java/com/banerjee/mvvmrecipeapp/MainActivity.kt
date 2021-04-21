package com.banerjee.mvvmrecipeapp

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.banerjee.mvvmrecipeapp.domain.model.Recipe
import com.banerjee.mvvmrecipeapp.network.model.RecipeNetworkEntity
import com.banerjee.mvvmrecipeapp.network.model.RecipeNetworkMapper

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mapper = RecipeNetworkMapper()

        val recipe = Recipe()

        val networkEntity: RecipeNetworkEntity = mapper.mapToEntity(recipe)

        val r: Recipe = mapper.mapFromEntity(networkEntity)
    }
}


















