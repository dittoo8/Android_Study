package com.sohyeon.listviewkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var UserList = arrayListOf<User>(
            User(R.drawable.ic_launcher_foreground,"111","28", "ㅎㅇㅎ"),
            User(R.drawable.ic_launcher_foreground,"222","21", "안녕안녕"),
            User(R.drawable.ic_launcher_foreground,"133311","25", "하이하이"),
            User(R.drawable.ic_launcher_foreground,"444","24", "방가방가"),
            User(R.drawable.ic_launcher_foreground,"5555","22", "반갑습니당"),
    )
    override fun onCreate(savedInstanceState: Bundle?) { //액티비티의 실행  시작 지점.
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val item = arrayOf("사과", "배", "딸기", "키위")
//        // context란 한 액티비티의 모든 정보를 담고 있다.
//        listView.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, item)

        val Adapter = UserAdapter(this, UserList)
        listView.adapter = Adapter

        listView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            val selectItem = parent.getItemAtPosition(position) as User
            Toast.makeText(this, selectItem.name, Toast.LENGTH_SHORT).show()
        }

    }
}