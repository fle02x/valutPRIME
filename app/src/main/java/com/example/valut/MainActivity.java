package com.example.valut;
import android.os.Bundle;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Находим ListView в разметке активити
        ListView listView = (ListView) this.findViewById(R.id.listViews);

        // Создаём ListView, в котором будут храниться данные для списка
        ArrayList<DataFlags> list = new ArrayList<>();
        list.clear();

        /* Наполняем List данным. В данном случае данные передаются Объектом,
         * в котором хранятся id, указывающие на флаги в ресурсах, а также
         * на Строки, в которых прописаны названия валют стран и аббревиатуры этих валют */
        list.add(new DataFlags(R.drawable.ru, R.string.russian, R.string.russianRUB,  R.string.capitalRU));
        list.add(new DataFlags(R.drawable.af, R.string.africa, R.string.africaZAR, R.string.capitalAF));
        list.add(new DataFlags(R.drawable.sg, R.string.singapore, R.string.singaporeSGD,  R.string.capitalSG));
        list.add(new DataFlags(R.drawable.tr, R.string.turkish, R.string.turkishTRY, R.string.capitalTR));

        /* Создаём адаптер, который будет передавать данные из List`а в
         * элемент ListView и подключаем его непосредственно к ListView`у
         */
        MyListAdapter myListAdaptery = new MyListAdapter(this, list);
        listView.setAdapter(myListAdaptery);
    }

}