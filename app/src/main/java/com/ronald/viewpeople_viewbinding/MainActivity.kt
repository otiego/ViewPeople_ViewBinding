package com.ronald.viewpeople_viewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ronald.viewpeople_viewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var  binding:ActivityMainBinding
    private var timesClicked = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val initialPeople = Person("Ronald Otieno",R.drawable.ronald, "Software Engineer")
        displayPeople(initialPeople)

        binding.button.setOnClickListener {
            timesClicked++

            when(timesClicked % 9){
                0 -> displayPeople(Person("Ronald",R.drawable.ronald,"Software Engineer"))
                1 -> displayPeople(Person("Chelsea",R.drawable.chelsea,"Tutor"))
                2 -> displayPeople(Person("Quincy",R.drawable.quincy,"Actor"))
                3 -> displayPeople(Person("Ella",R.drawable.ella,"Cloud Practitioner"))
                4 -> displayPeople(Person("Barack",R.drawable.obama,"President"))
                5 -> displayPeople(Person("Kamala",R.drawable.kamala,"Vice President"))
                6 -> displayPeople(Person("Liam",R.drawable.lim,"Doctor"))
                7 -> displayPeople(Person("Smith",R.drawable.smith,"Writer"))
                8 -> displayPeople(Person("Musk",R.drawable.elon,"Explorer"))
                9 -> displayPeople(Person("Ethan",R.drawable.avatar,"Business Man"))

            }

        }
    }


    private fun displayPeople(person: Person){
        binding.tvName.text = person.name
        binding.imageView.setImageResource(person.image)
        binding.tvCareer.text = person.career
    }

    data class Person(var name:String, var image:Int, var career:String)
}