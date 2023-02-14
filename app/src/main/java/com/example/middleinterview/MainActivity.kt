package com.example.middleinterview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

data class ParsedData(
    val byte: Byte,
    val boolean: Boolean,
    val string: String,
    val char: Char
)

fun makeParsedData(list: List<Object>) {
    ParsedData(list[0] as Byte, list[1] as Boolean, list[2] as String, list[3] as Char)
}


class MainActivity : AppCompatActivity() {

    val data: String = "123\ntrue\napple\nm"

    val result: ArrayList<Object> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}