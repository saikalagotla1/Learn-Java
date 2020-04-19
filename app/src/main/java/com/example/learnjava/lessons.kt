package com.example.learnjava

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class lessons : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lessons)
    }

    fun openHelloWorld(view: View){
        val intent = Intent(this, hello_world::class.java)
        startActivity(intent)
    }

    fun openVariablesAndTypes(view: View){
        val intent = Intent(this, variables_and_types::class.java)
        startActivity(intent)
    }

    fun openVariableArithmetic(view: View){
        val intent = Intent(this, variables_arithmetic::class.java)
        startActivity(intent)
    }

    fun openArrays(view: View){
        val intent = Intent(this, arrays::class.java)
        startActivity(intent)
    }

    fun openLoops(view: View){
        val intent = Intent(this, loops::class.java)
        startActivity(intent)
    }

    fun openFunctions(view: View){
        val intent = Intent(this, functions::class.java)
        startActivity(intent)
    }

    fun openClasses(view: View){
        val intent = Intent(this, classes::class.java)
        startActivity(intent)
    }

    fun openObjects(view: View){
        val intent = Intent(this, objects::class.java)
        startActivity(intent)
    }

    fun openInheritance(view: View){
        val intent = Intent(this, inheritance::class.java)
        startActivity(intent)
    }

    fun openAbstractClasses(view: View){
        val intent = Intent(this, "@layout/lessons/abstract_classes"::class.java)
        startActivity(intent)
    }

    fun openInterfaces(view: View){
        val intent = Intent(this, interfaces::class.java)
        startActivity(intent)
    }
}
